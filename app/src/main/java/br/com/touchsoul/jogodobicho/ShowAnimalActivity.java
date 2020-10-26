package br.com.touchsoul.jogodobicho;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowAnimalActivity extends AppCompatActivity {
    private int number;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_animal);

        getNumberFromIntent();

        setAnimalImage(number);

        buttonConfig();

    }

    private void getNumberFromIntent(){
        Bundle bundle = new Bundle();

        Intent i = getIntent();
        bundle = i.getExtras();

        number = bundle.getInt("number");
    }

    private void setAnimalImage(int number){
        ImageView iv_animal = findViewById(R.id.iv_animal);

        if (number == 0)
            iv_animal.setImageResource(R.drawable.animal_01);
        else if (number == 1)
            iv_animal.setImageResource(R.drawable.animal_02);
        else if (number == 2)
            iv_animal.setImageResource(R.drawable.animal_03);
        else if (number == 3)
            iv_animal.setImageResource(R.drawable.animal_04);
        else if (number == 4)
            iv_animal.setImageResource(R.drawable.animal_05);
        else if (number == 5)
            iv_animal.setImageResource(R.drawable.animal_06);
        else if (number == 6)
            iv_animal.setImageResource(R.drawable.animal_07);
        else if (number == 7)
            iv_animal.setImageResource(R.drawable.animal_08);
        else if (number == 8)
            iv_animal.setImageResource(R.drawable.animal_09);
        else if (number == 9)
            iv_animal.setImageResource(R.drawable.animal_10);
        else if (number == 10)
            iv_animal.setImageResource(R.drawable.animal_11);
        else if (number == 11)
            iv_animal.setImageResource(R.drawable.animal_12);
        else if (number == 12)
            iv_animal.setImageResource(R.drawable.animal_13);
        else if (number == 13)
            iv_animal.setImageResource(R.drawable.animal_14);
        else if (number == 14)
            iv_animal.setImageResource(R.drawable.animal_15);
        else if (number == 15)
            iv_animal.setImageResource(R.drawable.animal_16);
        else if (number == 16)
            iv_animal.setImageResource(R.drawable.animal_17);
        else if (number == 17)
            iv_animal.setImageResource(R.drawable.animal_18);
        else if (number == 18)
            iv_animal.setImageResource(R.drawable.animal_19);
        else if (number == 19)
            iv_animal.setImageResource(R.drawable.animal_20);
        else if (number == 20)
            iv_animal.setImageResource(R.drawable.animal_21);
        else if (number == 21)
            iv_animal.setImageResource(R.drawable.animal_22);
        else if (number == 22)
            iv_animal.setImageResource(R.drawable.animal_23);
        else if (number == 23)
            iv_animal.setImageResource(R.drawable.animal_24);
        else
            iv_animal.setImageResource(R.drawable.animal_25);
    }

    private void buttonConfig(){
        bt = findViewById(R.id.btn_voltar);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowAnimalActivity.super.finish();
            }
        });
    }
}
