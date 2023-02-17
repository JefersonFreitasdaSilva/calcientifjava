import java.util.Scanner;

public class CalculadoraCientifica {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;
        
        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextDouble();
        
        System.out.println("Digite a operação desejada (+, -, *, /, sen, cos, tan, log, exp): ");
        operador = scanner.next().charAt(0);
        
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("O resultado da soma é: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("O resultado da divisão é: " + resultado);
                }
                break;
            case 's':
                resultado = Math.sin(num1);
                System.out.println("O seno de " + num1 + " é: " + resultado);
                break;
            case 'c':
                resultado = Math.cos(num1);
                System.out.println("O cosseno de " + num1 + " é: " + resultado);
                break;
            case 't':
                resultado = Math.tan(num1);
                System.out.println("A tangente de " + num1 + " é: " + resultado);
                break;
            case 'l':
                resultado = Math.log10(num1);
                System.out.println("O logaritmo de " + num1 + " na base 10 é: " + resultado);
                break;
            case 'e':
                resultado = Math.exp(num1);
                System.out.println("O exponencial de " + num1 + " é: " + resultado);
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
        scanner.close();
    }
}