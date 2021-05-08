package com.example.mvp_ejemplo;

//Implementamos el presentador
public class AlCuadradoPresenter implements AlCuadrado.Presenter {
//El presentador esta en contacto con la vista y con el modelo
    private AlCuadrado.View view;
    private AlCuadrado.Model model;

//Constructo del AlCuadradoPresenter
    public AlCuadradoPresenter(AlCuadrado.View view){
        this.view = view;
        model = new AlCuadradoModel(this);
    }

//Interfaz
    @Override
    public void showResult(String result) {
        //Comprobamos que la vista exista
        if(view!=null){
            view.showResult(result);
        }
    }

    @Override
    public void alCuadrado(String data) {
        //Comprobamos que la vista exista
        if(view!=null){
            model.alCuadrado(data);
        }
    }

    @Override
    public void showError(String error) {
        if(view!=null){
            view.showError(error);
        }
    }

}
