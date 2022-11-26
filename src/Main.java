import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String funcionario1 = "NUMERO DO FUNCIONARIO: 102030";
        String funcionario2 = "NUMERO DO FUNCIONARIO: 203040";
        String funcionario3 = "NUMERO DO FUNCIONARIO: 304050";

                 char gender1 = 'M';
                 char gender2 = 'F';
                 char gender3 = 'M';

                     float salario1 =  5.50f;
                     double salario2 = 20.50;
                     double salario3 = 15.55;
                     float horas = 8f;
                     float dias = 30f;
                     var teste = salario1 * dias * horas ;

        System.out.println("FUNCIONARIOS:" + System.lineSeparator());

        System.out.println(funcionario1);
        System.out.println("GENERO: " + gender1);
        System.out.println(teste+"0" + System.lineSeparator());

        System.out.println(funcionario2);
        System.out.println("GENERO: " + gender2);
        System.out.println(salario2 * 8 * 30 + System.lineSeparator());

        System.out.println(funcionario3);
        System.out.println("GENERO: " + gender3);
        System.out.println(salario3 * 8 * 30);

        


        



    }
}

//ENTRADA E SAIDA BASICA DE DADOS DE FUNCIONARIOS

//TESTE VERSAO 1