package api_aluguel;

public class Aluguel {
    public float valor_nominal;
    public int dia;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public float getValor_nominal() {
        return valor_nominal;
    }

    public void setValor_nominal(float valor_nominal) {
        this.valor_nominal = valor_nominal;
    } 
}