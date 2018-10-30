package techninja.group.worker;

import java.util.concurrent.Callable;

public class RunnableWorker implements Callable<String>{
	
	public RunnableWorker() {

	}

	@Override
	public String call() {
		
		try {
			Thread.sleep(5000);
 		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Thread.currentThread().getName();
	}
	



}
