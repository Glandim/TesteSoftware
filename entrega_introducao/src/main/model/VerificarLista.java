package main.model;

import com.google.common.primitives.Ints; 
import com.google.common.primitives.Floats;
import java.util.Arrays;

public class VerificarLista{
    public boolean verificar(int[] lista, int num){
        return Ints.contains(lista, num);
    }
    public boolean verificarFloat(float[] lista, float num){
        return Floats.contains(lista, num);
    }
}
