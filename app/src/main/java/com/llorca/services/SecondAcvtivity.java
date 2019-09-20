package com.llorca.services;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SecondAcvtivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);
        }

        public void ustWebsite(View v){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://www.ust.edu.ph"));
            startActivity(intent);
        }
        public void myUSTE(View v){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://myuste.ust.edu.ph/student/index.jsp?id=gray"));
            startActivity(intent);
        }
        public void blackboard(View v){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("ust.blackboard.com"));
            startActivity(intent);
        }

    }
