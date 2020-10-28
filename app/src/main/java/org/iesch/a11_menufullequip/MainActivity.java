package org.iesch.a11_menufullequip;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rely_calculadora, rely_Amigos, rely_chat, rely_musica, rely_galeria, rely_mapas, rely_tiempo, rely_ajustes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rely_calculadora = findViewById(R.id.imgCalculadora);
        rely_Amigos = findViewById(R.id.ListaAmigos);
        rely_chat = findViewById(R.id.imgChat);
        rely_musica = findViewById(R.id.Musica);
        rely_galeria = findViewById(R.id.imgGalería);
        rely_tiempo = findViewById(R.id.imgTiempo);
        rely_mapas = findViewById(R.id.Mapas);
        rely_ajustes findViewById(R.id.Ajustes);

        rely_calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity.this, CalculadoraActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
    }
}