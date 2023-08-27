package test;

import java.io.*;

public class testCopyFile {

    public static void main(String[] args) throws IOException {

        InputStream is = System.in; // ENTRADA
        Reader r = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(r);

        OutputStream os = new FileOutputStream("asd2.txt"); // SAIDA
        Writer w = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(w);

        String line = br.readLine();

        while(line != null && ! line.isEmpty()) {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }
        br.close();
        bw.close();

    }
}
