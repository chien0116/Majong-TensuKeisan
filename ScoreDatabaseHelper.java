package com.example.majongtensukeisan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ScoreDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "scores.db";
    private static final int DATABASE_VERSION = 2;

    public ScoreDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // 创建数据库表
        String createTableQuery = "CREATE TABLE scores_table ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "p1_score INTEGER, "
                + "p2_score INTEGER, "
                + "p3_score INTEGER, "
                + "p4_score INTEGER, "
                + "timestamp TEXT"
                + ")";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // 升级数据库版本，处理数据库表结构变化
        if (oldVersion < 2) {
            // 添加时间戳列
            db.execSQL("ALTER TABLE scores_table ADD COLUMN timestamp TEXT");
        }
        // 如果有更多的数据库版本升级操作，在这里添加相应的逻辑
    }
}

