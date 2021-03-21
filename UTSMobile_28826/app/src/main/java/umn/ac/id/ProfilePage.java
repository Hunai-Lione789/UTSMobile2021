package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ProfilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        this.setTitle("Profil Saya");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}