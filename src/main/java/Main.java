import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //utilizando biblioteca aritmetica do commons apache
        DescriptiveStatistics stats = new DescriptiveStatistics();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero desejado e confirme no enter ");

        System.out.println("Caso queira sair do sistema, digite '0' (zero): ");

        while(true) {
            double number = 0;
            boolean error = false;

            try {
                number = scanner.nextDouble();
                System.out.println("Você digitou o número: " + number);
            } catch(InputMismatchException e){
                System.out.println("Valor deve ser um numero apenas!!! ");
                error = true;
                scanner.next();
            }

            if(!error && number == 0){
                break;
            }

            stats.addValue(number);
        }

        //media
        System.out.println("Media dos numero ficou em : " + stats.getMean());

        //desvio padrao
        System.out.println("Desvio Padrão: " + stats.getStandardDeviation());

        scanner.close();

    }
}