package com.example.android.geist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view that shows log in details
        TextView logInTextView = (TextView) findViewById(R.id.log_in);
        //set a ClickListener on that view
        logInTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link LogInActivity}
                Intent i = new Intent(MainActivity.this, LogInActivity.class);
                //start the new activity
                startActivity(i);
            }
        });

        //Find the view that shows sign up details
        TextView signUpTextView = (TextView) findViewById(R.id.sign_up);
        //set a ClickListener on that view
        signUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link SignUpActivity}
                Intent i = new Intent(MainActivity.this, SignUpActivity.class);
                //start the new activity
                startActivity(i);
            }
        });
    }
}
