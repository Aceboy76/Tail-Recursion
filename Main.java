
package pkg03_taskperformace_1_recursion;


import java.util.Scanner;


public class Main {

    public int find_GCD(int n1, int n2){
        if(n1 % n2 == 0){
            return n2;
        }
        return find_GCD(n2,n1 % n2);
       
    }
    
    public static void main(String[] args) {
        
       Main m = new Main();
       
       Scanner scn = new Scanner(System.in);
       
       System.out.print("Enter a first number:");
       int n1 = scn.nextInt();
       System.out.print("Enter a second number:");
       int n2 = scn.nextInt();
       
       System.out.println("The GCD of " + n1 + " and " + n2 + " is " + m.find_GCD(n1, n2));
    }
    
}

