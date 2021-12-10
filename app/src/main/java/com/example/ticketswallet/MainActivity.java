package com.example.ticketswallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.KeyStore;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClickRegistration(View view){
        Intent intent = new Intent(MainActivity.this, Autorize.class);
        startActivity(intent);
    }
    public void OnClickNextMenu(View view){

            Intent intent = new Intent(MainActivity.this, Autorization.class);
            startActivity(intent);
    }

}