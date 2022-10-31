package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmailActivity extends AppCompatActivity {
    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

    Submit = findViewById(R.id.Submit);
    Submit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent Submit = new Intent(EmailActivity.this, ConfirmedActivity.class);
            startActivity(Submit);
        }
    });
    }
}