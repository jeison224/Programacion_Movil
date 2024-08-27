package com.example.aplicacion_pm;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String TAG = "Test";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        Button buttonNextActivity = findViewById(R.id.buttonNextActivity);

        button.setOnClickListener(view -> {
            String name = editText.getText().toString();
            Toast.makeText(MainActivity.this, "Hola, " + name, Toast.LENGTH_SHORT).show();

        });

        buttonNextActivity.setOnClickListener(view -> {
            String name = editText.getText().toString();
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("USER_NAME", name);
            startActivity(intent);

        });

        Log.d(TAG, "Estoy en el OnCREATE");
        Toast.makeText(this, "Estoy en el OnCREATE", Toast.LENGTH_SHORT).show();
    }

    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Estoy en el OnStart");
        Toast.makeText(this, "Estoy en el OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Estoy en el OnResume");
        Toast.makeText(this, "Estoy en el OnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Estoy en el OnPause");
        Toast.makeText(this, "Estoy en el OnPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Estoy en el Stop");
        Toast.makeText(this, "Estoy en el Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Estoy en el Destroy");
        Toast.makeText(this, "Estoy en el Destroy", Toast.LENGTH_SHORT).show();
    }
}