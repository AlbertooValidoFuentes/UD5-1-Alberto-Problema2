import com.alberto.datastructures.CustomStack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resultadoCalculo = 0;
        CustomStack pilaEnteros = new CustomStack();
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int primerNumero = scan.nextInt();
        pilaEnteros.push(primerNumero);

        System.out.println("Introduce el segundo numero: ");
        int segundoNumero = scan.nextInt();
        pilaEnteros.push(segundoNumero);
        scan.nextLine();

        System.out.println("Introduce el signo de una operación aritmética");
        String signoOperacion = scan.nextLine();

        switch (signoOperacion) {
            case "+":
                for (int i = 0; i < pilaEnteros.lenght; i++) {
                    resultadoCalculo += pilaEnteros.pop();
                }
                System.out.println("El resultado es: " + resultadoCalculo);
                break;
            case "-":
                for (int i = 0; i < pilaEnteros.lenght; i++) {
                    resultadoCalculo -= pilaEnteros.pop();
                }
                System.out.println("El resultado es " + resultadoCalculo);
                break;
            case "*":
                int numeroUno = pilaEnteros.pop();
                int numeroDos = pilaEnteros.pop();

                int resultadoMultiplicacion = numeroUno * numeroDos;
                System.out.println("El resultado es: " +  resultadoMultiplicacion);
                break;
            case "/":
                int numeroUnoDivision = pilaEnteros.pop();
                int numeroDosDivision = pilaEnteros.pop();

                int resultadoDivision = numeroUnoDivision / numeroDosDivision;
                System.out.println("El resultado es: " + resultadoDivision);
                break;
            default:
                System.out.println("El dato introducido no es correcto.");
        }
    }
}