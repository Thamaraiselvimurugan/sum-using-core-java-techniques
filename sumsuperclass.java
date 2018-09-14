class sup{

	int a=54;

}

class superclass extends sup {//sub class

superclass(){

int a=55;

int c=a+super.a;

System.out.println("Sum="+c);

}

public static void main(String args[]) {

	new superclass(); }

}