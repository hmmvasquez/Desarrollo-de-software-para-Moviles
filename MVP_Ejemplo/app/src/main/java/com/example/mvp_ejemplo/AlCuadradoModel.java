package com.example.mvp_ejemplo;

//Implementamos la interfaz
public class AlCuadradoModel implements AlCuadrado.Model {
    //El modelo solo esta en contacto con el presentador
    private AlCuadrado.Presenter presenter;
    private double resultado;
    //Construimos el metodo AlCuadradoModel
    public AlCuadradoModel(AlCuadrado.Presenter presenter) {
        this.presenter = presenter;
    }

    //Interfaz
    @Override
    public void alCuadrado(String data) {
        if(data.equals("")){
            //Llamamos al presentador para mostrar el error
            presenter.showError("Campo Vacio");
        }else{
            resultado= Double.valueOf(data)*Double.valueOf(data);
            //Llamamos al presentador para mostrar el resultado
            presenter.showResult(String.valueOf(resultado));
        }
    }
}
