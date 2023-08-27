package test;

import java.io.*;

public class testSerializationString {

    public static void main(String[] args) throws Exception {


        // CRIANDO O ARQUIVO .BIN
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//        String name = "Joao Alberto";
//        String a = "asd asd asd asd asd asd\n asd asd asd asd";
//        oos.writeObject(name + a);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String file = (String) ois.readObject();
        ois.close();
        System.out.println(file);
    }
}
