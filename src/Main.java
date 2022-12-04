
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o seu peso?");
        double peso = scanner.nextDouble();

        System.out.print("Qual a sua altura?");
        double altura = scanner.nextDouble();

        double IMC = CalculadoraIMC.meuIMC(peso,altura);

        System.out.println(IMC);
        System.out.println(Strategy.strategyIMC(IMC));
    }
}