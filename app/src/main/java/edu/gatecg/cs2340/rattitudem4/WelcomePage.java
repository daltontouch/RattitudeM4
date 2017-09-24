package edu.gatecg.cs2340.rattitudem4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
    }

    /**
     * Called when someone hits the "log out" button
     */
    public void goBackBtn(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MainLogin.class);
        startActivity(intent);
    }
}
