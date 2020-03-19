package com.example.mapsreto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddMarker extends AppCompatActivity {

    private TextView Tv_añadir;
    private EditText edt_nombreMarcador;
    private Button btn_agregar;
    private Marcador marcador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_marker);

        Tv_añadir = findViewById(R.id.Tv_anadir);
        edt_nombreMarcador = findViewById(R.id.edt_nombreMarcador);
        btn_agregar = findViewById(R.id.btn_agregar);


        marcador = (Marcador) getIntent().getExtras().getSerializable("marcador");

        btn_agregar.setOnClickListener(
                (v) -> {
                    if(edt_nombreMarcador.getText().toString()!=null) {
                        Intent i = new Intent();
                        marcador.setTitulo(edt_nombreMarcador.getText().toString());
                        i.putExtra("marcador", marcador);
                        setResult(RESULT_OK, i);
                        finish();
                    }
                }
        );


    }



}