package com.example.majongtensukeisan;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class houjiutensu extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView8 = findViewById(R.id.textView8);
        EditText editText = findViewById(R.id.editTextNumber);
        Button button19 = findViewById(R.id.button19);


        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentText = editText.getText().toString();
                if (!currentText.isEmpty()) {
                    int minuspoint = Integer.parseInt(currentText);
                    getIntent().putExtra("minuspoint", minuspoint);
                    //Intent returnIntent = new Intent();
                    //returnIntent.putExtra("minuspoint",minuspoint);
                    setResult(Activity.RESULT_OK, getIntent());
                    finish();
                }else {
                    // Handle the case where the EditText was empty
                    Toast.makeText(houjiutensu.this, "請輸入点数", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
