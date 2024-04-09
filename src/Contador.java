import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
            
    int primeiroNumero;
    int segundoNumero;

    Scanner leitura = new Scanner(System.in);

    System.out.println("Informe o primeiro número: ");
    primeiroNumero = leitura.nextInt();

    System.out.println("Informe o primeiro número: ");
    segundoNumero = leitura.nextInt();

    try {
        contar(primeiroNumero, segundoNumero);
        
    } catch (ParametrosInvalidosException ex) {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
    }
        
}

    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {

        if (segundoNumero <= primeiroNumero) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        
        int contagem = segundoNumero - primeiroNumero;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número "+i);
        }
    }

}
