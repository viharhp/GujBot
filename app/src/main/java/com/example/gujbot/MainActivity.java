package com.example.gujbot;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void btnClick(View view) {
        Random rand = new Random();
        int rand1 = rand.nextInt(1000);
        String str1 = String.valueOf(rand1);
        Toast.makeText(getApplicationContext(), str1, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = findViewById(R.id.textView1);
        TextView displayedText = findViewById(R.id.displayedText);
        Button clickBtn = findViewById(R.id.btnClick);
    }
}
