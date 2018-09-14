public class thiskey {

int a;

thiskey(int a){

	this.a=a;

}

public static void main(String args[]) {

	thiskey o1=new thiskey(55); 

	thiskey o2=new thiskey(45);

System.out.println("Sum="+(o1.a+o2.a));

}

}