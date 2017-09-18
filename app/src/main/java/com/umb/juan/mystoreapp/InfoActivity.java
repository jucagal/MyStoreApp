package com.umb.juan.mystoreapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Intent intent = getIntent();

        TextView nameTv = (TextView) findViewById(R.id.name);
        nameTv.setText(intent.getStringExtra("name"));
        nameTv.setTextSize(16);
        nameTv.setTextColor(Color.BLACK);
        TextView documentTv = (TextView) findViewById(R.id.document);
        documentTv.setText(intent.getStringExtra("document"));
        documentTv.setTextSize(16);
        documentTv.setTextColor(Color.BLACK);
        TextView phoneTv = (TextView) findViewById(R.id.phone);
        phoneTv.setText(intent.getStringExtra("phone"));
        phoneTv.setTextSize(16);
        phoneTv.setTextColor(Color.BLACK);
        TextView emailTv = (TextView) findViewById(R.id.email);
        emailTv.setText(intent.getStringExtra("email"));
        emailTv.setTextSize(16);
        emailTv.setTextColor(Color.BLACK);

        Button buttonSave = (Button) findViewById(R.id.form_button);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
