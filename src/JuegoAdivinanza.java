
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    
    
    public static void main(String[] args) {
    
        final int INTENTOS_MAX = 10;
        int numero = 0;
        int contador = 1;
        
        Random r = new Random();
        
        
        Scanner teclado = new Scanner(System.in);
        
        
        
        System.out.println("""
                           Bienvenido al juego de adivinar el número.
                           El número secreto está entre el 1 y el 50
                           ¿Podrás adivinarlo?
                           -----------------------------------------
                           Tendrás 10 intentos para adivinarlo""");
        
        //Creación del número random
        int numeroRandom = r.nextInt(50)+1;
        
        //hago un bucle while que saldrá de el si se adivina el número secreto o el contador supera las oportunidades puestas en la constante.
        while(contador < INTENTOS_MAX && numero != numeroRandom) {
            
            //Indico el número del intento en el que se encuentra el jugador.
            System.out.println("Intento número: " + contador);
            
            System.out.println("¿Cual es el número secreto?");
            
            //pido al jugador el número.
            numero = teclado.nextInt();
            
            
            //creo este else-if para ayudar al jugador diciendole si su número es mayor o menor que el número secreto.
            if(numero > numeroRandom) {
                System.out.println("Equivocado, número que ingresaste es mayor al número secreto");
                System.out.println("-----------------------------------------");
            } else if (numero < numeroRandom) {
                System.out.println("Equivocado, número que ingresaste es menor al número secreto");
                System.out.println("-----------------------------------------");
            }
            
            //uso este if para que aumente el contador si el número que pasa el jugador no coincide con el número secreto
            //con esto evito que si el jugador adivina a la primera no le salga el mensaje correspondiente.
            if(numero != numeroRandom) {
            contador++;
            }
            
            
            //este ultimo if es para indicarle que es su ultimo intento.
            if(contador == INTENTOS_MAX) {
                System.out.println("Ultimo intento... Suerte!");
                System.out.println("¿Cual es el número secreto?");
                numero = teclado.nextInt();
            }
            
        }
        
        //************************************
        //     CONCLUSIÓN DEL JUEGO
        //************************************
        
        //este else-if para felicitar al jugador si ha ganado o para decirle que ha perdido.
        if(numero != numeroRandom) {
            System.out.println("\nEsta vez no ha podido ser, ¡Suerte para la proxima!");
        } else if(contador > 1) {
            System.out.printf("\nCORRECTO!! el número secreto era el %d lo has encontrado en %d intentos! :D\n", numeroRandom, contador);
            System.out.println("¿Podrás lograrlo en menos intentos?");
        } else if(contador == 1) {
            System.out.println("\nEres el mejor, lo has adivinado a la primera!!");
            System.out.println("El número secreto era el: " + numeroRandom);
        }
        
}
}
