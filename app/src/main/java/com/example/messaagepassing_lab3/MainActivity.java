package com.example.messaagepassing_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    static final String EXTRA_MESSAGE=".com.my.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        Intent intent= new Intent(this, DisplayMessageActivity.class);

        EditText editText= findViewById(R.id.editText);
        String message= editText.getText().toString();// get text from the editText and convert to string
        intent.putExtra(EXTRA_MESSAGE,message);//string and value
        startActivity(intent);

    }
}
