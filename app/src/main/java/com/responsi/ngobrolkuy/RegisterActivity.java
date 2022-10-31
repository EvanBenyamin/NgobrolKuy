package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private Button ToLogin;
    private Button ToPropic;
    private EditText etName;
    private EditText etEmail;
    private EditText etPass;
    public static final String FULLNAME_KEY = "fullname";
    public static final String EMAIL_KEY = "email";
    public static final String PASSWORD_KEY = "password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ToLogin = findViewById(R.id.ToLogin);
        ToPropic = findViewById(R.id.ToProPic);
        etName = findViewById(R.id.Name_text);
        etEmail = findViewById(R.id.Email_text);
        etPass = findViewById(R.id.EtPass);


        ToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent balik = new Intent(RegisterActivity.this, LoginActivity.class);
            }
        });

        ToPropic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(RegisterActivity.this, ProfilePicActivity.class);
                String Nama =etName.getText().toString();
                String Email = etEmail.getText().toString();
                String Password = etPass.getText().toString();

                if (Nama.isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Username", Toast.LENGTH_SHORT).show();
                } else if (Email.isEmpty()){
                    etEmail.setError("Email Harus diisi");
                } else if (Password.isEmpty()){
                    etPass.setError("Password Harus diisi");
                    } else{
                next.putExtra(FULLNAME_KEY, Nama);
                next.putExtra(EMAIL_KEY, Email);
                next.putExtra(PASSWORD_KEY, Password);
                startActivity(next);
                }
            }
        });
    }
}