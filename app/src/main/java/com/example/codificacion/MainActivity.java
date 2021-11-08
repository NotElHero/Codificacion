package com.example.codificacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView texto = findViewById(R.id.texto);
    }

    @Override
    public void onClick(View v) {
        Button bot_a = findViewById(R.id.bot_a);
        Button bot_b = findViewById(R.id.bot_b);
        Button bot_c = findViewById(R.id.bot_c);
        Button bot_d = findViewById(R.id.bot_d);
        Button bot_e = findViewById(R.id.bot_e);
        Button bot_f = findViewById(R.id.bot_f);
        Button bot_g = findViewById(R.id.bot_g);
        Button bot_h = findViewById(R.id.bot_h);
        Button bot_i = findViewById(R.id.bot_i);
        Button bot_j = findViewById(R.id.bot_j);
        Button bot_k = findViewById(R.id.bot_k);
        Button bot_l = findViewById(R.id.bot_l);
        Button bot_m = findViewById(R.id.bot_m);
        Button bot_n = findViewById(R.id.bot_n);
        Button bot_o = findViewById(R.id.bot_o);
        Button bot_p = findViewById(R.id.bot_p);
        Button bot_q = findViewById(R.id.bot_q);
        Button bot_r = findViewById(R.id.bot_r);
        Button bot_s = findViewById(R.id.bot_s);
        Button bot_t = findViewById(R.id.bot_t);
        Button bot_u = findViewById(R.id.bot_u);
        Button bot_v = findViewById(R.id.bot_v);
        Button bot_w = findViewById(R.id.bot_w);
        Button bot_x = findViewById(R.id.bot_x);
        Button bot_y = findViewById(R.id.bot_y);
        Button bot_z = findViewById(R.id.bot_z);
        Button bot_may = findViewById(R.id.bot_may);
        Button bot_enter = findViewById(R.id.bot_enter);

        bot_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });


    }
}