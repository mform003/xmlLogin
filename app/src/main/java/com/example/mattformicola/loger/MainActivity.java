package com.example.mattformicola.loger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);


         Button signIn = findViewById(R.id.signinBtn);
         Button register = findViewById(R.id.registerBtn);

         signIn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(getApplicationContext(), PickActivity.class);
                 startActivity(i);
             }
         });


         register.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
                 startActivity(i);
             }
         });



     }
}


