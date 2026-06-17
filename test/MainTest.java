package test;

public class MainTest {
    
 public static void main(String[] args) {
 assert calcularPromedio(10, 10, 10) == 10.0;
 assert calcularPromedio(20, 0, 20) == 13.333333333333334;
 System.out.println("Todas las pruebas pasaron.");
 }
 public static double calcularPromedio(int a, int b, int c) {
 return (a + b + c) / 3.0;
 }
}
