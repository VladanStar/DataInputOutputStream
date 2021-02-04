package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        //Kreiranje izlaznog toka za datoteku temo.txt
        DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.txt"));
        // pisanje ocena studentskog testa u datoteku
        output.writeUTF("John");
        output.writeDouble(85.5);
        output.writeUTF("Suan");
        output.writeDouble(185.5);
        output.writeUTF("Kim");
        output.writeDouble(106.25);

        // zatvaranje ulaznog toka
        output.close();

        // Kreiranje ulaznog toka za datoteku temp.txt
        DataInputStream input = new DataInputStream(new FileInputStream("temp.txt"));
        // citanje ulaznog toka za datoteku temp
        System.out.println( " ");
        System.out.println(input.readUTF() + " " + input.readDouble());
        System.out.println(input.readUTF() + " " + input.readDouble());

    }
}
