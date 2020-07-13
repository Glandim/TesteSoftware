package api_aluguel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class AppTestCSVFile {

    @ParameterizedTest(name="Teste T{index}GAL => V_Nominal = {1}, Dia = {0} e V_Esperado = {3}")
    @CsvFileSource(resources="/csvresources.csv")
    public void calculaTestCSVFile(int Dia, float V_Nominal, float delta, float V_esperado) {
        assertEquals(V_esperado, App.calcula(Dia, V_Nominal), 0.01);
    }
}