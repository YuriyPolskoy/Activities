package com.example.user.activitylesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Life", "onCreate");
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView) findViewById(R.id.textView2);
        String data = getIntent().getStringExtra(MainActivity.KEY);
        textView.setText(data);
    }

    protected void onRestart() {
        Log.e("Life", "onRestart");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.e("Life", "onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.e("Life", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("Life", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.e("Life", "onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.e("Life", "onResume");
        super.onResume();
    }
}
