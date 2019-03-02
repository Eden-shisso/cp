package com.example.reda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {
    Button sub;
    ImageView reda;
    Animation frombottom;
    Animation fromtop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sub= (Button)findViewById(R.id.sub);
        reda=(ImageView)findViewById(R.id.reda);
        frombottom= AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromtop= AnimationUtils.loadAnimation(this,R.anim.fromtop);
        sub.setAnimation(frombottom);
        reda.setAnimation(fromtop);
        sub= (Button) findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Splash.this, MainfActivity.class);
                startActivity(myIntent);
            }
        });


    }
}
