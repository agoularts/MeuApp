package com.example.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "BEM-VINDO ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = (Button)findViewById(R.id.btn_send);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText txt_username = (EditText)findViewById(R.id.txt_username);
                EditText txt_password = (EditText)findViewById(R.id.txt_password);
                String user = txt_username.getText().toString();
                String password = txt_password.getText().toString();

                if(user.equals("admin") && password.equals("admin")){
                    Intent intent = new Intent(v.getContext(), Menu.class);
                    intent.putExtra(EXTRA_MESSAGE, user);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(v.getContext(), "Usuario ou senha incorretos", Toast.LENGTH_LONG).show();
                }

            }
        });

    }


}