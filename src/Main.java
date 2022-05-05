import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenericStack numeros = new GenericStack();
        System.out.print("Introduce primer valor: ");
        int numUsuario1 = sc.nextInt();
        numeros.push(numUsuario1);
        System.out.print("Introduce segundo valor: ");
        int numUsuario2 = sc.nextInt();
        numeros.push(numUsuario2);
        System.out.println("¿Qué operación quieres realizar?");
        System.out.println("1.  Sumar");
        System.out.println("2.  Restar");
        System.out.println("3.  Multiplicar");
        System.out.println("4.  Dividir");
        System.out.println("Introduce tu respues: ");
        int respuesta = sc.nextInt();
        if (respuesta == 1){
            int numero1 = numeros.pop();
            int numero2 = numeros.pop();
            System.out.println("La suma es: " + (numero1 + numero2));
        } else if (respuesta == 2) {
            int numero1 = numeros.pop();
            int numero2 = numeros.pop();
            System.out.println("La resta es: " + (numero1 - numero2));
        }else if (respuesta == 3) {
            int numero1 = numeros.pop();
            int numero2 = numeros.pop();
            System.out.println("La multiplicación es: " + (numero1 * numero2));
        }else if (respuesta == 4) {
            int numero1 = numeros.pop();
            int numero2 = numeros.pop();
            System.out.println("La division es: " + (numero1 / numero2));
        }else{
            System.out.println("Valor incorrecto");
        }
    }
}