package br.com.touchsoul.jogodobicho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn_random_animal);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int n = sortear();

                int numero = n+1;

                TextView tvanumber = findViewById(R.id.tv_animal_number);

                tvanumber.setText(""+(numero));

                TextView tvaname = findViewById(R.id.tv_animal_name);

                tvaname.setText(""+animalsList.get(n));
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
        int n = ThreadLocalRandom.current().nextInt(0, 25);

        return n;
    }

}