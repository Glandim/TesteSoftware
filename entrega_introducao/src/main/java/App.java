package main.java;

import main.model.VerificarLista;

public class App{
    public static void main(String [] args){
        VerificarLista ver = new VerificarLista();
        float[] lista = {1.1f,2.2f,3.3f};
        float num = 3.3f;
        System.out.println(ver.verificarFloat(lista, num));
    }
}

