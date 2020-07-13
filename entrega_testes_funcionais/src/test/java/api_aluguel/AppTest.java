package api_aluguel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class AppTest {
    private static float V_Nominal = 360;
    @Test public void T1GAL() {
        assertEquals(-1, App.calcula(0, V_Nominal), 0.01);
    }
    
    @Test public void T2GAL() {
        float V_Esperado = new Float(324.00);
        assertEquals(V_Esperado, App.calcula(1, V_Nominal), 0.01);
    }

    @Test public void T3GAL() {
        float V_Esperado = new Float(324.00);
        assertEquals(V_Esperado, App.calcula(2, V_Nominal), 0.01);
    }

    @Test public void T4GAL() {
        float V_Esperado = new Float(324.00);
        assertEquals(V_Esperado, App.calcula(4, V_Nominal), 0.01);
    }

    @Test public void T5GAL() {
        float V_Esperado = new Float(324.00);
        assertEquals(V_Esperado, App.calcula(5, V_Nominal), 0.01);
    }
    
    @Test public void T6GAL() {
        float V_Esperado = new Float(342.00);
        assertEquals(V_Esperado, App.calcula(6, V_Nominal), 0.01);
    }

    @Test public void T7GAL() {
        float V_Esperado = new Float(342.00);
        assertEquals(V_Esperado, App.calcula(7, V_Nominal), 0.01);
    }
    
    @Test public void T8GAL() {
        float V_Esperado = new Float(342.00);
        assertEquals(V_Esperado, App.calcula(9, V_Nominal), 0.01);
    }
    
    @Test public void T9GAL() {
        float V_Esperado = new Float(342.00);
        assertEquals(V_Esperado, App.calcula(10, V_Nominal), 0.01);
    }

    @Test public void T10GAL() {
        float V_Esperado = new Float(360.00);
        assertEquals(V_Esperado, App.calcula(11, V_Nominal), 0.01);
    }

    @Test public void T11GAL() {
        float V_Esperado = new Float(360.00);
        assertEquals(V_Esperado, App.calcula(12, V_Nominal), 0.01);
    }

    @Test public void T12GAL() {
        float V_Esperado = new Float(360.00);
        assertEquals(V_Esperado, App.calcula(14, V_Nominal), 0.01);
    }

    @Test public void T13GAL() {
        float V_Esperado = new Float(360.00);
        assertEquals(V_Esperado, App.calcula(15, V_Nominal), 0.01);
    }
    
    @Test public void T14GAL() {
        float V_Esperado = new Float(367.56);
        assertEquals(V_Esperado, App.calcula(16, V_Nominal), 0.01);
    }

    @Test public void T15GAL() {
        float V_Esperado = new Float(367.92);
        assertEquals(V_Esperado, App.calcula(17, V_Nominal), 0.01);
    }
    
    @Test public void T16GAL() {
        float V_Esperado = new Float(372.24);
        assertEquals(V_Esperado, App.calcula(29, V_Nominal), 0.01);
    }

    @Test public void T17GAL() {
        float V_Esperado = new Float(372.60);
        assertEquals(V_Esperado, App.calcula(30, V_Nominal), 0.01);
    }
    
    @Test public void T18GAL() {
        assertEquals(-1, App.calcula(31, V_Nominal), 0.01);
    }
    
    @Test public void T19GAL() {
        float V_Esperado = new Float(0.00);
        assertEquals(V_Esperado, App.calcula(1, 0), 0.01);
    }
    
    @Test public void T20GAL() {
        float V_Esperado = new Float(-0.009000000000000001);
        float V_Inserido = new Float(-0.01);
        assertEquals(V_Esperado, App.calcula(1, V_Inserido), 0.01);
    }
    
    @Test public void T21GAL() {
        float V_Esperado = new Float(0.009000000000000001);
        float V_Inserido = new Float(0.01);
        assertEquals(V_Esperado, App.calcula(1, V_Inserido), 0.01);
    }
}