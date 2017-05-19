package com.example.user.activitylesson;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("COLOR", Color.RED);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Life", "onCreate");
        setContentView(R.layout.activity_main);

        final RelativeLayout rltLayout = (RelativeLayout) findViewById(R.id.activity_main);

        Button btnAct = (Button) findViewById(R.id.btn_act);
        btnAct.setOnClickListener(new View.OnClickListener(){


            public void onClick (View v) {
                /*Intent act2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivityForResult(act2, 444);*/
                rltLayout.setBackgroundColor(Color.RED);
            }
        });

        if(savedInstanceState != null) {
            rltLayout.setBackgroundColor(savedInstanceState.getInt("COLOR"));
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 444) {
            if (resultCode == RESULT_OK){
                Log.d("Life","success");
            }
        }
    }

    protected void onRestart() {
        Log.d("Life", "onRestart");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.d("Life", "onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d("Life", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("Life", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d("Life", "onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("Life", "onResume");
        super.onResume();
    }
}

