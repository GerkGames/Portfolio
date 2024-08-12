
import java.util.Scanner;

public class ValidacionPassword {
    
    
    public static void main(String[] args) {
    
        //Booleano para salir del bucle
        boolean salir = false;
        String password;
        
        Scanner teclado = new Scanner(System.in);
        
        
        
        //Impresión en pantalla de las instrucciones para el usuario.
        System.out.printf("""
                               *** Creando contraseña ***
                               
                               La contraseña debe tener como minimo 6 caracteres
                               
                               Escriba su contraseña: """);
        
        //bucle while para volver a pedir la contraseña si el usuario no cumple con la condición de la misma.
        while (!salir) {
            
            password = teclado.nextLine();
            System.out.println("-------------------------------------------");
            
            
            //con esta condición del if, indico que la contraseña no puede tener menos de 6 letras.
            if(password.length() < 6) {
                System.out.printf("\nError: Su contraseña tiene menos de 6 caracteres.\n\nEscriba una nueva contraseña: ");
                
            } else {
                System.out.printf("\nContraseña creada correctamente.\nSu contraseña actual es: %s\n", password.toUpperCase());
                salir = true;
            }
            
        } 
}
}
