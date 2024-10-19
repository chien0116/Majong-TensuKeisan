package com.example.majongtensukeisan;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class firstgamen extends AppCompatActivity {
    Button buttontw, buttonjp,seiseki;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstgamen);

        buttonjp = findViewById(R.id.jp_button);
        buttontw = findViewById(R.id.tw_button);
        seiseki = findViewById(R.id.seiseki);

        buttonjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转到 MainActivity
                Intent intent = new Intent(firstgamen.this, MainActivity.class);
                startActivity(intent);
            }
        });

        buttontw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转到 taima_main
                Intent intent = new Intent(firstgamen.this, taima_main.class);
                startActivity(intent);
            }
        });

        seiseki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstgamen.this, sennseki.class);
                startActivity(intent);
            }
        });
    }
}
