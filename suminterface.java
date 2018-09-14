interface sum1 {

int a=200;

}

public class intrfce implements sum1 {

	int b=453; 

public static void main(String args[]) {

	intrfce   s=new intrfce();

	System.out.println("Sum="+(a+s.b));

}

}