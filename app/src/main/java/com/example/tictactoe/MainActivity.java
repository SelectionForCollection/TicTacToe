package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_start_game = findViewById(R.id.start_game);

        btn_start_game.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, GameActivity.class));
            finish();
        });
    }
}