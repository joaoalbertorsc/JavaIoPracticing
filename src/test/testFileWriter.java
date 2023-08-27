package test;

import java.io.*;

public class testFileWriter {

    public static void main(String[] args) throws IOException {

//        FLUXO DE ENTRADA COM ARQUIVO
//        OutputStream outputStream = new FileOutputStream("asd2.txt");
//        Writer writer = new OutputStreamWriter(outputStream);
//        BufferedWriter bufferedwirtter = new BufferedWriter(writer);

        BufferedWriter bw = new BufferedWriter(new FileWriter("asd2.txt"));

        bw.write("asdasdasdasdasdasd");
        bw.newLine();
        bw.newLine();
        bw.newLine();
        bw.write("asdadasdsdsdadsda");
        bw.close();
    }
}