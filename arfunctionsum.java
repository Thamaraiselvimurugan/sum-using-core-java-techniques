import java.util.Scanner;

public class ARfunc {

int sum(int a,int b) {

	return a+b;

}



public static void main(String args[]) {

	Scanner sc= new Scanner(System.in);

	System.out.println("Enter 2 numbers");

int a=sc.nextInt();

int b=sc.nextInt();

System.out.println("Sum="+new ARfunc().sum(a,b));

sc.close();



}}