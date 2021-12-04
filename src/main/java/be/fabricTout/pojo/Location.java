package be.fabricTout.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class Location implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ATTRIBUTS
	private String city;
	private String adress;
	private ArrayList<Employee> allEmployee;
	//CONSTRUCTORS
	public Location(String city, String adress) {
		this.city = city;
		this.adress = adress;
		allEmployee=new ArrayList<Employee>();
	}
	public Location() {
	}
	//ACCESSORS
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public ArrayList<Employee> getAllEmployee() {
		return allEmployee;
	}
	public void setAllEmployee(ArrayList<Employee> allEmployee) {
		this.allEmployee = allEmployee;
	}
	
	//METHODS

}
