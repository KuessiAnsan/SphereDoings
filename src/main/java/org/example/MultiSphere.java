package org.example;

import java.util.Scanner;

public class MultiSphere {

    public static void main(String[] args) {
        Sphere sphere = new Sphere();

        sphere.setDiameter(8);

        sphere.Surface();
        sphere.Volume();
/*
        char choice;
        do {
            System.out.print("Enter the sphere diameter: ");
            Scanner scn = new Scanner(System.in);
            Double dmt = scn.nextDouble();

            sphere.setDiameter(dmt);

            System.out.println("The surface of this sphere is: " + sphere.Surface());
            System.out.println("The volume of this sphere is: " + sphere.Volume());

            System.out.print("Do you want to continue? (Y/y): ");
            choice = scn.next().charAt(0);
        }while (choice == 'Y' || choice == 'y');
*/
        //***********************User Input Option*******************************************
    }
}
