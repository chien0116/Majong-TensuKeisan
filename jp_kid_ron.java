package com.example.majongtensukeisan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class jp_kid_ron extends AppCompatActivity {
    Button mangan, hanemann, baimann, sannbaimann, yakumann, or2400, or4800, or9600, or1500, or2900, or5800,
            or11600, or2000, or3900,or7700,or2400_2,or4800_2,or9600_2,or2900_2,or5800_2,or11600_2,or3400,or6800,
            or3900_2,or7700_2,or4400,or8700,or4800_3,or9600_3,or5300,or10600,button30;
    TextView textView18;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jpkidron);

        mangan = findViewById(R.id.mangan);
        hanemann = findViewById(R.id.hanemann);
        baimann = findViewById(R.id.baimann);
        sannbaimann = findViewById(R.id.sannbaimann);
        yakumann = findViewById(R.id.yakumann);

        or2400 = findViewById(R.id.or2400);
        or4800 = findViewById(R.id.or4800);
        or9600 = findViewById(R.id.or9600);
        or1500 = findViewById(R.id.or1500);
        or2900 = findViewById(R.id.or2900);
        or5800 = findViewById(R.id.or5800);
        or11600 = findViewById(R.id.or11600);
        or2000 = findViewById(R.id.or2000);
        or3900 = findViewById(R.id.or3900);
        or7700 = findViewById(R.id.or7700);
        or2400_2 = findViewById(R.id.or2400_2);
        or4800_2 = findViewById(R.id.or4800_2);
        or9600_2 = findViewById(R.id.or9600_2);
        or2900_2 = findViewById(R.id.or2900_2);
        or5800_2 = findViewById(R.id.or5800_2);
        or11600_2 = findViewById(R.id.or11600_2);
        or3400 = findViewById(R.id.or3400);
        or6800 = findViewById(R.id.or6800);
        or3900_2 = findViewById(R.id.or3900_2);
        or7700_2 = findViewById(R.id.or7700_2);
        or4400 = findViewById(R.id.or4400);
        or8700 = findViewById(R.id.or8700);
        or4800_3 = findViewById(R.id.or4800_3);
        or9600_3 = findViewById(R.id.or9600_3);
        or5300 = findViewById(R.id.or5300);
        or10600 = findViewById(R.id.or10600);
        button30 = findViewById(R.id.button30);
        textView18 = findViewById(R.id.textView18);

        //改變textview
        mangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 將 textView18 的文字設置為 mangan 按鈕的文字
                textView18.setText(mangan.getTag().toString());
            }
        });

        hanemann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 將 textView18 的文字設置為 hanemann 按鈕的文字
                textView18.setText(hanemann.getTag().toString());
            }
        });

        baimann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 將 textView18 的文字設置為 baimann 按鈕的文字
                textView18.setText(baimann.getTag().toString());
            }
        });

        sannbaimann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 將 textView18 的文字設置為 baimann 按鈕的文字
                textView18.setText(sannbaimann.getTag().toString());
            }
        });

        yakumann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 將 textView18 的文字設置為 baimann 按鈕的文字
                textView18.setText(yakumann.getTag().toString());
            }
        });

        baimann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 將 textView18 的文字設置為 baimann 按鈕的文字
                textView18.setText(baimann.getTag().toString());
            }
        });

        or2400.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or2400.getText().toString());
            }
        });

        or4800.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or4800.getText().toString());
            }
        });

        or9600.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or9600.getText().toString());
            }
        });

        or1500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or1500.getText().toString());
            }
        });

        or2900.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or2900.getText().toString());
            }
        });

        or5800.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or5800.getText().toString());
            }
        });

        or11600.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or11600.getText().toString());
            }
        });

        or2000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or2000.getText().toString());
            }
        });

        or3900.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or3900.getText().toString());
            }
        });

        or7700.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or7700.getText().toString());
            }
        });

        or2400_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or2400_2.getText().toString());
            }
        });

        or4800_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or4800_2.getText().toString());
            }
        });

        or9600_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or9600_2.getText().toString());
            }
        });

        or2900_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or2900_2.getText().toString());
            }
        });

        or5800_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or5800_2.getText().toString());
            }
        });

        or11600_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or11600_2.getText().toString());
            }
        });

        or3400.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or3400.getText().toString());
            }
        });

        or6800.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or6800.getText().toString());
            }
        });

        or3900_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or3900_2.getText().toString());
            }
        });

        or7700_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or7700_2.getText().toString());
            }
        });

        or4400.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or4400.getText().toString());
            }
        });

        or8700.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or8700.getText().toString());
            }
        });

        or4800_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or4800_3.getText().toString());
            }
        });

        or9600_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or9600_3.getText().toString());
            }
        });

        or5300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or5300.getText().toString());
            }
        });

        or10600.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18.setText(or10600.getText().toString());
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentText = textView18.getText().toString();
                if (!currentText.isEmpty()) {
                    int minuspoint = Integer.parseInt(currentText);
                    getIntent().putExtra("minuspoint", minuspoint);
                    //Intent returnIntent = new Intent();
                    //returnIntent.putExtra("minuspoint",minuspoint);
                    setResult(Activity.RESULT_OK, getIntent());
                    finish();
                }else {
                    // Handle the case where the EditText was empty
                    Toast.makeText(jp_kid_ron.this, "請輸入点数", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}