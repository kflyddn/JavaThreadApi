package techninja.group.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techninja.group.model.JavaMultiThreading;
import techninja.group.repository.JavaMultiThreadingRepository;
import techninja.group.worker.CallableWorker;
import techninja.group.worker.RunnableWorker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


@Service
public class JavaMultiThreadingService {
		
		@Autowired
		private JavaMultiThreadingRepository JavaRepo;
		private JavaMultiThreading JavaThread;
		private ExecutorService service=Executors.newFixedThreadPool(3);
		private static Logger logger = Logger.getLogger(JavaMultiThreadingService.class);
		private String message;
	    private String msg;
	    
		public void doJob(JavaMultiThreading Jmt) {
			this.JavaThread=Jmt;

			for(int taskId=0;taskId<Jmt.getNoofjobs();taskId++) {
					       
					try {
						Future<String> ThreadName =service.submit(new RunnableWorker());
						msg = ThreadName.get();
					}  catch (Exception e){}
					
					message = String.format("CallableWorker Location:" +JavaThread.getLocation() + " ## Thread :"+msg+" processed Job: %d ##", taskId);
					Logging(message);
			}
			service.shutdown();				
		}
		
		public List<JavaMultiThreading> listAllJobs() {
			return JavaRepo.findAll();
		}

		public void deleteJobs() {
			JavaRepo.deleteAll();
		}

		public void deleteJobsByLocation(String location) {
			
			JavaRepo.deleteByLocation(location);
		}
		
		public void Logging(String msg) {
			logger.info(msg);
			JavaThread.setMsg(msg);
			JavaRepo.save(JavaThread);
	}
		
	}
