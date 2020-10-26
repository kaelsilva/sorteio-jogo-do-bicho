package br.com.touchsoul.jogodobicho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;

public class MainActivity extends AppCompatActivity {
    private Random r;
    private int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.btn_random_animal);
        
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                n = sortear();

                TextView tvanumber = findViewById(R.id.tv_animal_number);
                TextView tvaname = findViewById(R.id.tv_animal_name);

                if (n > 999)
                    tvanumber.setText("" + n);
                else if (n < 1000 && n > 99)
                    tvanumber.setText("0" + n);
                else if (n < 100 && n > 9)
                    tvanumber.setText("00" + n);
                else
                    tvanumber.setText("000" + n);


                final int posicaoVetor = descobrirNumeroDoBicho(n);

                tvaname.setText(""+animalsList.get(posicaoVetor));


                Button show_animal = findViewById(R.id.btn_show_animal);
                show_animal.setVisibility(View.VISIBLE);

                show_animal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), ShowAnimalActivity.class);

                        i.putExtra("number", posicaoVetor);

                        startActivity(i);
                    }
                });
            }
        });
    }


    public ArrayList<String> animalsList;

    public MainActivity() {
        animalsList = new ArrayList<String>();

        animalsList.add("Avestruz");
        animalsList.add("Águia");
        animalsList.add("Burro");
        animalsList.add("Borboleta");
        animalsList.add("Cachorro");
        animalsList.add("Cabra");
        animalsList.add("Carneiro");
        animalsList.add("Camelo");
        animalsList.add("Cobra");
        animalsList.add("Coelho");
        animalsList.add("Cavalo");
        animalsList.add("Elefante");
        animalsList.add("Galo");
        animalsList.add("Gato");
        animalsList.add("Jacaré");
        animalsList.add("Leão");
        animalsList.add("Macaco");
        animalsList.add("Porco");
        animalsList.add("Pavão");
        animalsList.add("Peru");
        animalsList.add("Touro");
        animalsList.add("Tigre");
        animalsList.add("Urso");
        animalsList.add("Veado");
        animalsList.add("Vaca");
    }

    private int sortear(){
        r = new Random();

        int n = r.nextInt(10000);

        return n;
    }

    public int descobrirNumeroDoBicho(int n){

        while (n % 4 != 0)
            n++;

        if (n == 0 || n > 9996 || (n > 99 && n%100 == 0))
            return 24; //numero da vaca é 24 na posição do arraylist

        if (n % 4 == 0 && n > 100)
            return ( n % 100 ) / 4 - 1; // o número do bicho no arraylist é n entre 1 e 25 subtraído de 1;

        if (n % 4 == 0 && n < 9)
            return n / 4 - 1;

        return n/4 - 1;
    }
}