import java.util.Scanner;

public class CpfCollector {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cpf = "";
		
		cpf = scanner.next();
		
		if(apenasNumeros(cpf) && "-".equals(temHifen(cpf)) && tamanhoIdeal(cpf))
			System.out.println(cpf);
		else
			System.out.println("CPF NAO ACEITO");
	}
	
	public static boolean apenasNumeros(String cpf) {
		String numeros = "0123456789";
		
		cpf.replace("-", "");
		
		for(int i = 0; i < cpf.length(); i++) {
			if(!numeros.contains(String.valueOf(cpf.charAt(i))))
				return false;
		}
		
		return true;
	}
	
	public static String temHifen(String cpf) {
		String nHifens = "-";
		
		for(int i = 0; i < cpf.length(); i++) {
			if("-".equals(String.valueOf(cpf.charAt(i))))
				nHifens += "-";
		}
		
		return nHifens;
	}
	
	public static boolean tamanhoIdeal(String cpf) {
		return cpf.length() == 9;
	}
}