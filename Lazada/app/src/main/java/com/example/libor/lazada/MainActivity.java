package com.example.libor.lazada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick (View v){
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Button Login = (Button) findViewById(R.id.login);
       Login.startAnimation(myAnim);
    }

}
