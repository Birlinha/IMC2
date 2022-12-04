public class Strategy {
    public static String strategyIMC(double IMC) {
        String s = "";

        if(IMC < 17) {
            s = "Muito abaixo do peso!";
        }
        else if (IMC >= 17 || IMC < 18.5){
            s = "Abaixo do peso.";
        }
        else if (IMC >= 18.5 || IMC < 25){
            s = "Peso normal";
        }
        else if (IMC >= 25 || IMC < 30){
            s = "Acima do peso.";
        }
        else if (IMC >= 30 || IMC < 35){
            s = "Obesidade I";
        }
        else if (IMC >= 35 || IMC < 40){
            s = "Obesidade II";
        }
        else if (IMC >= 40){
            s = "Obesidade III (mórbida)";
        }

        return s;
    }
}
