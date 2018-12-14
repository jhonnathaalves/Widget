package com.example.jhonnatha.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtResultado;
    Button btnProcessar;
    EditText edtNome;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = (TextView)  findViewById(R.id.txtResultado);
        btnProcessar = (Button) findViewById(R.id.btnProcessar);
        btnProcessar.setOnClickListener(this);
        edtNome = (EditText) findViewById(R.id.edtNome);
    }

    public void clickBtnProcessar(View v){
        txtResultado.setText("Seja bem-vindo: "+edtNome.getText());

    }

    @Override
    public void onClick(View view) {
        txtResultado.setText("Seja bem-vindo: "+edtNome.getText());
    }
}
