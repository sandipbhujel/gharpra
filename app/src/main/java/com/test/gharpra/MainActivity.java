package com.test.gharpra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view){
        EditText txtName = findViewById(R.id.name);
        EditText txtEmail = findViewById(R.id.email);
        TextView txtShow = findViewById(R.id.show);
        txtShow.setText("Hello, "+txtName.getText().toString()+ " Welcome to our site");
    }
}