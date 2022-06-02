package com.example.justynacv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pagePrincipale extends AppCompatActivity {

    private Button decouvrezMoi;
    private Button portfolio;
    private Button apprentissage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_principale);

        final Intent intent = new Intent().setClass(this, aPropos.class);
        decouvrezMoi=findViewById(R.id.aPropos);
        //System.out.println("découvre");

        decouvrezMoi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {startActivity(intent);}
    });

        final Intent intent2 = new Intent().setClass(this, portfolio.class);
        decouvrezMoi=findViewById(R.id.portfolio);
        //System.out.println("découvre");

        decouvrezMoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(intent2);}
        });

        final Intent intent3 = new Intent().setClass(this, aide.class);
        decouvrezMoi=findViewById(R.id.apprentissage);
        //System.out.println("découvre");

        decouvrezMoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(intent3);}
        });
    }
}