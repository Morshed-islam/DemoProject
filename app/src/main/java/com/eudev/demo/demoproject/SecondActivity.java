package com.eudev.demo.demoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("morshed"," 2nd Start method is running");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("morshed","2nd Resume method is running");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("morshed","2nd Pause method is running");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("morshed","2nd Stop method is running");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("morshed","2nd Restart method is running");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("morshed","2nd Destroy method is running");
    }
}
