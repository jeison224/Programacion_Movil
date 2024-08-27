package com.example.aplicacion_pm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textViewWelcome = findViewById(R.id.Bienvenida);
         Button botonregreso = findViewById(R.id.Regresar);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("USER_NAME");

        textViewWelcome.setText("Bienvenido: " + userName);

        botonregreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
