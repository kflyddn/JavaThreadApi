package techninja.group.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import techninja.group.model.LoginAuthentication;
import techninja.group.repository.LoginAuthenticationRepository;


@Service
public class LoginAuthenticationService {

	@Autowired
	private LoginAuthenticationRepository loginAuthenticationRepository;
	
	
	public String authenticateUser(LoginAuthentication la) {
		
		LoginAuthentication login= loginAuthenticationRepository.findByUserName(la.getUser());
		String msg; 
		String a =la.getPass();
		String b=login.getUser();
		if(a.equals(b)) 
			msg= "Authentication Sucessful";
		else 
			msg= "Login Failed"; 
		
		return msg;
			
	}

	public LoginAuthentication createNewUser(String user,String pass) {
		return loginAuthenticationRepository.save(new LoginAuthentication(user,pass) );
	}

	public List<LoginAuthentication> listAllUsers() {
		 return loginAuthenticationRepository.findAll();
	}

	public LoginAuthentication createNewUser(LoginAuthentication la) {
			
		return loginAuthenticationRepository.save(la);
	}
}
