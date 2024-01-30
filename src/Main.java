public class Main {
    public static void main(String[] args) {

        VerificadorPrimo primos = new VerificadorPrimo();
        System.out.println("Verifica se numero é primo.");
        primos.verificarSeEhPrimo(50);

        GeradorPrimo proximoPrimo = new GeradorPrimo();
        System.out.println("Exibe proximo primo: " +proximoPrimo.gerarProximoPrimo(60));

        NumerosPrimos listaprimos = new NumerosPrimos();
        System.out.println("Lista todos os numeros primos a partir de um certo numero dado.");
        listaprimos.listarPrimos(100);


    }
}