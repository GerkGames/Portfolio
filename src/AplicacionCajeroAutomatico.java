
import java.util.Scanner;

public class AplicacionCajeroAutomatico {
    public static void main(String[] args) {
    
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        double saldo = 1000.00;
        double monto = 0;
        
        
        while(!salir){
            System.out.println("""
                               *** Aplicación de cajero automático ***
                               
                               1. Consultar Saldo
                               2. Retirar
                               3. Depositar
                               4. Salir
                               
                               Escoge una opción: """);
            
            int opcion = teclado.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("Su saldo actual es de " + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar: " );
                    monto = teclado.nextDouble();
                    if(saldo < monto) {
                        System.out.println("No cuentas con el saldo suficiente, tu saldo actual es: " + saldo);
                    } else {
                        saldo -= monto;
                        System.out.println("Tu nuevo saldo es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto a depositar: ");
                    monto = teclado.nextDouble();
                    saldo += monto;
                    System.out.println("Tu saldo actual es de: " + saldo);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema, ¡Hasta pronto!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida...");
            }
        }
        
}
}