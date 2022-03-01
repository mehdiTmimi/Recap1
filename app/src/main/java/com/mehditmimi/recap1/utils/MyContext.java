package com.mehditmimi.recap1.utils;

import android.app.Application;

import com.mehditmimi.recap1.business.DefaultServices;
import com.mehditmimi.recap1.business.Services;
import com.mehditmimi.recap1.dao.TodoDaoSqlLite;

public class MyContext extends Application {
    private Services services;
    public MyContext(){

    }

    @Override
    public void onCreate() {
        super.onCreate();
        SqlLiteDb sqlLiteDb=new SqlLiteDb(this);
        services=new DefaultServices(new TodoDaoSqlLite(sqlLiteDb));
    }

    public Services getServices() {
        return services;
    }
}
