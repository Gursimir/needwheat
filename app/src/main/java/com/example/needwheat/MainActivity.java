package com.example.needwheat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1,textView2;
    ImageView imageView1,imageView2;
    EditText editText;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        textView1 = findViewById(R.id.customer);
        imageView1 = findViewById(R.id.customerimg);

        textView2 = findViewById(R.id.shopkeeper);
        imageView2 = findViewById(R.id.shopkeeperimg);

        editText = findViewById(R.id.customeret);

        imageView = findViewById(R.id.sendamount);

    }


    public void wheatAmount(View view) {
        
    }
}