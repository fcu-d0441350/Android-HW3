package com.example.louie.d0441350_lab3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Button B1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        B1=(Button)findViewById(R.id.button);
        B1.setOnClickListener(Main2);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    private View.OnClickListener Main2=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,Main2Activity.class);
            startActivityForResult(intent,1);
        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch(item.getItemId())
        {
            case R.id.setting1:
                Toast set =Toast.makeText(MainActivity.this,"Null",Toast.LENGTH_LONG);      //作業中未要求設置東西
                set.show();
                break;
            case R.id.setting2:
                Uri uri= Uri.parse("http://www.google.com.tw");
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(uri);
                startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent intent)
    {
        String name = new String();
        if(intent==null)
        {
            return;
        }
        super.onActivityResult(requestCode,resultCode,intent);
        switch(requestCode)
        {
            case 1:
                name=intent.getStringExtra("name");
                Toast showToast = Toast.makeText(MainActivity.this,"Hello  "+name,Toast.LENGTH_LONG);
                showToast.show();
                break;
            default:
                return;
        }
    }
}
