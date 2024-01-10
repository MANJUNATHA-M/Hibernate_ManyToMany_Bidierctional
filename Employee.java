package com.hibernate.manytoMANY.mapbiderectional.Many_To_Many_Bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	private int eId;
	private String eName;
	private int eSal;
	
	@ManyToMany
	private List<Company> clist=new ArrayList<Company>();

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteSal() {
		return eSal;
	}

	public void seteSal(int eSal) {
		this.eSal = eSal;
	}

	public List<Company> getClist() {
		return clist;
	}

	public void setClist(List<Company> clist) {
		this.clist = clist;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + ", clist=" + clist + "]";
	}

	
	
	

}
