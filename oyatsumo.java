package com.example.majongtensukeisan;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class oyatsumo extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        EditText editText = findViewById(R.id.editTextNumber2);
        Button button20 = findViewById(R.id.button20);

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentText = editText.getText().toString();
                if (!currentText.isEmpty()) {
                    int tsumopoint = Integer.parseInt(currentText);
                    getIntent().putExtra("tsumopoint",tsumopoint);

                    setResult(Activity.RESULT_OK, getIntent());
                    finish();
                }else {
                    // Handle the case where the EditText was empty
                    Toast.makeText(oyatsumo.this, "請輸入点数", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
