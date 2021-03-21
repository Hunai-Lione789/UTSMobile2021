package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tampilawal extends AppCompatActivity {

    private Button loginbtn;
    private Button profilebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilawal);

        loginbtn = findViewById(R.id.loginbtn);
        profilebtn = findViewById(R.id.profilebtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tampilawal.this,  loginform.class);
                startActivity(intent);

            }
        });
                profilebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Tampilawal.this, ProfilePage.class);
                        startActivity(intent);

                    }
                });

    }
}