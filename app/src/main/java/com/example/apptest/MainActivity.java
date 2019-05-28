package com.example.apptest;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BulletSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declarando variáveis da activity
    private Bundle bundle;
    private Button btAction;
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Localizando item via id.
        btAction = (Button) findViewById(R.id.btAction);
        text = (EditText) findViewById(R.id.name);

        //Método onclick, ao clicar segue para nova activity
        btAction.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Tela2Activity.class);
                intent.putExtra("param1", text.getText().toString());
                startActivity(intent);
            }
        });

    }

}
