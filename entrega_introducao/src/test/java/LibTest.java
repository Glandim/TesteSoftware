package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import main.model.VerificarLista;

public class LibTest{
    @Test

    public void VerificarTesteInt(){
        VerificarLista verTest = new VerificarLista();
        int[] lista = {2,4,6,8};
        int num = 8;
        boolean resultado = verTest.verificar(lista, num);
        assertEquals(true, resultado);
    }   

    @Test
    
    public void VerificarTesteFloat(){
        VerificarLista verTest = new VerificarLista();
        float[] lista = {1.1f,2.2f,3.3f};
        float num = 3.3f;
        boolean resultado = verTest.verificarFloat(lista, num);
        assertEquals(true, resultado); 
    }
}