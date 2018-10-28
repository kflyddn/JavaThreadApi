package techninja.group.controller;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import techninja.group.model.JavaMultiThreading;
import techninja.group.model.LoginAuthentication;
import techninja.group.service.JavaMultiThreadingService;

@RestController
public class JavaMultiThreadingController {

	@Autowired
	private JavaMultiThreadingService JMTS;
	
	@RequestMapping(method=RequestMethod.POST,value="/doJobs")
	public void doJob(@RequestBody JavaMultiThreading Jmt ) {
			JMTS.doJob(Jmt);
	}
	
	@RequestMapping("/jobs")
	public List<JavaMultiThreading> listAllUsers() {
			return JMTS.listAllJobs();
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deljobs")
	public void deleteJobs() {
			JMTS.deleteJobs();
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/jobs/{location}")
	public void deleteJobs(@PathVariable String location) {
			JMTS.deleteJobsByLocation(location);
	}
	
}
