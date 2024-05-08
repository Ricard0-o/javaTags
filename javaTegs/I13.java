public class I13 {
    public static void main(String[] args) {
        
        int somaImpares = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                somaImpares += i;
            }
        }

        System.out.println("Soma dos números ímpares de 1 a 20: " + somaImpares);
        long multiplicacaoPares = 1;
        
        for (int i = 2; i <= 20; i += 2) {
            multiplicacaoPares *= i;
        }
        
        System.out.println("Multiplicação dos números pares de 1 a 20: " + multiplicacaoPares);
    }
}