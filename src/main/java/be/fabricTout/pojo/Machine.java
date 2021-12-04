package be.fabricTout.pojo;

import java.io.Serializable;
import java.util.ArrayList;

import be.fabricTout.enumerations.Status;
import be.fabricTout.enumerations.TypeOfMachine;


public class Machine implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ATTRIBUTS
	private int idMachine;
	private Status operatingStatus;
	private TypeOfMachine type;
	private ArrayList<Location> allLocation;
	//CONSTRUCTORS
	public Machine(int idMachine, Status operatingStatus, TypeOfMachine type) {
		this.idMachine = idMachine;
		this.operatingStatus = operatingStatus;
		this.type = type;
		allLocation=new ArrayList<Location>();
	}
	public Machine() {
	}
	//ACCESSORS
	public int getIdMachine() {
		return idMachine;
	}
	public void setIdMachine(int idMachine) {
		this.idMachine = idMachine;
	}
	public Status getOperatingStatus() {
		return operatingStatus;
	}
	public void setOperatingStatus(Status operatingStatus) {
		this.operatingStatus = operatingStatus;
	}
	public TypeOfMachine getType() {
		return type;
	}
	public void setType(TypeOfMachine type) {
		this.type = type;
	}
	public ArrayList<Location> getAllLocation() {
		return allLocation;
	}
	public void setAllLocation(ArrayList<Location> allLocation) {
		this.allLocation = allLocation;
	}
	
	//METHODS
	
	
}
