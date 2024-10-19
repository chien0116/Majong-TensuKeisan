package com.example.majongtensukeisan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView2,textView3,textView5,textView6,textView7,textView4;
    TextView textView9;
    Button button,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button22;
    private boolean isRed1 = false;
    private boolean isRed2 = false;
    private boolean isRed3 = false;
    private boolean isRed4 = false;
    private boolean isTen1 = false;
    private boolean isTen2 = false;
    private boolean isTen3 = false;
    private boolean isTen4 = false;
    private boolean isTenpai = false;
    private  boolean istensa = false;
    private  boolean ron = false;
    int tenint1;
    int tenint2;
    int tenint3;
    int tenint4;
    int tenpaipeople=0;
    int ribosou=0;//供拖立直棒數量
    int bonnbasou=0;//供拖本場棒數量

    int plusperson;//加點的那個人 1~4
    int minusperson;//減點的那個人 1~4

    int oya=1;//莊家 1~4

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);


        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView4 = findViewById(R.id.textView4);
        textView9 = findViewById(R.id.textView77);


        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button22 = findViewById(R.id.button22);

        //4個立直按鈕
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isRed1){
                    button.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                    String currentText = button5.getText().toString();
                    int currentNumber = Integer.parseInt(currentText);
                    int newNumber = currentNumber + 1000;
                    button5.setText(String.valueOf(newNumber));

                    ribosou-=1;
                    textView4.setText(String.valueOf(ribosou));
                }
                else {
                    button.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    String currentText = button5.getText().toString();
                    int currentNumber = Integer.parseInt(currentText);
                    int newNumber = currentNumber - 1000;
                    button5.setText(String.valueOf(newNumber));

                    ribosou+=1;
                    textView4.setText(String.valueOf(ribosou));
                }
                isRed1 = !isRed1;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isRed2){
                    button2.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                    String currentText = button7.getText().toString();
                    int currentNumber = Integer.parseInt(currentText);
                    int newNumber = currentNumber + 1000;
                    button7.setText(String.valueOf(newNumber));

                    ribosou-=1;
                    textView4.setText(String.valueOf(ribosou));
                }
                else {
                    button2.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    String currentText = button7.getText().toString();
                    int currentNumber = Integer.parseInt(currentText);
                    int newNumber = currentNumber - 1000;
                    button7.setText(String.valueOf(newNumber));

                    ribosou+=1;
                    textView4.setText(String.valueOf(ribosou));
                }
                isRed2 = !isRed2;
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isRed3){
                    button3.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                    String currentText = button8.getText().toString();
                    int currentNumber = Integer.parseInt(currentText);
                    int newNumber = currentNumber + 1000;
                    button8.setText(String.valueOf(newNumber));

                    ribosou-=1;
                    textView4.setText(String.valueOf(ribosou));
                }
                else {
                    button3.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    String currentText = button8.getText().toString();
                    int currentNumber = Integer.parseInt(currentText);
                    int newNumber = currentNumber - 1000;
                    button8.setText(String.valueOf(newNumber));

                    ribosou+=1;
                    textView4.setText(String.valueOf(ribosou));
                }
                isRed3 = !isRed3;
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isRed4){
                    button4.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                    String currentText = button6.getText().toString();
                    int currentNumber = Integer.parseInt(currentText);
                    int newNumber = currentNumber + 1000;
                    button6.setText(String.valueOf(newNumber));

                    ribosou-=1;
                    textView4.setText(String.valueOf(ribosou));
                }
                else {
                    button4.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    String currentText = button6.getText().toString();
                    int currentNumber = Integer.parseInt(currentText);
                    int newNumber = currentNumber - 1000;
                    button6.setText(String.valueOf(newNumber));

                    ribosou+=1;
                    textView4.setText(String.valueOf(ribosou));
                }
                isRed4 = !isRed4;
            }
        });

        //點差按鈕------------------------------------------------------------------------
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(istensa) {
                    button5.setText(String.valueOf(tenint1));
                    button6.setText(String.valueOf(tenint2));
                    button7.setText(String.valueOf(tenint3));
                    button8.setText(String.valueOf(tenint4));
                }
                else {
                    String ten1 = button5.getText().toString();
                    String ten2 = button6.getText().toString();
                    String ten3 = button7.getText().toString();
                    String ten4 = button8.getText().toString();
                    tenint1 = Integer.parseInt(ten1);//放真實點數箱子
                    tenint2 = Integer.parseInt(ten2);
                    tenint3 = Integer.parseInt(ten3);
                    tenint4 = Integer.parseInt(ten4);
                    int tensa1 = tenint2 - tenint1;
                    int tensa2 = tenint3 - tenint1;
                    int tensa3 = tenint4 - tenint1;

                    button5.setText("0");
                    button6.setText(String.valueOf(tensa1));
                    button7.setText(String.valueOf(tensa2));
                    button8.setText(String.valueOf(tensa3));
                }
                istensa = !istensa;
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(istensa) {
                    button5.setText(String.valueOf(tenint1));
                    button6.setText(String.valueOf(tenint2));
                    button7.setText(String.valueOf(tenint3));
                    button8.setText(String.valueOf(tenint4));
                }
                else {
                    String ten1 = button5.getText().toString();
                    String ten2 = button6.getText().toString();
                    String ten3 = button7.getText().toString();
                    String ten4 = button8.getText().toString();
                    tenint1 = Integer.parseInt(ten1);//放真實點數箱子
                    tenint2 = Integer.parseInt(ten2);
                    tenint3 = Integer.parseInt(ten3);
                    tenint4 = Integer.parseInt(ten4);
                    int tensa1 = tenint1 - tenint2;
                    int tensa2 = tenint3 - tenint2;
                    int tensa3 = tenint4 - tenint2;

                    button6.setText("0");
                    button5.setText(String.valueOf(tensa1));
                    button7.setText(String.valueOf(tensa2));
                    button8.setText(String.valueOf(tensa3));
                }
                istensa = !istensa;
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(istensa) {
                    button5.setText(String.valueOf(tenint1));
                    button6.setText(String.valueOf(tenint2));
                    button7.setText(String.valueOf(tenint3));
                    button8.setText(String.valueOf(tenint4));
                }
                else {
                    String ten1 = button5.getText().toString();
                    String ten2 = button6.getText().toString();
                    String ten3 = button7.getText().toString();
                    String ten4 = button8.getText().toString();
                    tenint1 = Integer.parseInt(ten1);//放真實點數箱子
                    tenint2 = Integer.parseInt(ten2);
                    tenint3 = Integer.parseInt(ten3);
                    tenint4 = Integer.parseInt(ten4);
                    int tensa1 = tenint1 - tenint3;
                    int tensa2 = tenint2 - tenint3;
                    int tensa3 = tenint4 - tenint3;

                    button7.setText("0");
                    button5.setText(String.valueOf(tensa1));
                    button6.setText(String.valueOf(tensa2));
                    button8.setText(String.valueOf(tensa3));
                }
                istensa = !istensa;
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(istensa) {
                    button5.setText(String.valueOf(tenint1));
                    button6.setText(String.valueOf(tenint2));
                    button7.setText(String.valueOf(tenint3));
                    button8.setText(String.valueOf(tenint4));
                }
                else {
                    String ten1 = button5.getText().toString();
                    String ten2 = button6.getText().toString();
                    String ten3 = button7.getText().toString();
                    String ten4 = button8.getText().toString();
                    tenint1 = Integer.parseInt(ten1);//放真實點數箱子
                    tenint2 = Integer.parseInt(ten2);
                    tenint3 = Integer.parseInt(ten3);
                    tenint4 = Integer.parseInt(ten4);
                    int tensa1 = tenint1 - tenint4;
                    int tensa2 = tenint2 - tenint4;
                    int tensa3 = tenint3 - tenint4;

                    button8.setText("0");
                    button5.setText(String.valueOf(tensa1));
                    button6.setText(String.valueOf(tensa2));
                    button7.setText(String.valueOf(tensa3));
                }
                istensa = !istensa;
            }
        });

        //榮和--------------------------------------------------------------------------------------
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getTag().equals(1)){
                    minusperson = 1;
                    if(plusperson == oya){
                        Intent intent = new Intent(MainActivity.this, jp_oya_ron.class);
                        startActivityForResult(intent,1);
                    }
                    else {
                        //轉移至點數介面
                        Intent intent = new Intent(MainActivity.this, jp_kid_ron.class);
                        startActivityForResult(intent, 1);
                    }
                }
                else if(ron){
                    button11.setText("ロン");
                    button13.setText("ロン");
                    button15.setText("ロン");
                    button11.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button13.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button15.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button9.setText("ロン");
                    button9.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button11.setTag(0);
                    button13.setTag(0);
                    button15.setTag(0);
                }
                else{
                    plusperson = 1;//加點人
                    button11.setText("放銃");
                    button13.setText("放銃");
                    button15.setText("放銃");
                    button11.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    button13.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    button15.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    button9.setText("戻る");
                    button9.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                    button11.setTag(1);
                    button13.setTag(1);
                    button15.setTag(1);
                }
                ron = !ron;
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getTag().equals(1)){
                    minusperson = 3;
                    if(plusperson == oya){
                        Intent intent = new Intent(MainActivity.this, jp_oya_ron.class);
                        startActivityForResult(intent,1);
                    }
                    else {
                        //轉移至點數介面
                        Intent intent = new Intent(MainActivity.this, jp_kid_ron.class);
                        startActivityForResult(intent, 1);
                    }
                }
                else if(ron){
                    button9.setText("ロン");
                    button13.setText("ロン");
                    button15.setText("ロン");
                    button9.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button13.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button15.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button11.setText("ロン");
                    button11.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button9.setTag(0);
                    button13.setTag(0);
                    button15.setTag(0);
                }
                else{
                    plusperson = 3;//加點人
                    button9.setText("放銃");
                    button13.setText("放銃");
                    button15.setText("放銃");
                    button9.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    button13.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    button15.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    button11.setText("戻る");
                    button11.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                    button9.setTag(1);
                    button13.setTag(1);
                    button15.setTag(1);
                }
                ron = !ron;
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getTag().equals(1)){
                    minusperson = 2;
                    if(plusperson == oya){
                        Intent intent = new Intent(MainActivity.this, jp_oya_ron.class);
                        startActivityForResult(intent,1);
                    }
                    else {
                        //轉移至點數介面
                        Intent intent = new Intent(MainActivity.this, jp_kid_ron.class);
                        startActivityForResult(intent, 1);
                    }
                }
                else if(ron){
                    button9.setText("ロン");
                    button13.setText("ロン");
                    button15.setText("ロン");
                    button9.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button13.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button15.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button11.setText("ロン");
                    button11.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button9.setTag(0);
                    button13.setTag(0);
                    button15.setTag(0);
                }
                else{
                    plusperson = 2;//加點人
                    button9.setText("放銃");
                    button11.setText("放銃");
                    button15.setText("放銃");
                    button9.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    button11.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    button15.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    button13.setText("戻る");
                    button13.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                    button9.setTag(1);
                    button11.setTag(1);
                    button15.setTag(1);
                }
                ron = !ron;
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getTag().equals(1)){
                    minusperson = 4;
                    if(plusperson == oya){
                        Intent intent = new Intent(MainActivity.this, jp_oya_ron.class);
                        startActivityForResult(intent,1);
                    }
                    else {
                        //轉移至點數介面
                        Intent intent = new Intent(MainActivity.this, jp_kid_ron.class);
                        startActivityForResult(intent, 1);
                    }
                }
                else if(ron){
                    button9.setText("ロン");
                    button13.setText("ロン");
                    button15.setText("ロン");
                    button9.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button13.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button15.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button11.setText("ロン");
                    button11.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                    button9.setTag(0);
                    button13.setTag(0);
                    button15.setTag(0);
                }
                else{
                    plusperson = 4;//加點人
                    button9.setText("放銃");
                    button13.setText("放銃");
                    button11.setText("放銃");
                    button9.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    button13.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    button11.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    button15.setText("戻る");
                    button15.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                    button9.setTag(1);
                    button13.setTag(1);
                    button11.setTag(1);
                }
                ron = !ron;
            }
        });

        //自摸按鈕-----------------------------------------------------------------------------------
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isTenpai == true){
                    if(isTen1==false) {
                        button10.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                        button10.setText("聴牌");
                        isTen1=!isTen1;
                        tenpaipeople+=1;
                    }else{
                        button10.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                        button10.setText("X");
                        isTen1=!isTen1;
                        tenpaipeople-=1;
                    }
                }else {
                    plusperson = 1;
                    if (plusperson == oya) {//莊家自摸畫面
                        Intent intent = new Intent(MainActivity.this, jpoyatsumo.class);
                        startActivityForResult(intent, 2);
                    } else {//子家自摸畫面
                        Intent intent = new Intent(MainActivity.this, jpkidtsumo.class);
                        startActivityForResult(intent, 3);
                    }
                }
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isTenpai == true){
                    if(isTen2==false) {
                        button14.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                        button14.setText("聴牌");
                        isTen2=!isTen2;
                        tenpaipeople+=1;
                    }else{
                        button14.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                        button14.setText("X");
                        isTen2=!isTen2;
                        tenpaipeople-=1;
                    }
                }else {
                    plusperson = 2;
                    if (plusperson == oya) {//莊家自摸畫面
                        Intent intent = new Intent(MainActivity.this, jpoyatsumo.class);
                        startActivityForResult(intent, 2);
                    } else {//子家自摸畫面
                        Intent intent = new Intent(MainActivity.this, jpkidtsumo.class);
                        startActivityForResult(intent, 3);
                    }
                }
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isTenpai == true){
                    if(isTen3==false) {
                        button12.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                        button12.setText("聴牌");
                        isTen3=!isTen3;
                        tenpaipeople+=1;
                    }else{
                        button12.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                        button12.setText("X");
                        isTen3=!isTen3;
                        tenpaipeople-=1;
                    }
                }else {
                    plusperson = 3;
                    if (plusperson == oya) {//莊家自摸畫面
                        Intent intent = new Intent(MainActivity.this, jpoyatsumo.class);
                        startActivityForResult(intent, 2);
                    } else {//子家自摸畫面
                        Intent intent = new Intent(MainActivity.this, jpkidtsumo.class);
                        startActivityForResult(intent, 3);
                    }
                }
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isTenpai == true){
                    if(isTen4==false) {
                        button16.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                        button16.setText("聴牌");
                        isTen4=!isTen4;
                        tenpaipeople+=1;
                    }else{
                        button16.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                        button16.setText("X");
                        isTen4=!isTen4;
                        tenpaipeople-=1;
                    }
                }else {
                    plusperson = 4;
                    if (plusperson == oya) {//莊家自摸畫面
                        Intent intent = new Intent(MainActivity.this, jpoyatsumo.class);
                        startActivityForResult(intent, 2);
                    } else {//子家自摸畫面
                        Intent intent = new Intent(MainActivity.this, jpkidtsumo.class);
                        startActivityForResult(intent, 3);
                    }
                }
            }
        });

        //重製按鈕
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isRed1 = false;//清除立直狀態
                isRed2 = false;
                isRed3 = false;
                isRed4 = false;
                button.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                button2.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                button3.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                button4.setBackgroundTintList(getResources().getColorStateList(R.color.gray));

                button9.setText("ロン");
                button11.setText("ロン");
                button13.setText("ロン");
                button15.setText("ロン");
                button9.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                button11.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                button13.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                button15.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
                button9.setTag(0);
                button11.setTag(0);
                button13.setTag(0);
                button15.setTag(0);

                istensa=false;
                ron=false;
                ribosou=0;
                textView4.setText(String.valueOf(ribosou));
                bonnbasou=0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("東一局");

                button5.setText("25000");
                button6.setText("25000");
                button7.setText("25000");
                button8.setText("25000");

                textView3.setText("東");
                oya = 1;
                textView5.setText("南");
                textView6.setText("西");
                textView7.setText("北");
                textView3.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView5.setTextColor(getResources().getColorStateList(R.color.black));
                textView6.setTextColor(getResources().getColorStateList(R.color.black));
                textView7.setTextColor(getResources().getColorStateList(R.color.black));
            }
        });
        //結算----------------------------------------------------------------------------------
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 获取当前时间戳
                long timestamp = System.currentTimeMillis();

                // 将时间戳转换为可读的时间格式（可选）
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
                sdf.setTimeZone(TimeZone.getTimeZone("Asia/Taipei")); // 设置台湾时区
                String currentTime = sdf.format(new Date(timestamp));

                String p1Score = button5.getText().toString();
                String p2Score = button6.getText().toString();
                String p3Score = button7.getText().toString();
                String p4Score = button8.getText().toString();
                // 将分数保存到数据库中
                ScoreDatabaseHelper dbHelper = new ScoreDatabaseHelper(getApplicationContext());
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                ContentValues values = new ContentValues();
                values.put("p1_score", Integer.parseInt(p1Score));
                values.put("p2_score", Integer.parseInt(p2Score));
                values.put("p3_score", Integer.parseInt(p3Score));
                values.put("p4_score", Integer.parseInt(p4Score));
                values.put("timestamp", currentTime); // 在这里使用时间戳列名

                // 插入数据
                db.insert("scores_table", null, values);

                // 关闭数据库连接
                db.close();

                // 跳转到第二个界面
                Intent intent = new Intent(MainActivity.this, sennseki.class);
                startActivity(intent);
            }
        });

        //流局
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isTenpai == false) {
                    button17.setBackgroundTintList(getResources().getColorStateList(R.color.red));
                    button17.setText("確定");

                    button10.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                    button12.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                    button14.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                    button16.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                    button10.setText("X");
                    button12.setText("X");
                    button14.setText("X");
                    button16.setText("X");
                    isTenpai = !isTenpai;//true
                }else{
                    button17.setBackgroundTintList(null);
                    button17.setText("流局");

                    button10.setBackgroundTintList(getResources().getColorStateList(R.color.purple));
                    button12.setBackgroundTintList(getResources().getColorStateList(R.color.purple));
                    button14.setBackgroundTintList(getResources().getColorStateList(R.color.purple));
                    button16.setBackgroundTintList(getResources().getColorStateList(R.color.purple));
                    button10.setText("ツモ");
                    button12.setText("ツモ");
                    button14.setText("ツモ");
                    button16.setText("ツモ");


                    if(tenpaipeople==0){

                        bonnbasou += 1;
                        textView9.setText(String.valueOf(bonnbasou));//+一本場

                        isRed1 = false;//清除立直狀態
                        isRed2 = false;
                        isRed3 = false;
                        isRed4 = false;
                        button.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                        button2.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                        button3.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
                        button4.setBackgroundTintList(getResources().getColorStateList(R.color.gray));

                        if (textView2.getText().toString().equals("東一局")) {//局數推進
                            textView2.setText("東二局");
                            textView3.setText("北");
                            textView5.setText("東");
                            oya = 2;
                            textView6.setText("南");
                            textView7.setText("西");
                            textView5.setTextColor(getResources().getColorStateList(R.color.oyared));
                            textView3.setTextColor(getResources().getColorStateList(R.color.black));
                        } else if (textView2.getText().toString().equals("東二局")) {
                            textView2.setText("東三局");
                            textView3.setText("西");
                            textView5.setText("北");
                            textView6.setText("東");
                            oya = 3;
                            textView7.setText("南");
                            textView6.setTextColor(getResources().getColorStateList(R.color.oyared));
                            textView5.setTextColor(getResources().getColorStateList(R.color.black));
                        } else if (textView2.getText().toString().equals("東三局")) {
                            textView2.setText("東四局");
                            textView3.setText("南");
                            textView5.setText("西");
                            textView6.setText("北");
                            textView7.setText("東");
                            oya = 4;
                            textView7.setTextColor(getResources().getColorStateList(R.color.oyared));
                            textView6.setTextColor(getResources().getColorStateList(R.color.black));
                        } else if (textView2.getText().toString().equals("東四局")) {
                            textView2.setText("南一局");
                            textView3.setText("東");
                            oya = 1;
                            textView5.setText("南");
                            textView6.setText("西");
                            textView7.setText("北");
                            textView3.setTextColor(getResources().getColorStateList(R.color.oyared));
                            textView7.setTextColor(getResources().getColorStateList(R.color.black));
                        } else if (textView2.getText().toString().equals("南一局")) {
                            textView2.setText("南二局");
                            textView3.setText("北");
                            textView5.setText("東");
                            oya = 2;
                            textView6.setText("南");
                            textView7.setText("西");
                            textView5.setTextColor(getResources().getColorStateList(R.color.oyared));
                            textView3.setTextColor(getResources().getColorStateList(R.color.black));
                        } else if (textView2.getText().toString().equals("南二局")) {
                            textView2.setText("南三局");
                            textView3.setText("西");
                            textView5.setText("北");
                            textView6.setText("東");
                            oya = 3;
                            textView7.setText("南");
                            textView6.setTextColor(getResources().getColorStateList(R.color.oyared));
                            textView5.setTextColor(getResources().getColorStateList(R.color.black));
                        } else if (textView2.getText().toString().equals("南三局")) {
                            textView2.setText("南四局");
                            textView3.setText("南");
                            textView5.setText("西");
                            textView6.setText("北");
                            textView7.setText("東");
                            oya = 4;
                            textView7.setTextColor(getResources().getColorStateList(R.color.oyared));
                            textView6.setTextColor(getResources().getColorStateList(R.color.black));
                        }
                    }

                    else if(tenpaipeople==1){//一個人聽牌
                        //如果oya聽牌+3000 剩下-1500 連莊
                        if(oya==1 && isTen1==true){
                            String ten1 = button5.getText().toString();
                            int plusp = Integer.parseInt(ten1);
                            int plusend = plusp + 3000;
                            button5.setText(String.valueOf(plusend));

                            String ten2 = button6.getText().toString();
                            int plusp2 = Integer.parseInt(ten2);
                            int plusend2 = plusp2 - 1000;
                            button6.setText(String.valueOf(plusend2));

                            String ten3 = button7.getText().toString();
                            int plusp3 = Integer.parseInt(ten3);
                            int plusend3 = plusp3 - 1000;
                            button7.setText(String.valueOf(plusend3));

                            String ten4 = button8.getText().toString();
                            int plusp4 = Integer.parseInt(ten4);
                            int plusend4 = plusp4 - 1000;
                            button8.setText(String.valueOf(plusend4));

                            isTen1 = false;
                            tenpaipeople=0;
                        }
                        else if(oya==2 && isTen2==true){
                            String ten1 = button6.getText().toString();
                            int plusp = Integer.parseInt(ten1);
                            int plusend = plusp + 3000;
                            button6.setText(String.valueOf(plusend));

                            String ten2 = button5.getText().toString();
                            int plusp2 = Integer.parseInt(ten2);
                            int plusend2 = plusp2 - 1000;
                            button5.setText(String.valueOf(plusend2));

                            String ten3 = button7.getText().toString();
                            int plusp3 = Integer.parseInt(ten3);
                            int plusend3 = plusp3 - 1000;
                            button7.setText(String.valueOf(plusend3));

                            String ten4 = button8.getText().toString();
                            int plusp4 = Integer.parseInt(ten4);
                            int plusend4 = plusp4 - 1000;
                            button8.setText(String.valueOf(plusend4));

                            isTen2 = false;
                            tenpaipeople=0;
                        }
                        else if(oya==3 && isTen3==true){
                            String ten1 = button7.getText().toString();
                            int plusp = Integer.parseInt(ten1);
                            int plusend = plusp + 3000;
                            button7.setText(String.valueOf(plusend));

                            String ten2 = button5.getText().toString();
                            int plusp2 = Integer.parseInt(ten2);
                            int plusend2 = plusp2 - 1000;
                            button5.setText(String.valueOf(plusend2));

                            String ten3 = button6.getText().toString();
                            int plusp3 = Integer.parseInt(ten3);
                            int plusend3 = plusp3 - 1000;
                            button6.setText(String.valueOf(plusend3));

                            String ten4 = button8.getText().toString();
                            int plusp4 = Integer.parseInt(ten4);
                            int plusend4 = plusp4 - 1000;
                            button8.setText(String.valueOf(plusend4));

                            isTen3 = false;
                            tenpaipeople=0;
                        }
                        else if(oya==4 && isTen4==true){
                            String ten1 = button8.getText().toString();
                            int plusp = Integer.parseInt(ten1);
                            int plusend = plusp + 3000;
                            button8.setText(String.valueOf(plusend));

                            String ten2 = button5.getText().toString();
                            int plusp2 = Integer.parseInt(ten2);
                            int plusend2 = plusp2 - 1000;
                            button5.setText(String.valueOf(plusend2));

                            String ten3 = button7.getText().toString();
                            int plusp3 = Integer.parseInt(ten3);
                            int plusend3 = plusp3 - 1000;
                            button7.setText(String.valueOf(plusend3));

                            String ten4 = button6.getText().toString();
                            int plusp4 = Integer.parseInt(ten4);
                            int plusend4 = plusp4 - 1000;
                            button6.setText(String.valueOf(plusend4));

                            isTen4 = false;
                            tenpaipeople=0;
                        }
                        //如果子家聽牌+3000 剩下-1500 局數推進
                        else{
                            if(isTen1==true){
                                String ten1 = button5.getText().toString();
                                int plusp = Integer.parseInt(ten1);
                                int plusend = plusp + 3000;
                                button5.setText(String.valueOf(plusend));

                                String ten2 = button6.getText().toString();
                                int plusp2 = Integer.parseInt(ten2);
                                int plusend2 = plusp2 - 1000;
                                button6.setText(String.valueOf(plusend2));

                                String ten3 = button7.getText().toString();
                                int plusp3 = Integer.parseInt(ten3);
                                int plusend3 = plusp3 - 1000;
                                button7.setText(String.valueOf(plusend3));

                                String ten4 = button8.getText().toString();
                                int plusp4 = Integer.parseInt(ten4);
                                int plusend4 = plusp4 - 1000;
                                button8.setText(String.valueOf(plusend4));

                                isTen1 = false;
                                tenpaipeople=0;
                            }
                            else if(isTen2==true){
                                String ten1 = button6.getText().toString();
                                int plusp = Integer.parseInt(ten1);
                                int plusend = plusp + 3000;
                                button6.setText(String.valueOf(plusend));

                                String ten2 = button5.getText().toString();
                                int plusp2 = Integer.parseInt(ten2);
                                int plusend2 = plusp2 - 1000;
                                button5.setText(String.valueOf(plusend2));

                                String ten3 = button7.getText().toString();
                                int plusp3 = Integer.parseInt(ten3);
                                int plusend3 = plusp3 - 1000;
                                button7.setText(String.valueOf(plusend3));

                                String ten4 = button8.getText().toString();
                                int plusp4 = Integer.parseInt(ten4);
                                int plusend4 = plusp4 - 1000;
                                button8.setText(String.valueOf(plusend4));

                                isTen2 = false;
                                tenpaipeople=0;
                            }
                            else if(isTen3==true){
                                String ten1 = button7.getText().toString();
                                int plusp = Integer.parseInt(ten1);
                                int plusend = plusp + 3000;
                                button7.setText(String.valueOf(plusend));

                                String ten2 = button6.getText().toString();
                                int plusp2 = Integer.parseInt(ten2);
                                int plusend2 = plusp2 - 1000;
                                button6.setText(String.valueOf(plusend2));

                                String ten3 = button5.getText().toString();
                                int plusp3 = Integer.parseInt(ten3);
                                int plusend3 = plusp3 - 1000;
                                button5.setText(String.valueOf(plusend3));

                                String ten4 = button8.getText().toString();
                                int plusp4 = Integer.parseInt(ten4);
                                int plusend4 = plusp4 - 1000;
                                button8.setText(String.valueOf(plusend4));

                                isTen3 = false;
                                tenpaipeople=0;
                            }
                            else if(isTen4==true){
                                String ten1 = button8.getText().toString();
                                int plusp = Integer.parseInt(ten1);
                                int plusend = plusp + 3000;
                                button8.setText(String.valueOf(plusend));

                                String ten2 = button6.getText().toString();
                                int plusp2 = Integer.parseInt(ten2);
                                int plusend2 = plusp2 - 1000;
                                button6.setText(String.valueOf(plusend2));

                                String ten3 = button7.getText().toString();
                                int plusp3 = Integer.parseInt(ten3);
                                int plusend3 = plusp3 - 1000;
                                button7.setText(String.valueOf(plusend3));

                                String ten4 = button5.getText().toString();
                                int plusp4 = Integer.parseInt(ten4);
                                int plusend4 = plusp4 - 1000;
                                button5.setText(String.valueOf(plusend4));

                                isTen4 = false;
                                tenpaipeople=0;
                            }

                            if (textView2.getText().toString().equals("東一局")) {//局數推進
                                textView2.setText("東二局");
                                textView3.setText("北");
                                textView5.setText("東");
                                oya = 2;
                                textView6.setText("南");
                                textView7.setText("西");
                                textView5.setTextColor(getResources().getColorStateList(R.color.oyared));
                                textView3.setTextColor(getResources().getColorStateList(R.color.black));
                            } else if (textView2.getText().toString().equals("東二局")) {
                                textView2.setText("東三局");
                                textView3.setText("西");
                                textView5.setText("北");
                                textView6.setText("東");
                                oya = 3;
                                textView7.setText("南");
                                textView6.setTextColor(getResources().getColorStateList(R.color.oyared));
                                textView5.setTextColor(getResources().getColorStateList(R.color.black));
                            } else if (textView2.getText().toString().equals("東三局")) {
                                textView2.setText("東四局");
                                textView3.setText("南");
                                textView5.setText("西");
                                textView6.setText("北");
                                textView7.setText("東");
                                oya = 4;
                                textView7.setTextColor(getResources().getColorStateList(R.color.oyared));
                                textView6.setTextColor(getResources().getColorStateList(R.color.black));
                            } else if (textView2.getText().toString().equals("東四局")) {
                                textView2.setText("南一局");
                                textView3.setText("東");
                                oya = 1;
                                textView5.setText("南");
                                textView6.setText("西");
                                textView7.setText("北");
                                textView3.setTextColor(getResources().getColorStateList(R.color.oyared));
                                textView7.setTextColor(getResources().getColorStateList(R.color.black));
                            } else if (textView2.getText().toString().equals("南一局")) {
                                textView2.setText("南二局");
                                textView3.setText("北");
                                textView5.setText("東");
                                oya = 2;
                                textView6.setText("南");
                                textView7.setText("西");
                                textView5.setTextColor(getResources().getColorStateList(R.color.oyared));
                                textView3.setTextColor(getResources().getColorStateList(R.color.black));
                            } else if (textView2.getText().toString().equals("南二局")) {
                                textView2.setText("南三局");
                                textView3.setText("西");
                                textView5.setText("北");
                                textView6.setText("東");
                                oya = 3;
                                textView7.setText("南");
                                textView6.setTextColor(getResources().getColorStateList(R.color.oyared));
                                textView5.setTextColor(getResources().getColorStateList(R.color.black));
                            } else if (textView2.getText().toString().equals("南三局")) {
                                textView2.setText("南四局");
                                textView3.setText("南");
                                textView5.setText("西");
                                textView6.setText("北");
                                textView7.setText("東");
                                oya = 4;
                                textView7.setTextColor(getResources().getColorStateList(R.color.oyared));
                                textView6.setTextColor(getResources().getColorStateList(R.color.black));
                            }

                        }
                    }
                    else if(tenpaipeople==2){
                        //如果oya聽牌+1500 另一+1500 剩下-1500 連莊

                        //如果都子家聽牌+1500 其他-1500 局數推進
                    }
                    else if(tenpaipeople==3){
                        //如果oya聽牌+1000 其他+1000 唯一-3000 連莊
                        //如果都子家聽牌+1000 莊家-3000 局數推進
                    }
                    else if(tenpaipeople==4){
                        //如果oya聽牌 連莊
                    }

                    isTenpai = !isTenpai;
                }

            }
        });
    }

    //資料回傳-------------------------------------------------------------------------------
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == Activity.RESULT_OK) { //一家放一家

            button9.setText("ロン");
            button11.setText("ロン");
            button13.setText("ロン");
            button15.setText("ロン");
            button9.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
            button11.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
            button13.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
            button15.setBackgroundTintList(getResources().getColorStateList(R.color.blue));
            button9.setTag(0);
            button11.setTag(0);
            button13.setTag(0);
            button15.setTag(0);

            isRed1 = false;//清除立直狀態
            isRed2 = false;
            isRed3 = false;
            isRed4 = false;
            button.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
            button2.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
            button3.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
            button4.setBackgroundTintList(getResources().getColorStateList(R.color.gray));

            int minuspoint = data.getIntExtra("minuspoint", 0);
            // 更新textview1和textview2的值
            if (plusperson == 1) {
                String ten1 = button5.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp + minuspoint + ribosou * 1000 + bonnbasou * 300;//+供拖
                button5.setText(String.valueOf(plusend));
                ribosou = 0;//供拖歸零
                textView4.setText(String.valueOf(ribosou));
            }
            if (plusperson == 2) {
                String ten1 = button6.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp + minuspoint + ribosou * 1000 + bonnbasou * 300;
                button6.setText(String.valueOf(plusend));
                ribosou = 0;//供拖歸零
                textView4.setText(String.valueOf(ribosou));
            }
            if (plusperson == 3) {
                String ten1 = button7.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp + minuspoint + ribosou * 1000 + bonnbasou * 300;
                button7.setText(String.valueOf(plusend));
                ribosou = 0;//供拖歸零
                textView4.setText(String.valueOf(ribosou));
            }
            if (plusperson == 4) {
                String ten1 = button8.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp + minuspoint + ribosou * 1000 + bonnbasou * 300;
                button8.setText(String.valueOf(plusend));
                ribosou = 0;//供拖歸零
                textView4.setText(String.valueOf(ribosou));
            }

            //扣點部分
            if (minusperson == 1) {
                String ten1 = button5.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp - minuspoint - bonnbasou * 300;
                button5.setText(String.valueOf(plusend));
            }
            if (minusperson == 2) {
                String ten1 = button6.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp - minuspoint - bonnbasou * 300;
                button6.setText(String.valueOf(plusend));
            }
            if (minusperson == 3) {
                String ten1 = button7.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp - minuspoint - bonnbasou * 300;
                button7.setText(String.valueOf(plusend));
            }
            if (minusperson == 4) {
                String ten1 = button8.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp - minuspoint - bonnbasou * 300;
                button8.setText(String.valueOf(plusend));
            }


            if (plusperson == oya) {//連莊
                bonnbasou += 1;
                textView9.setText(String.valueOf(bonnbasou));//+一本場
            } else if (textView2.getText().toString().equals("東一局")) {//局數推進
                bonnbasou = 0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("東二局");
                textView3.setText("北");
                textView5.setText("東");
                oya = 2;
                textView6.setText("南");
                textView7.setText("西");
                textView5.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView3.setTextColor(getResources().getColorStateList(R.color.black));
            } else if (textView2.getText().toString().equals("東二局")) {
                bonnbasou = 0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("東三局");
                textView3.setText("西");
                textView5.setText("北");
                textView6.setText("東");
                oya = 3;
                textView7.setText("南");
                textView6.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView5.setTextColor(getResources().getColorStateList(R.color.black));
            } else if (textView2.getText().toString().equals("東三局")) {
                bonnbasou = 0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("東四局");
                textView3.setText("南");
                textView5.setText("西");
                textView6.setText("北");
                textView7.setText("東");
                oya = 4;
                textView7.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView6.setTextColor(getResources().getColorStateList(R.color.black));
            } else if (textView2.getText().toString().equals("東四局")) {
                bonnbasou = 0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("南一局");
                textView3.setText("東");
                oya = 1;
                textView5.setText("南");
                textView6.setText("西");
                textView7.setText("北");
                textView3.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView7.setTextColor(getResources().getColorStateList(R.color.black));
            } else if (textView2.getText().toString().equals("南一局")) {
                bonnbasou = 0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("南二局");
                textView3.setText("北");
                textView5.setText("東");
                oya = 2;
                textView6.setText("南");
                textView7.setText("西");
                textView5.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView3.setTextColor(getResources().getColorStateList(R.color.black));
            } else if (textView2.getText().toString().equals("南二局")) {
                bonnbasou = 0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("南三局");
                textView3.setText("西");
                textView5.setText("北");
                textView6.setText("東");
                oya = 3;
                textView7.setText("南");
                textView6.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView5.setTextColor(getResources().getColorStateList(R.color.black));
            } else if (textView2.getText().toString().equals("南三局")) {
                bonnbasou = 0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("南四局");
                textView3.setText("南");
                textView5.setText("西");
                textView6.setText("北");
                textView7.setText("東");
                oya = 4;
                textView7.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView6.setTextColor(getResources().getColorStateList(R.color.black));
            }
        }


        else if(requestCode == 2 && resultCode == Activity.RESULT_OK) {//莊家自摸
            isRed1 = false;//清除立直狀態
            isRed2 = false;
            isRed3 = false;
            isRed4 = false;
            button.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
            button2.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
            button3.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
            button4.setBackgroundTintList(getResources().getColorStateList(R.color.gray));

            int tsumopoint = data.getIntExtra("tsumopoint", 0);

            if (plusperson == 1) {
                String ten1 = button5.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp + tsumopoint*3 + ribosou * 1000 + bonnbasou * 300;//+供拖
                button5.setText(String.valueOf(plusend));

                String ten2 = button6.getText().toString();
                int min1 = Integer.parseInt(ten2);
                int min2 = min1 - tsumopoint - bonnbasou * 100;
                button6.setText(String.valueOf(min2));

                String ten3 = button7.getText().toString();
                int min11 = Integer.parseInt(ten3);
                int min21 = min11 - tsumopoint - bonnbasou * 100;
                button7.setText(String.valueOf(min21));

                String ten4 = button8.getText().toString();
                int min12 = Integer.parseInt(ten4);
                int min22 = min12 - tsumopoint - bonnbasou * 100;
                button8.setText(String.valueOf(min22));
            }
            else if (plusperson == 2) {
                String ten1 = button6.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp + tsumopoint*3 + ribosou * 1000 + bonnbasou * 300;//+供拖
                button6.setText(String.valueOf(plusend));

                String ten2 = button5.getText().toString();
                int min1 = Integer.parseInt(ten2);
                int min2 = min1 - tsumopoint - bonnbasou * 100;
                button5.setText(String.valueOf(min2));

                String ten3 = button7.getText().toString();
                int min11 = Integer.parseInt(ten3);
                int min21 = min11 - tsumopoint - bonnbasou * 100;
                button7.setText(String.valueOf(min21));

                String ten4 = button8.getText().toString();
                int min12 = Integer.parseInt(ten4);
                int min22 = min12 - tsumopoint - bonnbasou * 100;
                button8.setText(String.valueOf(min22));
            }
            else if (plusperson == 3) {
                String ten1 = button7.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp + tsumopoint*3 + ribosou * 1000 + bonnbasou * 300;//+供拖
                button7.setText(String.valueOf(plusend));

                String ten2 = button5.getText().toString();
                int min1 = Integer.parseInt(ten2);
                int min2 = min1 - tsumopoint - bonnbasou * 100;
                button5.setText(String.valueOf(min2));

                String ten3 = button6.getText().toString();
                int min11 = Integer.parseInt(ten3);
                int min21 = min11 - tsumopoint - bonnbasou * 100;
                button6.setText(String.valueOf(min21));

                String ten4 = button8.getText().toString();
                int min12 = Integer.parseInt(ten4);
                int min22 = min12 - tsumopoint - bonnbasou * 100;
                button8.setText(String.valueOf(min22));
            }
            else if (plusperson == 4) {
                String ten1 = button8.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp + tsumopoint * 3 + ribosou * 1000 + bonnbasou * 300;//+供拖
                button8.setText(String.valueOf(plusend));

                String ten2 = button5.getText().toString();
                int min1 = Integer.parseInt(ten2);
                int min2 = min1 - tsumopoint - bonnbasou * 100;
                button5.setText(String.valueOf(min2));

                String ten3 = button6.getText().toString();
                int min11 = Integer.parseInt(ten3);
                int min21 = min11 - tsumopoint - bonnbasou * 100;
                button6.setText(String.valueOf(min21));

                String ten4 = button7.getText().toString();
                int min12 = Integer.parseInt(ten4);
                int min22 = min12 - tsumopoint - bonnbasou * 100;
                button7.setText(String.valueOf(min22));
            }
            bonnbasou+=1;
            textView9.setText(String.valueOf(bonnbasou));
            ribosou=0;
            textView4.setText(String.valueOf(ribosou));
        }

        else if(requestCode == 3 && resultCode == Activity.RESULT_OK) {//子家自摸
            isRed1 = false;//清除立直狀態
            isRed2 = false;
            isRed3 = false;
            isRed4 = false;
            button.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
            button2.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
            button3.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
            button4.setBackgroundTintList(getResources().getColorStateList(R.color.gray));

            int tsumopoint1 = data.getIntExtra("tsumopoint1", 0);//親扣點
            int tsumopoint2 = data.getIntExtra("tsumopoint2", 0);//子扣點

            if (plusperson == 1) {
                String ten1 = button5.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp + tsumopoint2*2 + tsumopoint1 + ribosou * 1000 + bonnbasou * 300;//+供拖
                button5.setText(String.valueOf(plusend));

                String ten2 = button6.getText().toString();
                int min1 = Integer.parseInt(ten2);
                int min2;
                if (oya == 2){
                    min2 = min1 - tsumopoint1 - bonnbasou * 100;
                }else min2 = min1 - tsumopoint2 - bonnbasou * 100;
                button6.setText(String.valueOf(min2));

                String ten3 = button7.getText().toString();
                int min11 = Integer.parseInt(ten3);
                int min12;
                if (oya == 3){
                    min12 = min11 - tsumopoint1 - bonnbasou * 100;
                }else min12 = min11 - tsumopoint2 - bonnbasou * 100;
                button7.setText(String.valueOf(min12));

                String ten4 = button8.getText().toString();
                int min41 = Integer.parseInt(ten4);
                int min42;
                if (oya == 4){
                    min42 = min41 - tsumopoint1 - bonnbasou * 100;
                }else min42 = min41 - tsumopoint2 - bonnbasou * 100;
                button8.setText(String.valueOf(min42));
            }
            else if (plusperson == 2) {
                String ten1 = button6.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp + tsumopoint2*2 + tsumopoint1 + ribosou * 1000 + bonnbasou * 300;//+供拖
                button6.setText(String.valueOf(plusend));

                String ten2 = button5.getText().toString();
                int min1 = Integer.parseInt(ten2);
                int min2;
                if(oya == 1){
                    min2 = min1 - tsumopoint1 - bonnbasou * 100;
                }else min2 = min1 - tsumopoint2 - bonnbasou * 100;
                button5.setText(String.valueOf(min2));

                String ten3 = button7.getText().toString();
                int min11 = Integer.parseInt(ten3);
                int min12;
                if (oya == 3){
                    min12 = min11 - tsumopoint1 - bonnbasou * 100;
                }else min12 = min11 - tsumopoint2 - bonnbasou * 100;
                button7.setText(String.valueOf(min12));

                String ten4 = button8.getText().toString();
                int min41 = Integer.parseInt(ten4);
                int min42;
                if (oya == 4){
                    min42 = min41 - tsumopoint1 - bonnbasou * 100;
                }else min42 = min41 - tsumopoint2 - bonnbasou * 100;
                button8.setText(String.valueOf(min42));
            }
            else if (plusperson == 3) {
                String ten1 = button7.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp + tsumopoint2*2 + tsumopoint1 + ribosou * 1000 + bonnbasou * 300;//+供拖
                button7.setText(String.valueOf(plusend));

                String ten2 = button5.getText().toString();
                int min1 = Integer.parseInt(ten2);
                int min2;
                if(oya == 1){
                    min2 = min1 - tsumopoint1 - bonnbasou * 100;
                }else min2 = min1 - tsumopoint2 - bonnbasou * 100;
                button5.setText(String.valueOf(min2));

                String ten3 = button6.getText().toString();
                int min31 = Integer.parseInt(ten3);
                int min32;
                if (oya == 2){
                    min32 = min31 - tsumopoint1 - bonnbasou * 100;
                }else min32 = min31 - tsumopoint2 - bonnbasou * 100;
                button6.setText(String.valueOf(min32));

                String ten4 = button8.getText().toString();
                int min41 = Integer.parseInt(ten4);
                int min42;
                if (oya == 4){
                    min42 = min41 - tsumopoint1 - bonnbasou * 100;
                }else min42 = min41 - tsumopoint2 - bonnbasou * 100;
                button8.setText(String.valueOf(min42));
            }
            else if (plusperson == 4) {
                String ten1 = button8.getText().toString();
                int plusp = Integer.parseInt(ten1);
                int plusend = plusp + tsumopoint2*2 + tsumopoint1 + ribosou * 1000 + bonnbasou * 300;//+供拖
                button8.setText(String.valueOf(plusend));

                String ten2 = button5.getText().toString();
                int min1 = Integer.parseInt(ten2);
                int min2;
                if(oya == 1){
                    min2 = min1 - tsumopoint1 - bonnbasou * 100;
                }else min2 = min1 - tsumopoint2 - bonnbasou * 100;
                button5.setText(String.valueOf(min2));

                String ten3 = button6.getText().toString();
                int min31 = Integer.parseInt(ten3);
                int min32;
                if (oya == 2){
                    min32 = min31 - tsumopoint1 - bonnbasou * 100;
                }else min32 = min31 - tsumopoint2 - bonnbasou * 100;
                button6.setText(String.valueOf(min32));

                String ten4 = button7.getText().toString();
                int min11 = Integer.parseInt(ten4);
                int min12;
                if (oya == 3){
                    min12 = min11 - tsumopoint1 - bonnbasou * 100;
                }else min12 = min11 - tsumopoint2 - bonnbasou * 100;
                button7.setText(String.valueOf(min12));
            }

            ribosou=0;
            textView4.setText(String.valueOf(ribosou));
            if (textView2.getText().toString().equals("東一局")) {//局數推進
                bonnbasou = 0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("東二局");
                textView3.setText("北");
                textView5.setText("東");
                oya = 2;
                textView6.setText("南");
                textView7.setText("西");
                textView5.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView3.setTextColor(getResources().getColorStateList(R.color.black));
            } else if (textView2.getText().toString().equals("東二局")) {
                bonnbasou = 0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("東三局");
                textView3.setText("西");
                textView5.setText("北");
                textView6.setText("東");
                oya = 3;
                textView7.setText("南");
                textView6.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView5.setTextColor(getResources().getColorStateList(R.color.black));
            } else if (textView2.getText().toString().equals("東三局")) {
                bonnbasou = 0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("東四局");
                textView3.setText("南");
                textView5.setText("西");
                textView6.setText("北");
                textView7.setText("東");
                oya = 4;
                textView7.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView6.setTextColor(getResources().getColorStateList(R.color.black));
            } else if (textView2.getText().toString().equals("東四局")) {
                bonnbasou = 0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("南一局");
                textView3.setText("東");
                oya = 1;
                textView5.setText("南");
                textView6.setText("西");
                textView7.setText("北");
                textView3.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView7.setTextColor(getResources().getColorStateList(R.color.black));
            } else if (textView2.getText().toString().equals("南一局")) {
                bonnbasou = 0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("南二局");
                textView3.setText("北");
                textView5.setText("東");
                oya = 2;
                textView6.setText("南");
                textView7.setText("西");
                textView5.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView3.setTextColor(getResources().getColorStateList(R.color.black));
            } else if (textView2.getText().toString().equals("南二局")) {
                bonnbasou = 0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("南三局");
                textView3.setText("西");
                textView5.setText("北");
                textView6.setText("東");
                oya = 3;
                textView7.setText("南");
                textView6.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView5.setTextColor(getResources().getColorStateList(R.color.black));
            } else if (textView2.getText().toString().equals("南三局")) {
                bonnbasou = 0;
                textView9.setText(String.valueOf(bonnbasou));
                textView2.setText("南四局");
                textView3.setText("南");
                textView5.setText("西");
                textView6.setText("北");
                textView7.setText("東");
                oya = 4;
                textView7.setTextColor(getResources().getColorStateList(R.color.oyared));
                textView6.setTextColor(getResources().getColorStateList(R.color.black));
            }
        }
    }
}