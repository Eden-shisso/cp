package com.example.reda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainfActivity extends AppCompatActivity {

    Button button;
    TextView mTextViewNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.btn_signup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainfActivity.this, Signup.class);
                startActivity(myIntent);
            }
        });
        mTextViewNext= (TextView) findViewById(R.id.iv_forget);
        mTextViewNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start NewActivity.class
                Intent myIntent = new Intent(MainfActivity.this, jujeActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
