package com.lau.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Java is linked to the layout called activity_main and not activity_page2
        // It can access all the elements under this layout (activity_main)
        setContentView(R.layout.activity_main);
        // Linking these 2 variables to the element Username and password on the layout
        // So now I can access these views (Username and password) entered by the user
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        // So findViewById is a function that takes a String as a parameter (Edit Text or Text view)
        // Every java file is linked to a layout in this case it's activity_main layout

    }
    public void login (View v){
        String correct_username = "charbel";
        String correct_password = "123123";

        String input_username = username.getText().toString();
        String input_password = password.getText().toString();

        if(input_username.equalsIgnoreCase(correct_username) && input_password.equals(correct_password)){
            String message = "Welcome " + input_username;
            Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
        }
        else{
            String message = "Invalid Credentials";
            Toast.makeText(getApplicationContext(),message, Toast.LENGTH_LONG).show();
        }
        // getText return an object so we have to cast it ti a string using toString Function

        /*String input_username = username.getText().toString();
        String message = "Hello "+input_username +"!";
        Toast.makeText(getApplicationContext(),message, Toast.LENGTH_LONG).show();*/

    }
}