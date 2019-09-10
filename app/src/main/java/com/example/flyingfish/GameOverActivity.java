package com.example.flyingfish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        TextView textView = findViewById(R.id.score);
        textView.setText(String.valueOf(getIntent().getIntExtra("key", 0)));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        MainActivity.off=false;
    }

    public void onClickPlayAgain(View view) {
        MainActivity.off = false;
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();

    }
}
