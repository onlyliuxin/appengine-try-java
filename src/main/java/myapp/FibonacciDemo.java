package myapp;

import java.util.Date;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class FibonacciDemo extends Thread {
	private DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	
	
	public void run(){
		for (int flag = 1; flag <= 1000; flag++) {			
			try {
			    //dataStore(flag);
				record(flag);
				System.out.println("#"+flag);			
				
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	 	public void record(int fiboIndex) {
			Entity fiboTime = new Entity("javaFiboTime");
			fiboTime.setProperty("FiboIndex", fiboIndex);
			fiboTime.setProperty("Timestamp", new Date());
			
			datastore.put(fiboTime);
		}
}
