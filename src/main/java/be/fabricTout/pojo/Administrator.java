package be.fabricTout.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class Administrator implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ATTRIBUTS
	private String email;
	private String password;
	private ArrayList<Employee> allEmployee;
	//CONSTRUCTORS
	public Administrator(String email, String password) {
		this.email = email;
		this.password = password;
		allEmployee=new ArrayList<Employee>();
	}
	public Administrator() {
	}
	//ACCESSORS
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<Employee> getAllEmployee() {
		return allEmployee;
	}
	public void setAllEmployee(ArrayList<Employee> allEmployee) {
		this.allEmployee = allEmployee;
	}
	//METHODS
	

}
