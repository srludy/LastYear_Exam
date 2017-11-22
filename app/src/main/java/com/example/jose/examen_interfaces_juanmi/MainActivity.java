package com.example.jose.examen_interfaces_juanmi;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtNom ;
    EditText txtLocal;
    TextView cuadro1;
    TextView cuadro2;
    TextView cuadro3;
    Button btnAbrir;
    Button btnSeleccionar;

    final static int preferencesActivity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNom = (EditText) findViewById(R.id.textNom);
        txtLocal = (EditText) findViewById(R.id.textLocal);
        cuadro1 = (TextView) findViewById(R.id.cuadro1);
        cuadro2 = (TextView) findViewById(R.id.cuadro2);
        cuadro3 = (TextView) findViewById(R.id.cuadro3);
        btnAbrir = (Button) findViewById(R.id.btnAbrir);
        btnSeleccionar = (Button) findViewById(R.id.btnSelc);


        registerForContextMenu(txtNom);
        registerForContextMenu(txtLocal);

        setCuadroListeners();
    }

    private void setCuadroListeners() {
        cuadro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuadro1.setBackgroundColor(Color.parseColor("#5977867A"));
            }
        });
        cuadro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuadro2.setBackgroundColor(Color.parseColor("#5978867A"));
            }
        });
        cuadro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuadro3.setBackgroundColor(Color.parseColor("#5978867A"));
            }
        });

        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnSeleccionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LongClickActvity.class);
                startActivity(i);
            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.datos:
                break;
            case R.id.Preferencias:
                Intent i = new Intent(this, PreferencesActivity.class );
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
