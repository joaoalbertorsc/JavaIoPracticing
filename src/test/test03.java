package test;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class test03 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"));
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
//            System.out.println(line);

            Scanner lineScanner = new Scanner(line);
            lineScanner.useLocale(Locale.US);
            lineScanner.useDelimiter(",");

            String conta = lineScanner.next();
            int num = lineScanner.nextInt();
            int agencia = lineScanner.nextInt();
            String titular = lineScanner.next();
            double saldo = lineScanner.nextDouble();

            String valueFormatted = String.format(new Locale("pt", "BR"),"%s - %04d-%s, %s: R$%.2f",
                                                    conta, num, agencia, titular, saldo);
            System.out.println(valueFormatted);

//            String[] values = line.split(",");

//            String conta = values[0];
//            String num = values[1];
//            String agencia = values[2];
//            String titular = values[3];
//            String saldo = values[4];
//
//            System.out.println("comta: " + conta + "\nnumero: " + num + "\nagencia: " + agencia + "\ntitular: " + titular + "saldo: " + saldo);

        }
        scanner.close();

    }
}
