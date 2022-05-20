package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    String ticWin = "крестики!";
    String tacWin = "нолики!";
    String tic = "Ход делают: крестики";
    String tac = "Ход делают: нолики";
    boolean stepCounter = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Button b00 = findViewById(R.id.button_00);
        Button b01 = findViewById(R.id.button_01);
        Button b02 = findViewById(R.id.button_02);
        Button b10 = findViewById(R.id.button_10);
        Button b20 = findViewById(R.id.button_20);
        Button b11 = findViewById(R.id.button_11);
        Button b22 = findViewById(R.id.button_22);
        Button b12 = findViewById(R.id.button_12);
        Button b21 = findViewById(R.id.button_21);

        TextView step = findViewById(R.id.step);
        step.setText(tic);

        b00.setOnClickListener(view -> {
            if (stepCounter) {
                b00.setText("O");
                step.setText(tic);
            } else {
                b00.setText("X");
                step.setText(tac);
            }
            checkWin();
            b00.setClickable(false);
            stepCounter = !stepCounter;
        });

        b01.setOnClickListener(view -> {
            if (stepCounter) {
                b01.setText("O");
                step.setText(tic);
            } else {
                b01.setText("X");
                step.setText(tac);
            }
            checkWin();
            b01.setClickable(false);
            stepCounter = !stepCounter;
        });

        b02.setOnClickListener(view -> {
            if (stepCounter) {
                b02.setText("O");
                step.setText(tic);
            } else {
                b02.setText("X");
                step.setText(tac);
            }
            checkWin();
            b02.setClickable(false);
            stepCounter = !stepCounter;
        });

        b10.setOnClickListener(view -> {
            if (stepCounter) {
                b10.setText("O");
                step.setText(tic);
            } else {
                b10.setText("X");
                step.setText(tac);
            }
            checkWin();
            b10.setClickable(false);
            stepCounter = !stepCounter;
        });

        b11.setOnClickListener(view -> {
            if (stepCounter) {
                b11.setText("O");
                step.setText(tic);
            } else {
                b11.setText("X");
                step.setText(tac);
            }
            checkWin();
            b11.setClickable(false);
            stepCounter = !stepCounter;
        });

        b12.setOnClickListener(view -> {
            if (stepCounter) {
                b12.setText("O");
                step.setText(tic);
            } else {
                b12.setText("X");
                step.setText(tac);
            }
            checkWin();
            b12.setClickable(false);
            stepCounter = !stepCounter;
        });

        b20.setOnClickListener(view -> {
            if (stepCounter) {
                b20.setText("O");
                step.setText(tic);
            } else {
                b20.setText("X");
                step.setText(tac);
            }
            checkWin();
            b20.setClickable(false);
            stepCounter = !stepCounter;
        });

        b21.setOnClickListener(view -> {
            if (stepCounter) {
                b21.setText("O");
                step.setText(tic);
            } else {
                b21.setText("X");
                step.setText(tac);
            }
            checkWin();
            b21.setClickable(false);
            stepCounter = !stepCounter;
        });

        b22.setOnClickListener(view -> {
            if (stepCounter) {
                b22.setText("O");
                step.setText(tic);
            } else {
                b22.setText("X");
                step.setText(tac);
            }
            checkWin();
            b22.setClickable(false);
            stepCounter = !stepCounter;
        });
    }

    public void checkWin() {
        Button b00 = findViewById(R.id.button_00);
        Button b01 = findViewById(R.id.button_01);
        Button b02 = findViewById(R.id.button_02);
        Button b10 = findViewById(R.id.button_10);
        Button b20 = findViewById(R.id.button_20);
        Button b11 = findViewById(R.id.button_11);
        Button b22 = findViewById(R.id.button_22);
        Button b12 = findViewById(R.id.button_12);
        Button b21 = findViewById(R.id.button_21);
        if (!(b00.getText().toString().equals("") || b01.getText().toString().equals("") || b01.getText().toString().equals("")
                || b02.getText().toString().equals("") || b10.getText().toString().equals("") || b20.getText().toString().equals("")
                || b11.getText().toString().equals("") || b22.getText().toString().equals("") || b12.getText().toString().equals("")
                || b21.getText().toString().equals(""))) {
            end();
        }
        // горизонт
        if (!(b02.getText().toString().equals("") || b12.getText().toString().equals("") || b22.getText().toString().equals(""))
                && b02.getText().toString().equals(b12.getText().toString()) && b12.getText().toString().equals(b22.getText().toString())) {
            end();
        }
        if (!(b01.getText().toString().equals("") || b11.getText().toString().equals("") || b21.getText().toString().equals(""))
                && b01.getText().toString().equals(b11.getText().toString()) && b11.getText().toString().equals(b21.getText().toString())) {
            end();
        }
        if (!(b00.getText().toString().equals("") || b10.getText().toString().equals("") || b20.getText().toString().equals(""))
                && b00.getText().toString().equals(b10.getText().toString()) && b10.getText().toString().equals(b20.getText().toString())) {
            end();
        }
        // вертикаль
        if (!(b02.getText().toString().equals("") || b01.getText().toString().equals("") || b00.getText().toString().equals(""))
                && b02.getText().toString().equals(b01.getText().toString()) && b01.getText().toString().equals(b00.getText().toString())) {
            end();
        }
        if (!(b12.getText().toString().equals("") || b11.getText().toString().equals("") || b20.getText().toString().equals(""))
                && b12.getText().toString().equals(b11.getText().toString()) && b11.getText().toString().equals(b10.getText().toString())) {
            end();
        }
        if (!(b22.getText().toString().equals("") || b21.getText().toString().equals("") || b20.getText().toString().equals(""))
                && b22.getText().toString().equals(b21.getText().toString()) && b21.getText().toString().equals(b20.getText().toString())) {
            end();
        }
        // диагонали
        if (!(b02.getText().toString().equals("") || b11.getText().toString().equals("") || b20.getText().toString().equals(""))
                && b02.getText().toString().equals(b11.getText().toString()) && b11.getText().toString().equals(b20.getText().toString())) {
            end();
        }
        if (!(b22.getText().toString().equals("") || b11.getText().toString().equals("") || b00.getText().toString().equals(""))
                && b22.getText().toString().equals(b11.getText().toString()) && b11.getText().toString().equals(b00.getText().toString())) {
            end();
        }
    }

    public void end() {
        String winner = "";
        if (stepCounter) {
            winner = tacWin;
        } else {
            winner = ticWin;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(GameActivity.this);
        builder.setTitle("Игра окончена. Победили " + winner)
                .setPositiveButton("Начать заново", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        restart();
                    }
                })
                .setNegativeButton("Выход", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        startActivity(new Intent(GameActivity.this, MainActivity.class));
                        finish();
                    }
                });
        builder.create().show();
    }

    public void restart() {
        Button b00 = findViewById(R.id.button_00);
        Button b01 = findViewById(R.id.button_01);
        Button b02 = findViewById(R.id.button_02);
        Button b10 = findViewById(R.id.button_10);
        Button b20 = findViewById(R.id.button_20);
        Button b11 = findViewById(R.id.button_11);
        Button b22 = findViewById(R.id.button_22);
        Button b12 = findViewById(R.id.button_12);
        Button b21 = findViewById(R.id.button_21);

        b00.setText(null);
        b01.setText(null);
        b02.setText(null);
        b10.setText(null);
        b20.setText(null);
        b11.setText(null);
        b22.setText(null);
        b12.setText(null);
        b21.setText(null);

        b00.setClickable(true);
        b01.setClickable(true);
        b02.setClickable(true);
        b10.setClickable(true);
        b20.setClickable(true);
        b11.setClickable(true);
        b22.setClickable(true);
        b12.setClickable(true);
        b21.setClickable(true);

        stepCounter = false;
    }
}