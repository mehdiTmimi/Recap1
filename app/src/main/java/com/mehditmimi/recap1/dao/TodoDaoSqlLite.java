package com.mehditmimi.recap1.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.mehditmimi.recap1.beans.Todo;
import com.mehditmimi.recap1.utils.SqlLiteDb;

import java.util.ArrayList;
import java.util.List;

public class TodoDaoSqlLite implements TodoDao{
    private SqlLiteDb sqlLiteDb;
    public TodoDaoSqlLite(SqlLiteDb sqlLiteDb)
    {
        this.sqlLiteDb=sqlLiteDb;
    }
    @Override
    public Todo add(Todo todo) {
        SQLiteDatabase db = sqlLiteDb.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("task",todo.getTask());
        values.put("time",todo.getTime());
        return db.insert("todo",null,values)==-1?null:todo;
    }

    @Override
    public List<Todo> getAll() {
        SQLiteDatabase db = sqlLiteDb.getReadableDatabase();
        String query = "select * from todo";
        Cursor cursor=db.rawQuery(query,null);
        List<Todo> todos=new ArrayList<>();
        if(!cursor.moveToFirst())
            return todos;
        do {
            Todo todo = new Todo();
            todo.setId(cursor.getInt(0));
            todo.setTask(cursor.getString(1));
            todo.setTime(cursor.getString(2));
            todos.add(todo);
        } while (cursor.moveToNext());
        return todos;
    }
}
