package test;

import java.io.*;

public class testOutput {

    public static void main(String[] args) throws IOException {

        OutputStream outputStream = new FileOutputStream("asd2.txt");
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedwirtter = new BufferedWriter(writer);

        bufferedwirtter.write("asdasdasdasdasdasd");
        bufferedwirtter.newLine();
        bufferedwirtter.write("asdadasdsdsdadsda");
        bufferedwirtter.close();
    }
}
