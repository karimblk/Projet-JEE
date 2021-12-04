package be.fabricTout.pojo;

import java.io.Serializable;

public class Employee implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ATTRIBUTS
	protected int matricule;
	protected String firstname;
	protected String lastname;
	protected String password;
	//CONSTRUCTORS
	public Employee(int matricule, String firstname, String lastname, String password) {
		this.matricule = matricule;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
	}
	public Employee() {
	}
	//ACCESSORS
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//METHODS
	

}
