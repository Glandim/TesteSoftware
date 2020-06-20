package api_aluguel;

import java.util.Scanner;

public class Controle {
	public Scanner scanner;
	
	public Controle() {
		scanner = new Scanner(System.in);
	}
	
	public int Dia() {
		int D = scanner.nextInt();
		return D;
	}
	
	public float Valor_Nominal() {
        float VN = scanner.nextFloat();
		return VN;
	}
	
	@Override
	protected void finalize() throws Throwable {
		scanner.close();
	}
}