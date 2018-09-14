class ride {

void sum(int a,int b){System.out.println("Sum="+(a+b));}

}

public class overriding extends ride{

	void sum(int a,int b){System.out.println("Addition="+(a+b));}





public static void main(String args[]) {

	int a=55;

	int b=45;

	overriding x=new overriding();

			x.sum(a,b);



	ride y=new ride();

			y.sum(a,b);

}

}