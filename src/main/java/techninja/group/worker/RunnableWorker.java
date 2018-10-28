package techninja.group.worker;

import java.util.concurrent.Callable;

public class RunnableWorker implements Callable<String>{
	
	//public static String ThreadName="";
	public RunnableWorker() {

	}

	@Override
	public String call() {
		
		try {
			Thread.sleep(5000);
 		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//ThreadName =Thread.currentThread().getName();
		return Thread.currentThread().getName();
	}
	



}
