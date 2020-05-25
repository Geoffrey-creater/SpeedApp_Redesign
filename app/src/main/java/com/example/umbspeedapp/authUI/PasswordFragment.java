package com.example.umbspeedapp.authUI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.umbspeedapp.MainController;
import com.example.umbspeedapp.R;

import java.util.Objects;


public class PasswordFragment extends AppCompatActivity {


   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.fragment_password);
      findViewById(R.id.continueFab)
              .setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                    Intent intent = new Intent(PasswordFragment.this, MainController.class);
                    startActivity(intent);
                    overridePendingTransition(0, 0);
                 }
              });

      this.getWindow().setNavigationBarColor(getResources().getColor(R.color.appBackground));
      this.getWindow().setStatusBarColor(getResources().getColor(R.color.appBackground));
   }


}
