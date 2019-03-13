package ru.ninenineonegame.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class level_zero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_zero);
    }

    public void moveLevelOne (View view) {
        Intent intent = new Intent(this, level_one.class);
        startActivity(intent);
    }
}
