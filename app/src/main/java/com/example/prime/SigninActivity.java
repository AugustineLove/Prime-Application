package com.example.prime;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SigninActivity extends AppCompatActivity {
    Button button;
    EditText passwordEditText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);


        EditText usernameEditText = findViewById(R.id.usernameEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        passwordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        Button button = findViewById(R.id.signin);
        TextView textView = findViewById(R.id.Signuptext);
        textView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                navigateToScreen();
            }
            private void navigateToScreen() {
                Intent intent = new Intent(SigninActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                navigateToScreen();
            }
            private void navigateToScreen() {
                Intent intent = new Intent(SigninActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
    }
}

