package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShowActivity extends AppCompatActivity {

    Button backButton;
    TextView cityText;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        backButton=findViewById(R.id.back_button);
        cityText=findViewById(R.id.show_city);
        Intent intent=getIntent();
        String text=intent.getStringExtra("Text");
        cityText.setText(text);
        backButton.setOnClickListener(v->{
            finish();
        });
    }

}