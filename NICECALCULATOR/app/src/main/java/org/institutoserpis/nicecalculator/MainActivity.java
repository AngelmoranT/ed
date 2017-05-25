package org.institutoserpis.nicecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button sumar, resta, mult, divi;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        sumar = (Button) findViewById(R.id.sumar);
        resta = (Button) findViewById(R.id.restar);
        mult = (Button) findViewById(R.id.mult);
        divi = (Button) findViewById(R.id.divi);

        resultado= (TextView) findViewById(R.id.resultado);

        sumar.setOnClickListener(this);
        resta.setOnClickListener(this);
        mult.setOnClickListener(this);
        divi.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1=Integer.parseInt(n1);
        int entero2=Integer.parseInt(n2);

        int rta=0;


        switch (v.getId()){
            case R.id.sumar:
                rta=entero1+entero2;
                break;
            case R.id.restar:
                rta=entero1-entero2;
                break;
            case R.id.mult:
                rta=entero1*entero2;
                break;
            case R.id.divi:
                rta=entero1/entero2;
                break;

        }


        resultado.setText(""+rta);


    }
}
