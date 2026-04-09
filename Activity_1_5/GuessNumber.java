import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Generar un número aleatorio entre 0 y 99
        int randomNumber = (int)(Math.random() * 100);
        
        System.out.println("Guess a magic number between 0 and 99");
        
        // Inicializar la variable guess
        int guess = -1;
        
        // Ciclo que continúa hasta que el usuario adivine el número
        while (guess != randomNumber) {
            // Solicitar al usuario que ingrese un número
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();
            
            // Verificar si la respuesta es correcta, menor o mayor
            if (guess == randomNumber) {
                System.out.println("Yes, the number is " + randomNumber);
            } else if (guess < randomNumber) {
                System.out.println("Your guess is lower than the number");
            } else {
                System.out.println("Your guess is higher than the number");
            }
        }
        
        // Cerrar el scanner como buena práctica
        input.close();
    }
}
