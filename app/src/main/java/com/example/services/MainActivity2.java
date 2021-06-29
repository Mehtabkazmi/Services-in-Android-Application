package com.example.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    Button showinformation,storeinformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        showinformation=findViewById(R.id.showinformation);
        storeinformation=findViewById(R.id.storeinformation);
        textView=findViewById(R.id.textview);

        storeinformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,prefsActivity.class);
                startActivity(intent);
            }
        });
        showinformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displaySharedPreferences();
            }
        });
    }
    private void displaySharedPreferences(){
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(MainActivity2.this);
        String UserName=prefs.getString("username","Default NickName");
        String pass=prefs.getString("password","Default Password");
        boolean checkBox=prefs.getBoolean("checkBox",false);
        String ListPrefs=prefs.getString("List Prefs", "Default list Prefs");


        StringBuilder builder=new StringBuilder();
        builder.append("Username"+UserName+"\n");
        builder.append("Password"+pass+"\n");
        builder.append("Keep me Logged in"+String.valueOf(checkBox)+"\n");
        builder.append("Username"+ListPrefs);
        textView.setText(builder.toString());
    }
}