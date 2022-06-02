package com.example.justynacv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class aPropos extends AppCompatActivity {

    private ImageView photo;
    private Button bouton;
    private TextView moi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.apropos);
        photo=findViewById(R.id.photo);
        moi=findViewById(R.id.monNom);

        moi.setPaintFlags(moi.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);


        photo.setClipToOutline(true);


        final Intent intent = new Intent().setClass(this, contact.class);
        bouton=findViewById(R.id.contacter);

        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });


    }
}