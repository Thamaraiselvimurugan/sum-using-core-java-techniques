abstract class num{

	void sum() {}

}

public class abs extends num {

    void sum() {

    	int a=23; 

    	int b=35;

    	System.out.println("Sum="+(a+b));

    }

    public static void main(String args[]) {

    	num s=new abs();

    	s.sum();

    }

}