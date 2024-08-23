import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            
        while (true) {  
            try {
                System.out.print("Digite o primeiro parametro: ");
                int parametro1 = sc.nextInt();

                System.out.print("Digite o segundo parametro: ");
                int parametro2 = sc.nextInt();
        
                contar(parametro1, parametro2);
            break;
            }
            catch (ParametrosInvalidosException e) {
                System.err.println("Erro: " + e.getMessage());
               
            }
        }
    }
    

	static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
		if (parametro1 > parametro2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
		
		for(int i=parametro1; i<=parametro2; i++)
            System.out.println("Imprimindo o numero " + i);
	}
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);

    }
}