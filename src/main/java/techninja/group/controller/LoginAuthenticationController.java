package techninja.group.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import techninja.group.model.LoginAuthentication;
import techninja.group.service.LoginAuthenticationService;

@RestController
public class LoginAuthenticationController {

	@Autowired
	private LoginAuthenticationService loginAuthenticationService;
	
	@RequestMapping(method=RequestMethod.POST,value="/create")
	public LoginAuthentication createNewUser(@RequestBody LoginAuthentication La ) {
		return	loginAuthenticationService.createNewUser(La);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/login")
	public String authenticateUser(@RequestBody LoginAuthentication la ) {
		return loginAuthenticationService.authenticateUser(la);
	}
/*	@RequestMapping("/login/{user}/{pass}")
	public String authenticateUser(@PathVariable String user,@PathVariable String pass) {
		
		return loginAuthenticationService.authenticateUser(user, pass);
	}
	*/
	@RequestMapping("/login")
	public List<LoginAuthentication> listAllUsers() {
		
		return loginAuthenticationService.listAllUsers();
	}
}
