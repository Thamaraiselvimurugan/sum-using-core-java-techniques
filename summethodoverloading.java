public class methodoverloading {

void sum(int a,int b) {

	System.out.println("Sum="+(a+b));

}

void sum(int a,int b,int c) {

	System.out.println("Sum="+(a+b+c));

}

public static void main(String args[]) {

int a=30,b=55,c=44;

new methodoverloading().sum(a,b);

new methodoverloading().sum(a,b,c);



}



}