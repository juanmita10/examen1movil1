package com.example.turisteando2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    Button buttonhoteles;
    Button buttonrestaurantes;
    Button buttonturismo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonhoteles=findViewById(R.id.botonhoteles);
        buttonrestaurantes=findViewById(R.id.botonrestaurantes);
        buttonturismo=findViewById(R.id.botonsitios);


        buttonhoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,HotelesHome.class);
                startActivity(intent);
            }
        });
        buttonrestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,RestaurantesHome.class);
                startActivity(intent);
            }
        });

        buttonturismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,TurismoHome.class);
                startActivity(intent);
            }
        });



    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int itemSelecionado=item.getItemId();
        switch (itemSelecionado){

            case (R.id.opcion1):
                Toast.makeText(this,"quiero que este en ingles", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.opcion2):
                Toast.makeText(this,"quiero que este en español", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.opcion3):
                Toast.makeText(this,"quiero ir a acerca de nosotros", Toast.LENGTH_SHORT).show();
                break;


        }
        return super.onOptionsItemSelected(item);
    }

    public void cambiarIdioma (){

    }

}