package com.example.umbspeedapp.authUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.umbspeedapp.R;

public class AuthActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.fragment_user_name);

      this.getWindow().setNavigationBarColor(getResources().getColor(R.color.appBackground));
      this.getWindow().setStatusBarColor(getResources().getColor(R.color.appBackground));

      findViewById(R.id.usernameFab)
              .setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                    Intent intent = new Intent(AuthActivity.this, PasswordFragment.class);
                    startActivity(intent);
                    overridePendingTransition(0, 0);
                 }
              });



   }
}
