package com.example.needwheat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView1,textView2,textView3,textView4;
    ImageView imageView,imageView1,imageView2,imageView3,imageView4;
    EditText editText;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        textView1 = findViewById(R.id.customer);
        imageView1 = findViewById(R.id.customerimg);

        textView2 = findViewById(R.id.shopkeeper);
        imageView2 = findViewById(R.id.shopkeeperimg);

        textView3 = findViewById(R.id.shopkeeper1);
        imageView3 = findViewById(R.id.shopkeeper1img);

        textView4 = findViewById(R.id.customer1);
        imageView4 = findViewById(R.id.customer1img);

        editText = findViewById(R.id.customeret);

        imageView = findViewById(R.id.sendamount);

        imageView.setOnClickListener(v -> {
            String amount = editText.getText().toString();
            textView1.setText("Could you please pack me "+amount+" kg of wheat flour.");
            imageView1.setImageResource(R.drawable.female_avatar);

            new Handler().postDelayed(() -> {
                imageView2.setImageResource(R.drawable.male_avatar);
                textView2.setText("Yes ma'am! wait a minute.");
            },1000);
            long flourAmount = Long.parseLong(amount),count3 = 0,count5 = 0;
            while (flourAmount>=5 || flourAmount == 3){
                if(flourAmount == 3 || flourAmount == 6 || flourAmount == 9){
                    flourAmount = flourAmount-3;
                    count3++;
                }else{
                    flourAmount = flourAmount - 5;
                    count5++;
                }
            }
            long finalFlourAmount = flourAmount;
            String count_3 = String.valueOf(count3),count_5 = String.valueOf(count5);
            new Handler().postDelayed(() -> {
                imageView3.setImageResource(R.drawable.male_avatar);
                if(finalFlourAmount == 0){
                    textView3.setText("There you have your "+amount+" kg of wheat flour packed in "+count_5+" 5Kg bags and "+count_3+" 3kg bags.");
                }else {
                    textView3.setText("Sorry we cant put the amount you want into 5 and 3kg bags.");
                }
            },2000);

            new Handler().postDelayed(() -> {
                imageView4.setImageResource(R.drawable.female_avatar);
                textView4.setText("Thankyou");
            },3000);
        });

    }

}