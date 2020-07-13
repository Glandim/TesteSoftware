package api_aluguel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AppTestCSVString {

    @ParameterizedTest(name="Teste T{index}GAL => V_Nominal = {1}, Dia = {0} e V_Esperado = {3}")
    @CsvSource(value = {
        "0,360.00,0.01,-1",
        "1,360.00,0.01,324.00",
        "2,360.00,0.01,324.00",
        "4,360.00,0.01,324.00",
        "5,360.00,0.01,324.00",
        "6,360.00,0.01,342.00",
        "7,360.00,0.01,342.00",
        "9,360.00,0.01,342.00",
        "10,360.00,0.01,342.00",
        "11,360.00,0.01,360.00",
        "12,360.00,0.01,360.00",
        "14,360.00,0.01,360.00",
        "15,360.00,0.01,360.00",
        "16,360.00,0.01,367.56",
        "17,360.00,0.01,367.92",
        "29,360.00,0.01,372.24",
        "30,360.00,0.01,372.60",
        "31,360.00,0.01,-1",
        "1,0,0.01,0.0",
        "1,-0.01,0.01,-0.009000000000000001",
        "1,0.01,0.01,0.009000000000000001"})
    public void calculaTestCSVString(int Dia, float V_Nominal, float delta, float V_Esperado) {
        assertEquals(V_Esperado, App.calcula(Dia, V_Nominal), 0.01);
    }
}