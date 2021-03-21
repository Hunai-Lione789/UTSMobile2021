package umn.ac.id;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginform extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginform);

        this.setTitle("Halaman Login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        usernameEditText = findViewById(R.id.activity_loginform_usernameEditText);
        passwordEditText = findViewById(R.id.activity_loginform_passwordEditText);
        loginButton = findViewById(R.id.activity_loginform_loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usernameEditText.getText().toString().equals("uasmobile") && passwordEditText.getText().toString().equals("uasmobilegenap")) {

                    Intent intent = new Intent(loginform.this,  MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Username and Passowrd",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    }
