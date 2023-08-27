package test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class testSerializationClass {

    public static void main(String[] args) throws Exception {

        Client client = new Client();
        client.setCpf("123321111");
        client.setName("Joberet");
        client.setProfession("Dev");

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(client);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Client file = (Client) ois.readObject();
        ois.close();
        System.out.println(client.getProfession()+"\n"+client.getCpf()+"\n"+client.getName());
    }
}
