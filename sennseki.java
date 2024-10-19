package com.example.majongtensukeisan;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class sennseki extends AppCompatActivity {
    Button clear_button,newgame_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sennsekigamen); // 假设这是 SecondActivity 的布局文件

        clear_button = findViewById(R.id.button23);
        newgame_button= findViewById(R.id.button24);

        ListView listView = findViewById(R.id.listview1);

        // 从数据库中获取所有数据并格式化显示
        ScoreDatabaseHelper dbHelper = new ScoreDatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM scores_table", null);

        ArrayList<String> dataList = new ArrayList<>();

        while (cursor.moveToNext()) {
            @SuppressLint("Range") int player1Score = cursor.getInt(cursor.getColumnIndex("p1_score"));
            @SuppressLint("Range") int player2Score = cursor.getInt(cursor.getColumnIndex("p2_score"));
            @SuppressLint("Range") int player3Score = cursor.getInt(cursor.getColumnIndex("p3_score"));
            @SuppressLint("Range") int player4Score = cursor.getInt(cursor.getColumnIndex("p4_score"));
            @SuppressLint("Range") String timestamp = cursor.getString(cursor.getColumnIndex("timestamp"));
            // 将每条数据转换为特定格式并添加到 dataList 中
            String formattedData = "東家:" + player1Score +
                    ", 南家:" + player2Score +
                    ", 西家:" + player3Score +
                    ", 北家:" + player4Score +
                    "\n時間:" + timestamp;
            dataList.add(formattedData);
        }

        cursor.close();
        db.close();

        // 使用 ArrayAdapter 将数据与 ListView 关联
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataList);
        listView.setAdapter(adapter);

        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 获取可写数据库
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                // 清空 scores_table 表中的所有数据
                db.execSQL("DELETE FROM scores_table");

                // 关闭数据库连接
                db.close();

                // 清空 dataList 中的数据并更新 ListView 的显示
                dataList.clear();
                adapter.notifyDataSetChanged();
            }
        });
        //開新局
        newgame_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sennseki.this, firstgamen.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
