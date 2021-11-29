package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    EditText txt_Idade;
    EditText txt_Altura;
    EditText txt_Peso;
    Button btn_Calular;
    Button btn_Limpar;
    TextView txt_Resultado;
    TextView txt_Status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_Idade = findViewById(R.id.txt_Idade);
        txt_Altura = findViewById(R.id.txt_Altura);
        txt_Peso = findViewById(R.id.txt_Peso);
        btn_Calular = findViewById(R.id.btn_Calcular);
        txt_Resultado = findViewById(R.id.txt_Resultado);
        txt_Status = findViewById(R.id.txt_Status);
        btn_Limpar = findViewById(R.id.btn_Limpar);



        btn_Calular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    int idade = Integer.parseInt(txt_Idade.getText().toString());
                    double altura = Double.parseDouble(txt_Altura.getText().toString());
                    double peso = Double.parseDouble(txt_Peso.getText().toString());
                    IMC imc = new IMC(idade,altura, peso);
                    DecimalFormat decimal = new DecimalFormat("0.00");
                    txt_Resultado.setText("IMC: "+ decimal.format(imc.calcular_imc()));
                    txt_Status.setText("Status: "+ imc.status());
                }catch (Exception error){
                }

            }
        });

        btn_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_Idade.setText("");
                txt_Altura.setText("");
                txt_Peso.setText("");
                txt_Resultado.setText("");
                txt_Status.setText("");
            }
        });

    }
}