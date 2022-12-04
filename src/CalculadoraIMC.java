public class CalculadoraIMC {
    public static double meuIMC(double peso, double altura) {
        double quadrado_h = altura * altura;
        return (peso/(quadrado_h) );
    }
}
