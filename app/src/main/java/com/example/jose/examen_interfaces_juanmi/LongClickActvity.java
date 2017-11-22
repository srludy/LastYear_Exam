package com.example.jose.examen_interfaces_juanmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LongClickActvity extends AppCompatActivity {
    TextView txtInv;
    TextView txtAct;
    TextView txtOrg;
    TextView txtRep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_click_actvity);

        txtAct = (TextView) findViewById(R.id.txtAct);
        txtInv = (TextView) findViewById(R.id.txtInvi);
        txtOrg = (TextView) findViewById(R.id.txtOrg);
        txtRep = (TextView) findViewById(R.id.txtRep);


        txtAct.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(),txtAct.getText().toString(),Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        txtOrg.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(),txtOrg.getText().toString(),Toast.LENGTH_SHORT).show();
                return false;
            }
        });txtRep.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(),txtRep.getText().toString(),Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        txtInv.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(),txtInv.getText().toString(),Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }
}
