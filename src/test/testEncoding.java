package test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class testEncoding {

    public static void main(String[] args) throws Exception {

        String s = "ç";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.print(bytes.length + ", UTF-8, ");
        String sNovo = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(sNovo);

        bytes = s.getBytes(StandardCharsets.UTF_16);
        System.out.print(bytes.length + ", UTF-16, ");
        sNovo = new String(bytes, StandardCharsets.UTF_16);
        System.out.println(sNovo);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.print(bytes.length + ", US_ASCII, ");
        sNovo = new String(bytes, StandardCharsets.US_ASCII);
        System.out.println(sNovo);

    }
}
