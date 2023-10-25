import java.util.Scanner;

class Caracol {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double profundidadCaracol = (int)(Math.random() * 10) + 10;
        int dia = 0;
        int subidaMaxima = 4;
        int bajadaMaxima = 2;
        boolean estaAdentro = true;
        boolean estaVivo = true;
        int profundidadLluvia = 0;
        int profundidadPozo = 20;

        final String BORDE = "[__]";
        final String INICIO_POZO = "[__]              [__]";
        final String INICIO_POZO_CARRO = "[__]    O-=-O     [__]";
        final String METRO_CON_AGUA = "[]~~~~~~~~~~~~~~[]";
        final String METRO = "[]:. :. :. :. :.[]";
        final String CARACOL = "[]    _@)_/     []";

        while(estaAdentro && estaVivo) {
            dia++;
            System.out.println("Dia " + dia);
            System.out.println("El caracol esta a [" + profundidadCaracol + "]");
            if(dia == 50) {
                estaVivo = false;
                System.out.println("El caracol murio");
                continue;
            }

            if(profundidadCaracol < 0) {
                estaAdentro = false;
                System.out.println("El caracol salio!");
                continue;
            }

            subidaMaxima = dia >= 10 ? subidaMaxima = 3 : subidaMaxima;
            subidaMaxima = dia >= 20 ? subidaMaxima = 2 : subidaMaxima;

            double subidaDelDia = (Math.random() * (subidaMaxima - 1)) + 1;
            System.out.println("El caracol subio " + subidaDelDia);
            profundidadCaracol -= subidaDelDia;

            double bajadaDelDia = (Math.random() * (bajadaMaxima - 0)) + 0;

            double hayCarro = Math.random();
            if (hayCarro == 0.35) {
                System.out.println("Paso un carro");
                profundidadCaracol = profundidadCaracol + 2;
            }

            double lluvia = Math.random();
            if (lluvia == 0.05) {
                profundidadPozo -= 5;    
            } else if (lluvia == 0.10) {
                
            }

            System.out.println("El caracol bajo " + bajadaDelDia);
            profundidadCaracol += bajadaDelDia;

            System.out.println("El caracol esta en " + profundidadCaracol);

            String input = myScanner.nextLine();

        }

        // String contador = "Dia [" + dia + "] / Sube: [" + subida + "] / Baja: [" + bajada + "] / Altura al final del dia: [" + profundidadCaracol + "]";
        
        // System.out.println(contador);

    }
}