package test;

import java.io.*;

public class testInputStream {

    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("asd.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }

//    public static void main(String[] args) throws IOException {
//
//        InputStream fis = new FileInputStream("asd.txt");
//        Reader isr = new InputStreamReader(fis);
//
//        int line = isr.read();
//        while (line != -1) {
//            char ch = (char) line;
//            System.out.println(ch);
//            line = isr.read();
//        }
//
//        isr.close();
//
//    }
}
