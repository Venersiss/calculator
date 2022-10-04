/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custodio;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class Custodio {
    // Ivan Pogi Ugh hacker XD xXH4cKerXx

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Gusto baka mo try sa akong gi buhat?");
        System.out.println("If yes type: 1");
        System.out.println("If no type 2");
        int s = sc.nextInt();
        int x = 0;

        while (s == 1) {
            System.out.println("Calulator:          1");
            System.out.println("Odd/Even Checker:   2");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("If addition enter:        1");
                    System.out.println("If subtraction enter      2");
                    System.out.println("If multiplication enter:  3");
                    System.out.println("If division enter:        4");
                    System.out.println("Please Choose Operation");
                    x = sc.nextInt();

                    switch (x) {

                        case 1:

                            System.out.println("Please input 2 integers");
                            double x1 = sc.nextDouble();
                            double x2 = sc.nextDouble();
                            double ans1 = x1 + x2;
                            System.out.println("The answer is:    " + ans1);
                            break;

                        case 2:

                            System.out.println("Please input 2 integers");
                            x1 = sc.nextDouble();
                            x2 = sc.nextDouble();
                            double ans2 = x1 - x2;
                            System.out.println("The answer is:    " + ans2);
                            break;

                        case 3:

                            System.out.println("Please input 2 integers");
                            x1 = sc.nextDouble();
                            x2 = sc.nextDouble();
                            double ans3 = x1 / x2;
                            System.out.println("The answer is:    " + ans3);
                            break;

                        case 4:

                            System.out.println("Please input 2 integers");
                            x1 = sc.nextDouble();
                            x2 = sc.nextDouble();
                            double ans4 = x1 / x2;
                            System.out.println("The answer is:    " + ans4);
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Enter a Number to check if odd or even");
                    double x4 = sc.nextDouble();
                    if (x4 % 2 == 0) {
                        System.out.println("The number is Even");
                    } else {
                        System.out.println("The number is Odd");
                    }

                    break;

            }
            System.out.println("Do you want to choose another operation?");
            System.out.println("If yes then enter 1");
            System.out.println("If no then enter 2");
            s = sc.nextInt();
            
        }

    }

}
