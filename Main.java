import java.util.Scanner;

 

public class Main {

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {

		int num,num1,rev=0;
		System.out.println("Enter a number :");
		num=sc.nextInt();
		num1=num;
		while(num1!=0)
		{	
			int l=num1%10;
			rev=rev*10+l;
			num1=num1/10;
		}

		if(num==rev)
		{
			System.out.println(num+" is a Palindrome number.");
		}
		else
		{
			System.out.println(num+" is not a Palindrome number.");
		}
      }

 

            //function to printPattern

       public void printPattern() {
		int num,i,j;
		System.out.println("Enter a number :");
		num=sc.nextInt();
		for(i=num;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
		int num,i,flag=1;
		System.out.println("Enter a number :");
		num=sc.nextInt();
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+" is not a prime number.");
		}
		else
		{
			System.out.println(num+" is a prime number.");
		}
        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1;
		int num,i,third=0;
		System.out.println("Enter a number :");
		num=sc.nextInt();
		for(i=0;i<num;i++)
		{
			third=first+second;
			System.out.print(first+" ");
			first=second;
			second=third;
		}
		System.out.println();
          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}