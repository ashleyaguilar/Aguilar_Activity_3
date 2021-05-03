package com.example.aguilar_activity_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignInSuccessful extends AppCompatActivity {
    Button button_feed;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_successful);
        button_feed = (Button) findViewById(R.id.btn_feed);
        DB = new DBHelper(this);

        button_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_back);
            }
        });
    }
}
