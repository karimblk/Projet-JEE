package be.fabricTout.pojo;

import java.io.Serializable;
import java.time.*;
import java.util.ArrayList;

public class Maintenance implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ATTRIBUTS
	private int idMaintenance;
	private LocalDate date;
	private LocalTime time;
	private String report;
	private Supervisor supervisor;
	private ArrayList<Employee> allEmployee;
	private Machine machine;
	//CONSTRUCTORS
	public Maintenance(int idMaintenance, LocalDate date, LocalTime time, String report) {
		this.idMaintenance = idMaintenance;
		this.date = date;
		this.time = time;
		this.report = report;
		allEmployee=new ArrayList<Employee>();
	}
	public Maintenance() {
	}
	//ACCESSORS
	public int getIdMaintenance() {
		return idMaintenance;
	}
	public void setIdMaintenance(int idMaintenance) {
		this.idMaintenance = idMaintenance;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public Supervisor getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}
	public ArrayList<Employee> getAllEmployee() {
		return allEmployee;
	}
	public void setAllEmployee(ArrayList<Employee> allEmployee) {
		this.allEmployee = allEmployee;
	}
	public Machine getMachine() {
		return machine;
	}
	public void setMachine(Machine machine) {
		this.machine = machine;
	}
	//METHODS
	

}
