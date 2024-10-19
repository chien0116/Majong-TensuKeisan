package com.example.majongtensukeisan;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class kidtsumo extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidtsumo);

        EditText oyaeditText = findViewById(R.id.editTextNumber3);
        EditText kideditText = findViewById(R.id.editTextNumber4);
        Button button21 = findViewById(R.id.button21);

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentText1 = oyaeditText.getText().toString();//親家扣點
                String currentText2 = kideditText.getText().toString();//子家扣點
                if (!currentText1.isEmpty() && !currentText2.isEmpty()) {
                    int tsumopoint1 = Integer.parseInt(currentText1);
                    int tsumopoint2 = Integer.parseInt(currentText2);
                    getIntent().putExtra("tsumopoint1",tsumopoint1);
                    getIntent().putExtra("tsumopoint2",tsumopoint2);
                    setResult(Activity.RESULT_OK, getIntent());
                    finish();
                }else {
                    // Handle the case where the EditText was empty
                    Toast.makeText(kidtsumo.this, "請輸入点数", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
