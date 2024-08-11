
import java.util.Scanner;

public class Calculadora {
    
    
    public static void main(String[] args) {
    
        //Este booleano lo utilizaré para salir del bucle.
        boolean salir = false;
        
        double valor1 = 0;
        double valor2 = 0;
        double resultado;
        
        Scanner teclado = new Scanner(System.in);
        
        while(!salir) {
            System.out.printf("""
                               
                               ***Calculadora en JAVA***
                               Operaciones que puedes realizar
                               
                               1. Suma
                               2. Resta
                               3. Multiplicación
                               4. División
                               5. Salir
                               
                               Escoge una opción: """);
            
            //Se le pide por teclado al usuario que elija una opción
            int opcion = teclado.nextInt();
            
            //Con este if limito que si la opcion esta entre en 1 y el 4 se le pida valores al usuario para hacer el cálculo
            if (opcion >= 1 && opcion <= 4) {
                System.out.printf("Dame el valor 1: ");
                valor1 = teclado.nextDouble();
                System.out.printf("Dame el valor 2: ");
                valor2 = teclado.nextDouble();
            }
            
            //Utilizo un switch para hacer el cálculo correspondiente según la opción dada por el usuario.
            switch(opcion) {
                case 1:
                    resultado = valor1 + valor2;
                    System.out.printf("El resultado de la suma es: %.2f\n ", resultado);
                    break;
                case 2:
                    resultado = valor1 - valor2;
                    System.out.printf("El resultado de la resta es: %.2f\n ", resultado);
                    break;
                case 3:
                    resultado = valor1 * valor2;
                    System.out.printf("El resultado de la multiplicación es: %.2f\n ", resultado);
                    break;
                case 4:
                    if(valor2 == 0) {
                        System.out.println("Error: División por cero");
                    } else {
                        resultado = valor1 / valor2;
                        System.out.printf("El resultado de la división es: %.2f\n ", resultado);
                    }
                    break;
                case 5:
                    System.out.println("Cerrando calculadora.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, elija otra opción por favor.");
            }
        }
}
}
