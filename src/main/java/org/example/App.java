package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main( String[] args )
    {
        String quote;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote? ");
        quote = input.nextLine();

        String Who;
        System.out.print("Who said it? ");
        Who = input.nextLine();

        System.out.println(Who + " says, " + "\""+ quote +"\"");

        input.close();
    }
}
