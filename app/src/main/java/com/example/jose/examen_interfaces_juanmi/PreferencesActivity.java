package com.example.jose.examen_interfaces_juanmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class PreferencesActivity extends AppCompatActivity {
    TextView txtCheckBox;
    TextView txtTono;
    TextView textViewTono;
    CheckBox silentMode;
    TextView opcionesA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        txtCheckBox = (TextView) findViewById(R.id.textCheckBox);
        txtTono = (TextView) findViewById(R.id.titleTono);
        textViewTono = (TextView) findViewById(R.id.textViewTono);
        silentMode = (CheckBox) findViewById(R.id.checkBox);
        opcionesA = (TextView) findViewById(R.id.textViewOpcionesAvanzadas);


        txtTono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popUpMenu_tonos = new PopupMenu(PreferencesActivity.this, txtCheckBox);
                MenuInflater menuInflater = popUpMenu_tonos.getMenuInflater();
                menuInflater.inflate(R.menu.popup_menu_tonos, popUpMenu_tonos.getMenu());
                popUpMenu_tonos.show();

               popUpMenu_tonos.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                    boolean itemSelected = false;
                        switch (item.getItemId()) {
                            case R.id.tonoMono:
                                textViewTono.setText(item.getTitle());
                                itemSelected= true;
                                break;
                            case R.id.tonoClasic:
                                textViewTono.setText(item.getTitle());
                                itemSelected =true;
                                break;
                            case R.id.tonoPoli:
                                textViewTono.setText(item.getTitle());
                                itemSelected = true;
                                break;
                            case R.id.tonoModerno:
                                textViewTono.setText(item.getTitle());
                                itemSelected = true;
                                break;
                            default:
                                return false;

                        }
                        return itemSelected;
                    }});

        }});

        silentMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (silentMode.isChecked()){
                    txtCheckBox.setText("Modo silencioso Activado.");
                }else{
                 txtCheckBox.setText("Modo silencioso Desactivado.");
                }
            }
        });


        opcionesA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), OpcAvanzadasActivity.class);
                startActivity(i);
            }
        });
    }
}
