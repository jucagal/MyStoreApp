package com.umb.juan.mystoreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button buttonSave = (Button) findViewById(R.id.form_button);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = ((EditText) findViewById(R.id.name)).getText().toString();
                String document = ((EditText) findViewById(R.id.document)).getText().toString();
                String phone = ((EditText) findViewById(R.id.phone)).getText().toString();
                String email = ((EditText) findViewById(R.id.email)).getText().toString();
                if(!name.equals(null)) {
                    Intent intent = new Intent(FormActivity.this, InfoActivity.class);
                    intent.putExtra("name",name);
                    intent.putExtra("document",document);
                    intent.putExtra("phone",phone);
                    intent.putExtra("email",email);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
