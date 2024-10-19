package com.example.majongtensukeisan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class taisukeisan extends AppCompatActivity {
    private TextView textViewPrice;
    private Button buttonBanana, buttonApple, buttonOrange;
    private int totalPrice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taisu);

        textViewPrice = findViewById(R.id.textView_price);
        buttonBanana = findViewById(R.id.button_banana);
        buttonApple = findViewById(R.id.button_wind1);
        buttonOrange = findViewById(R.id.button_wind2);

        buttonBanana.setTag(5);
        buttonApple.setTag(10);
        buttonOrange.setTag(20);

        View.OnClickListener buttonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) v;
                int price = (int) button.getTag();

                if (button.isSelected()) {
                    button.setSelected(false);
                    totalPrice -= price;
                    button.setBackgroundTintList(ColorStateList.valueOf(Color.TRANSPARENT)); // Change the button color back to default
                } else {
                    button.setSelected(true);
                    totalPrice += price;
                    button.setBackgroundTintList(getResources().getColorStateList(R.color.red)); // Change the button color to green
                }

                textViewPrice.setText(String.valueOf(totalPrice));
            }
        };

        buttonBanana.setOnClickListener(buttonClickListener);
        buttonApple.setOnClickListener(buttonClickListener);
        buttonOrange.setOnClickListener(buttonClickListener);
    }
}