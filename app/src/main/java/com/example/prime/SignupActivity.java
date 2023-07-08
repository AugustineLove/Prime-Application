package com.example.prime;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class SignupActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        TextView textView = findViewById(R.id.Signintext);
        Button button = findViewById(R.id.signup);
        textView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                navigateToScreen();
            }
            private void navigateToScreen() {
                Intent intent = new Intent(SignupActivity.this, SigninActivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                navigateToScreen();
            }
            private void navigateToScreen() {
                Intent intent = new Intent(SignupActivity.this, SigninActivity.class);
                startActivity(intent);
            }
        });


    }
}
