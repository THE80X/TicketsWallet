package com.example.ticketswallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Autorize extends AppCompatActivity {
    public static String pasword_1;
    public static String pasword_2;
    public static String nickname_1;
    public static String nickname_2;
    public static String[]data = new String[8];
    public static int i=0;

    Button buttonnext;
    Button buttonautorize;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autorize);
        buttonnext = findViewById(R.id.button_next_1);
        buttonautorize = findViewById(R.id.button_autorize);
    }
    public void OnClickCamera(View view) {
        EditText editTextPassword1 = (EditText) findViewById(R.id.Parol_1);
        pasword_1 = editTextPassword1.getText().toString();
        EditText editTextPassword2 = (EditText) findViewById(R.id.Parol_2);
        pasword_2 = editTextPassword2.getText().toString();
        EditText editTextNickname1 = (EditText) findViewById(R.id.Name);
        nickname_1 = editTextNickname1.getText().toString();
        if (!nickname_1.isEmpty()) {
            if ((pasword_1.isEmpty()) && (pasword_2.isEmpty())) {
                findViewById(R.id.Result_1).setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.Result_1)).setText("Вы не ввели пароль");
            }
            if (!(pasword_1.isEmpty()) && (pasword_1.equals(pasword_2))) {
                ((TextView) findViewById(R.id.Result_1)).setText("");
                findViewById(R.id.Result_1).setVisibility(View.GONE);
                data[i]= nickname_1 + ";" + pasword_1;
                i++;
                Intent intent = new Intent(Autorize.this, MainActivity.class);
                startActivity(intent);
            }
            if ((pasword_1.isEmpty() && (pasword_1.equals(pasword_2))) || ((pasword_1.isEmpty()) && !(pasword_1.equals(pasword_2)))) {
                findViewById(R.id.Result_1).setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.Result_1)).setText("Ваши пароли не совпадают");
            }
        }else{
            ((TextView) findViewById(R.id.Result_1)).setText("Вы не ввели логин");
        }
    }

    public void OnClickAutorize(View view){
        Intent intent = new Intent(Autorize.this, MainActivity.class);
        startActivity(intent);
    }
@Override
    protected void onDestroy(){
        super.onDestroy();

}
}