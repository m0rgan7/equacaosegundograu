import java.util.Scanner;
public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();
        
        if (a == 0) {
            System.out.println("O valor de 'a' nao pode ser igual a zero. A equacao nao e do segundo grau.");
            return;
        }
        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = scanner.nextDouble();
        
        double delta = b * b - 4 * a * c;
        
        if (delta < 0) {
            System.out.println("A equacaao nao possui raizes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equacao possui apenas uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equacao possui duas raizes reais:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
    }
}
