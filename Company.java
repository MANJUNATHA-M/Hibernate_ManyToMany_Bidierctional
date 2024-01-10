package com.hibernate.manytoMANY.mapbiderectional.Many_To_Many_Bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Company {
	
	@Id
	private int cId;
	private String cName;
	
	@ManyToMany(mappedBy = "clist")
	private List<Employee> elist=new ArrayList<Employee>();

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public List<Employee> getElist() {
		return elist;
	}

	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}

	@Override
	public String toString() {
		return "Company [cId=" + cId + ", cName=" + cName + ", elist=" + elist + "]";
	}

}
