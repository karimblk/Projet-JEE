package be.fabricTout.pojo;

import java.util.ArrayList;

public class PurchasingStaff extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ATTRIBUTS
	private ArrayList<Maintenance> allMaintenance;
	//CONSTRUCTORS
	public PurchasingStaff() {
	}
	public PurchasingStaff(int matricule, String firstname, String lastname, String password) {
		super(matricule, firstname, lastname, password);
		allMaintenance=new ArrayList<Maintenance>();
	}
	//ACCESSORS
	public ArrayList<Maintenance> getAllMaintenance() {
		return allMaintenance;
	}
	public void setAllMaintenance(ArrayList<Maintenance> allMaintenance) {
		this.allMaintenance = allMaintenance;
	}
	
	//METHODS

}
