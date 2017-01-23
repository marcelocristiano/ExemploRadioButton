package com.example.marcelo.exemploradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Cria as variaveis que receberam os views.
    EditText edtNome;
    Button btnMostrar;
    TextView tvNome, tvSexo;
    RadioGroup rdgSexo;
    RadioButton rbMasculino, rbFeminino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recupera os views;
        edtNome = (EditText) findViewById(R.id.edt_nome);
        btnMostrar = (Button) findViewById(R.id.btn_mostrar);
        tvNome = (TextView) findViewById(R.id.tv_nome);
        tvSexo = (TextView) findViewById(R.id.tv_sexo);
        rdgSexo = (RadioGroup) findViewById(R.id.rdg_sexo);
        rbMasculino = (RadioButton) findViewById(R.id.rb_masculino);
        rbFeminino = (RadioButton) findViewById(R.id.rb_feminino);

        // Metodo de click no botão btnMostrar;
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Seta o valor que o tvNome ira receber.
                tvNome.setText(edtNome.getText().toString());
                // Seta o valor que o tvSexo ira receber.
                // Verifica quel radio button esta selecionado.
                switch (rdgSexo.getCheckedRadioButtonId()){
                    // Se o id selecionado for igual a o id do rbMasculino o valor do tvSexo recebera masculino
                    case R.id.rb_masculino:
                        tvSexo.setText("Masculino");
                        break;
                    // Se o id selecionado for igual a o id do rbFeminino o valor do tvSexo recebera Feminino
                    case R.id.rb_feminino:
                        tvSexo.setText("Feminino");
                        break;
                }
            }
        });
    }
}
