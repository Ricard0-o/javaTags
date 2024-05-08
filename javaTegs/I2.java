public class I2 {
    public static void main(String[] args) {
        
        System.out.println("Ordem crescente:");
        for (char letra = 'a'; letra <= 'z'; letra++) {
            System.out.print(letra + " ");
        }

        System.out.println("\nOrdem decrescente:");
        for (char letra = 'z'; letra >= 'a'; letra--) {
            System.out.print(letra + " ");
        }

    }
}