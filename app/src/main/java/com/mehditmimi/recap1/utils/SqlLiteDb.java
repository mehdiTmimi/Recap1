package com.mehditmimi.recap1.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqlLiteDb extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="db";
    private static final int DATABASE_VERSION=1;
    public SqlLiteDb(Context context)  {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String req1="create table todo (id int primary key autoincrement, " +
                "task text,time text)";
        sqLiteDatabase.execSQL(req1);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS todo");
        onCreate(sqLiteDatabase);
    }
}
