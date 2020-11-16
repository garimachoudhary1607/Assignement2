package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int number;
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the number");

        number = sc.nextInt();

        //Task1
        if (number%3==0 && number%5!=0 ){
            System.out.println("Consultadd");
        }
        else if(number%5==0 && number%3!=0 ) {
            System.out.println("Java Training");
        }
        else if( number%3==0 && number%5==0){
            System.out.println("Consultadd Java Training");
        }
        // Task 2
        System.out.println(" Please enter both the variables first and second");
         int  first = sc.nextInt();
         int second = sc.nextInt();
        System.out.println("Ask user to enter option");
         int userEnter= sc.nextInt();
         int a = (first + second);
         int b = first - second;
         int c = (first / second);
         int d =  (first * second);

         if(userEnter==1){
              System.out.println("Addition of two numbers:  " + a );
          }else if(userEnter==2) {
              System.out.println("Substraction of two numbers:  " + b );
          }else if(userEnter==3) {
              System.out.println("Division of two numbers:  " + c );
          }else if(userEnter==4) {
              System.out.println("Multiplication of two numbers:  " + d );
          }else if (userEnter==5){
              System.out.println(" Please enter the  value for variables first1 and second2");
             int first1= sc.nextInt();
             int second2 = sc.nextInt();
             int e = ((first + second + first1 + second2)/2);
             System.out.println("Average of two numbers:  " + e );
        }if(a<0) {
            System.out.println("“Oops option 1 is returning the negative number”");
        }else if(b<0) {
            System.out.println("“Oops option 2 is returning the negative number”");
        }else if(c<0) {
            System.out.println("“Oops option 3 is returning the negative number”");
        }else if(d<0) {
            System.out.println("“Oops option 4 is returning the negative number”");
        }else if(b<0) {
            System.out.println("“Oops option 5is returning the negative number”");
        }

            }
}
