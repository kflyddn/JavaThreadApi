package techninja.group.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class JavaMultiThreading {

	String location;
	String msg;
	int noofjobs;
	
	public JavaMultiThreading(String location, String msg, int noofjobs) {
		super();
		this.location = location;
		this.msg = msg;
		this.noofjobs = noofjobs;
	}
		
	public int getNoofjobs() {
		return noofjobs;
	}
	public void setNoofjobs(int noofjobs) {
		this.noofjobs = noofjobs;
	}
	@Override
	public String toString() {
		return "JavaMultiThreading [location=" + location + ", msg=" + msg + ", noofjobs=" + noofjobs + "]";
	}
	public JavaMultiThreading() {
		super();
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
