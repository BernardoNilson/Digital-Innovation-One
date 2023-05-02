package code_challenge;

/**
 * Understanding the problem: Write a program that calculate the final value of a car; 
 * considering the factory cost and the distribuitor tax rate, after, the tax rate.
 * Show the final value to the client.
 * 
 * @author: Bernardo Nilson
 * @version: 01.05.2023
 * Inicial version, just using basic code skills.
 * 
 */
 
import java.util.*;

public class CarFactory {

	public static void main(String[] args) {

        //Open the Scanner
	    Scanner scan = new Scanner(System.in);

        //First line cleans the 
        System.out.println("\033\143");
        System.out.println("Nice to meet you! This program calculate the final value of a car:\n");

        System.out.println("Please, enter the factory value: ");
        int factoryCost = scan.nextInt();
        System.out.println("Now, the distribuitor rate (Integer - XX%): ");
	    int distribuitorRate = scan.nextInt();
        System.out.println("The tax rate (Integer - XX%): ");
	    int taxRate = scan.nextInt();

        scan.close();

        System.out.println("Calculated car value: " + carValue(factoryCost, distribuitorRate, taxRate));
	}

    public static int carValue (int factoryCost, int distribuitorRate, int taxRate){
        return (factoryCost*(1 + (distribuitorRate/100)))*(1 + (taxRate/100));
    }
}

