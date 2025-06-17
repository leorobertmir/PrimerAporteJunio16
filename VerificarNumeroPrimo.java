import java.util.Scanner;

public class VerificarNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
        
        scanner.close();
    }
    
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Si es divisible por i, no es primo
            }
        }
        return true; // Si no se encontró ningún divisor, es primo
    }
}

