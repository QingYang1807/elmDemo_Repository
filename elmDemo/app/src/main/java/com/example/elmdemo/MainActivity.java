package com.example.elmdemo;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCreate() {
        Log.e("20164206140-刘峰","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("20164206140-刘峰","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("20164206140-刘峰","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("20164206140-刘峰","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("20164206140-刘峰","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("20164206140-刘峰","onRestart");
    }
}
