public class copyconst {

	int a1,b1;

copyconst(int a,int b){

    a1=a;

    b1=b;

	System.out.println("Sum="+(a+b));

}

copyconst(copyconst s){

    

	System.out.println("Addition="+(s.a1+s.b1));

}

public static void main(String args[]) {

	copyconst a1=new copyconst(34,33);



	copyconst a2=new copyconst(a1);

}

}