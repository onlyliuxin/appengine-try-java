package myapp;

public class FibonacciDemo extends Thread {
	public void run(){
		for (int flag = 1; flag <= 100; flag++) {			
			try {
			    //dataStore(flag);
				System.out.println("#"+flag);			
				
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
