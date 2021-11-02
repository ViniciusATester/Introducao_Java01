package intro;

public class Medidas {

    public static void main(String [] args) {

        calcularAreaModoCurto();
        calcularAreaModoExtenso();



    }
    public static void calcularAreaModoCurto(){
        System.out.println("Calculo de area modo curto");

        int largura = 4;
        int comprimento= 3;

        System.out.println( "A largura de "+largura +"m e o comprimento de "
                +comprimento+"m a area e de "+largura * comprimento+" m"  );
    }

        public static void calcularAreaModoExtenso(){

            System.out.println("Calculo de area modo extenso");
            int largura;
            int comprimento;
            int resultado;

            largura = 5;
            comprimento = 6;

            resultado = largura * comprimento;
            System.out.println( "A largura de "+largura +"m e o comprimento de "
                    +comprimento+"m a area e de "+resultado+" m"  );

    }

}
