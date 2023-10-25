package caracol;

class UnPozo {
    public static void main(String[] args) {
        final String FONDO_POZO = "[][][][][][][][][]";
        final String INICIO_POZO = "[]              []";
        final String CARRO = "[__]    O-=-O     [__]";
        final String METRO_CON_AGUA = "[]~~~~~~~~~~~~~~[]";
        final String POZO_CUERPO = "[]:. :. :. :. :.[]";
        final String CARACOL = "[]    _@)_/     []";

        int profundidadCaracol = 15;
        int profundidadAgua = profundidadCaracol + 3;

        System.out.println(INICIO_POZO);

        for(int profundidad = 1; profundidad <= 20; profundidad++) {

            if (profundidad == profundidadCaracol) {
                System.out.print(CARACOL);
            } else if (profundidad > profundidadAgua) {
                System.out.print(METRO_CON_AGUA);
            } else {
                System.out.print(POZO_CUERPO);
            }
            System.out.println("- -- " + profundidad);

        }

        System.out.println(FONDO_POZO);
    }    
}
