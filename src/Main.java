import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota1, nota2, nota3, promedio;
        System.out.print("Ingrese nota 1: ");
        nota1 = scanner.nextInt();
        System.out.print("Ingrese nota 2: ");
        nota2 = scanner.nextInt();
        System.out.print("Ingrese nota 3: ");
        nota3 = scanner.nextInt();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + promedio);
    }

}
