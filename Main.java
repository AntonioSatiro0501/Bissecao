//Antonio Costa Satiro de Souza 10723636

public class Main {

    public static double funcao(double variavel){

        return (Math.log(variavel*variavel + 1) / Math.log(10)) -((variavel - 6) * (variavel - 6)) + 3;  
    }

    public static double bissecao(double a, double b, double erroAdimissivel){

        double m = a;
        double erro = Math.abs(b - a);
        double fa = funcao(a);
        double fb = funcao(b);

        if (fa * fb > 0){
            System.out.println("Tendo em vista os pontos apresentados, não exitem raizes");
            return 0.0;
        }

        while (erro > erroAdimissivel){
            
            m = (a + b) / 2.0;
            double fm = funcao(m);

            if(fa * fm < 0){
                b = m;
                fb = fm;
                
            }
            else{
                a = m;
                fa = fm;

            }

            erro = Math.abs(a - b) / 2.0;
        }
        
        System.out.println("Erro final: " + erro);
        System.out.println("Raiz aproximada: " + m);
        return m;
    }


    public static void main(String args[]){

        double a = 3;
        double b = 4;
        double erroAdimissivel = 0.1;

        double raiz = bissecao(a,b,erroAdimissivel);

    }

}