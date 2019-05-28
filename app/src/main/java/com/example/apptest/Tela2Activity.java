package com.example.apptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        textView = (TextView)  findViewById(R.id.name);
        Bundle extra = getIntent().getExtras();

        String param = extra.getString("param1");

        textView.setText(param);

    }
}
