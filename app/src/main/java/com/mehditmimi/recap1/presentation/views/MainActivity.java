package com.mehditmimi.recap1.presentation.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mehditmimi.recap1.R;
import com.mehditmimi.recap1.business.Services;
import com.mehditmimi.recap1.utils.MyContext;

public class MainActivity extends AppCompatActivity {

    private Services services;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyContext context=(MyContext)getApplicationContext();
        services=context.getServices();

    }
}