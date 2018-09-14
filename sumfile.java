import java.util.Scanner;

import java.io.*;

public class sumfile {

	public static void main(String args[]) throws Exception{

	Scanner sc= new Scanner(System.in);

	System.out.println("Enter 2 numbers");

int a=sc.nextInt();

int b=sc.nextInt();

    int c=a+b;

    PrintWriter fout=new PrintWriter("sum"

    		+ ".txt");        

       

    fout.write(Integer.toString(c));   

    fout.close();    

    System.out.println("success");    



sc.close();

}

}