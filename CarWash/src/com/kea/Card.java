package com.kea;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Card {
    private double balance;
    private boolean hasFDMcard;
    private String name;

    public Card(double balance, String name, boolean hasFDMcard) {
        this.balance = balance;
        this.hasFDMcard = hasFDMcard;
        this.name = name;
        createCard();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean getHasFDMcard() {
        return hasFDMcard;
    }

    public double getBalance() { return balance; }

    public String printBalance() { return String.format("%.2f", balance); }

    public String getName() {
        return name;
    }

    public void charge(double cost) {
        balance -= cost;
    }

    public void rechargeCard(double amount) {
        balance += amount;
    }

    //method for creating washcard with balance and name, in a file
    public void createCard() {
        //uses try to catch the exception
        try {
            //creates the file called washcard
            File myObj = new File("WashCard.txt");
            //checks if file exists. if it does it reads the file and sets balance and name.
            // if it does not it creates file and sets balance and name.
            if (myObj.createNewFile()) {
                System.out.println("File created" + myObj.getName());
                FileWriter fileWriter = new FileWriter("WashCard.txt");
                fileWriter.write(balance + " " + name);
                fileWriter.close();
                System.out.println("Successfully wrote to the file.");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextDouble()) {
                    Double washCardBalance = myReader.nextDouble();
                    setBalance(washCardBalance);
                }
                while (myReader.hasNext()) {
                    String washCardName = myReader.next();
                    setName(washCardName);
                }
            } else {
                Scanner myReader = new Scanner(myObj);
                // use US locale to identify doubles probably in a string
                myReader.useLocale(Locale.US);
                while (myReader.hasNextDouble()) {
                    Double washCardBalance = myReader.nextDouble();
                    setBalance(washCardBalance);
                }
                while (myReader.hasNext()) {
                    String washCardName = myReader.next();
                    setName(washCardName);
                }
            }
        } catch (IOException e) {
            System.out.println("an error has occurred.");
            e.printStackTrace();
        }
    }
}