package com.example.prime;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class DetailActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Button button = findViewById(R.id.Bookhotel);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                navigateToScreen();
            }
            private void navigateToScreen() {
                Intent intent = new Intent(DetailActivity.this, BookActivity.class);
                startActivity(intent);
            }
        });

    }
}
