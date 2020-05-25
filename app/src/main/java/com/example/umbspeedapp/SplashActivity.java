package com.example.umbspeedapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.umbspeedapp.authUI.AuthActivity;

public class SplashActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_splash);


      this.getWindow().setNavigationBarColor(Color.BLACK);
      this.getWindow().setStatusBarColor(Color.BLACK);
      int SPLASH_DISPLAY_LENGTH = 7000;


      new Handler().postDelayed(new Runnable() {
         @Override
         public void run() {
            /* Create an Intent that will start the Menu-Activity. */
            Intent mainIntent = new Intent(SplashActivity.this,
                    AuthActivity.class);
            SplashActivity.this.startActivity(mainIntent);
            SplashActivity.this.finish();
         }
      }, SPLASH_DISPLAY_LENGTH);
   }
}
