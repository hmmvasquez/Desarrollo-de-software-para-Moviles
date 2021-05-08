package com.example.mvp_ejemplo;

public interface AlCuadrado {
    interface View {
        //Metodo para que se muestre el resultado
        void showResult(String result);
        void showError(String error);
    }
    interface Presenter {
        //Metodo para que se muestre el resultado
        void showResult(String result);
        void showError(String error);
        //El presentador se comunica con el modelo y necesitara el metodo alCuadrado
        void alCuadrado(String data);
    }

    interface  Model {
        void alCuadrado(String data);
    }
}
