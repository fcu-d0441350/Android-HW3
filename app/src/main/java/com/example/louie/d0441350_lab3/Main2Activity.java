package com.example.louie.d0441350_lab3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
        EditText E1;
        Button B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        E1=(EditText)findViewById(R.id.editText);
        B2=(Button)findViewById(R.id.button2);
        B2.setOnClickListener(Main);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    private View.OnClickListener Main=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String name = E1.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("name",name);
            setResult(RESULT_OK,intent);
            finish();

        }
    };
}
