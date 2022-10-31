package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class SettingActivity extends AppCompatActivity {

    private CircleImageView image;
    TextView Name;
    TextView emailIsi;
    TextView passwordIsi;
    private Button btn_visit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Nama = findViewById(R.id.Nama);
        emailIsi = findViewById(R.id.Email);
        passwordIsi = findViewById(R.id.Password);
        image = findViewById(R.id.profilePics);

        Bundle bundle = getIntent().getExtras();
        String Nama = bundle.getString("nama");
        String Email =bundle.getString("email");
        String Password =bundle.getString("password");
        String Uri =bundle.getString("image");
/*
        image.setImageURI(android.net.Uri.parse(uri));
        Name.setText(Nama);
        emailIsi.setText(Email);
        passwordIsi.setText(Password);
*/
    }
}