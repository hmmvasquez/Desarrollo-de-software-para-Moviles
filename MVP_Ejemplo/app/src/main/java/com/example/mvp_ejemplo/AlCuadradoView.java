package com.example.mvp_ejemplo;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;
//Implementamos la interfaz de la vista
public class AlCuadradoView extends AppCompatActivity implements AlCuadrado.View {

    private TextView tvAlCuadrado;
    private EditText edAlCuadrado;
//Creamos el presentador
    private AlCuadrado.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvAlCuadrado=(TextView)findViewById(R.id.tvAlCuadrado);
        edAlCuadrado=(EditText)findViewById(R.id.edAlCuadrado);
        //Inicializamos el presentador
        presenter = new AlCuadradoPresenter(this);
    }
//Le pasamos la vista al metodo calcular
    public void calcular(View view) {
        presenter.alCuadrado(edAlCuadrado.getText().toString());
    }
//Interfaz
    @Override
    public void showResult (String result) {
        //Mostramos el resultado en el text view
        tvAlCuadrado.setText(result);
    }

    @Override
    public void showError (String error) {
        //Mostramos el error en el text view
        tvAlCuadrado.setText(error);
    }
}