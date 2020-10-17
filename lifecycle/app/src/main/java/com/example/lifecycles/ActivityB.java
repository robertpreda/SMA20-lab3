package com.example.lifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    private Button bA, bB, bC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.bA = findViewById(R.id.bActivityMain);
        this.bB = findViewById(R.id.bActivityA);
        this.bC = findViewById(R.id.bActivityB);

        Log.d("lmao", "onCreate B");

    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("lmao","onResume B");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("lmao","onPause B");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("lmao","onCreate B");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("lmao", "onRestart B");

    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("lmao", "onStop B");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lmao","onDetroy B");
    }

    public void clicked(View view){
        switch (view.getId()){
            case R.id.bActivityMain:
                // start activity Main
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.bActivityA:
                // start activity A
                startActivity(new Intent(this, ActivityA.class));
                break;
            case R.id.bActivityB:
                // start activity B
                startActivity(new Intent(this, ActivityB.class));
                break;
        }

    }
}