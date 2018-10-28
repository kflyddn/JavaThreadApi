package techninja.group.model;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document
//@Entity
@Document
public class LoginAuthentication {

	@Id
	String userName;
	String pass;
	
	public LoginAuthentication() {
		
	}
	
	public LoginAuthentication(String user, String pass) {
		super();
		this.userName = user;
		this.pass = pass;
	}

	public String getUser() {
		return userName;
	}

	public void setUser(String user) {
		this.userName = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "LoginAuthentication [user=" + userName + ", pass=" + pass + "]";
	}
	
	
	
}
