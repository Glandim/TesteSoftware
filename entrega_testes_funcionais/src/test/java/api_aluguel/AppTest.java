package api_aluguel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class AppTest {
    private static float V_Nominal = 360;
    @Test public void T1GAL() {
        assertEquals(App.calcula(0, V_Nominal), -1);
    }
    
    @Test public void T2GAL() {
        float V_Esperado = new Float(324.00);
        assertEquals(App.calcula(1, V_Nominal), V_Esperado);
    }

    @Test public void T3GAL() {
        float V_Esperado = new Float(324.00);
        assertEquals(App.calcula(2, V_Nominal), V_Esperado);
    }

    @Test public void T4GAL() {
        float V_Esperado = new Float(324.00);
        assertEquals(App.calcula(4, V_Nominal), V_Esperado);
    }

    @Test public void T5GAL() {
        float V_Esperado = new Float(324.00);
        assertEquals(App.calcula(5, V_Nominal), V_Esperado);
    }
    
    @Test public void T6GAL() {
        float V_Esperado = new Float(342.00);
        assertEquals(App.calcula(6, V_Nominal), V_Esperado);
    }

    @Test public void T7GAL() {
        float V_Esperado = new Float(342.00);
        assertEquals(App.calcula(7, V_Nominal), V_Esperado);
    }
    
    @Test public void T8GAL() {
        float V_Esperado = new Float(342.00);
        assertEquals(App.calcula(9, V_Nominal), V_Esperado);
    }
    
    @Test public void T9GAL() {
        float V_Esperado = new Float(342.00);
        assertEquals(App.calcula(10, V_Nominal), V_Esperado);
    }

    @Test public void T10GAL() {
        float V_Esperado = new Float(360.00);
        assertEquals(App.calcula(11, V_Nominal), V_Esperado);
    }

    @Test public void T11GAL() {
        float V_Esperado = new Float(360.00);
        assertEquals(App.calcula(12, V_Nominal), V_Esperado);
    }

    @Test public void T12GAL() {
        float V_Esperado = new Float(360.00);
        assertEquals(App.calcula(14, V_Nominal), V_Esperado);
    }

    @Test public void T13GAL() {
        float V_Esperado = new Float(360.00);
        assertEquals(App.calcula(15, V_Nominal), V_Esperado);
    }
    
    @Test public void T14GAL() {
        float V_Esperado = new Float(367.56);
        assertEquals(App.calcula(16, V_Nominal), V_Esperado);
    }

    @Test public void T15GAL() {
        float V_Esperado = new Float(367.92);
        assertEquals(App.calcula(17, V_Nominal), V_Esperado);
    }
    
    @Test public void T16GAL() {
        float V_Esperado = new Float(372.24);
        assertEquals(App.calcula(29, V_Nominal), V_Esperado);
    }

    @Test public void T17GAL() {
        float V_Esperado = new Float(372.60);
        assertEquals(App.calcula(30, V_Nominal), V_Esperado);
    }
    
    @Test public void T18GAL() {
        assertEquals(App.calcula(31, V_Nominal), -1);
    }
}