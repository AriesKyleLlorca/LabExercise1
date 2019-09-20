package com.llorca.services;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*
    @Override
    protected void onResume(){
        super.onResume();
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("Services", "onRestart() has executed...");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("Services", "onDestroy() has executed...");
    }
    */
    public void portals(View v){
        Intent intent = new Intent(this, SecondAcvtivity.class);
        startActivity(intent);
    }
    public void greetings(View v){
        for(int i=0;i<10;i++){
            Log.d("MyService", "Hello" + (i+1));
        }
    }

}
