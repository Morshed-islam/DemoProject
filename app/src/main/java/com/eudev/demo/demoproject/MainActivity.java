package com.eudev.demo.demoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button click;
    EditText edName, edPass;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = (Button) findViewById(R.id.click_me);
        edName = (EditText) findViewById(R.id.edt_name);
        edPass = (EditText) findViewById(R.id.edt_pass);
        res = (TextView) findViewById(R.id.result);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String name = edName.getText().toString();
                String pass  = edPass.getText().toString();

                Toast.makeText(MainActivity.this, ""+name+" "+pass, Toast.LENGTH_SHORT).show();
                res.setText("name : "+name+"\n"+"Password"+pass);

            }
        });


    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("morshed", "Start method is running");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("morshed", "Resume method is running");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("morshed", "Pause method is running");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("morshed", "Stop method is running");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("morshed", "Restart method is running");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("morshed", "Destroy method is running");
    }
}
