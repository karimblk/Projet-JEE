package be.fabricTout.pojo;

import java.io.Serializable;
import java.util.ArrayList;

import be.fabricTout.enumerations.Code;


public class Zone implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ATTRIBUTS
	private String idZone;
	private Code colourCode;
	private ArrayList<Machine> allMachine;
	//CONSTRUCTORS
	public Zone(String idZone, Code colourCode) {
		this.idZone = idZone;
		this.colourCode = colourCode;
		allMachine=new ArrayList<Machine>();
	}
	public Zone() {
	}
	//ACCESSORS
	public String getIdZone() {
		return idZone;
	}
	public void setIdZone(String idZone) {
		this.idZone = idZone;
	}
	public Code getColourCode() {
		return colourCode;
	}
	public void setColourCode(Code colourCode) {
		this.colourCode = colourCode;
	}
	public ArrayList<Machine> getAllMachine() {
		return allMachine;
	}
	public void setAllMachine(ArrayList<Machine> allMachine) {
		this.allMachine = allMachine;
	}
	//METHODS

}
