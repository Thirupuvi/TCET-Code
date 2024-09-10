package tcet;

class numb implements Runnable{
	@Override
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(i);
			

		}
	}
}


public class Question2 {
	public static void main (String[]args) {
		Runnable numb=new numb();
		Thread th=new Thread(numb);
		th.start();
	}
	
	

}
