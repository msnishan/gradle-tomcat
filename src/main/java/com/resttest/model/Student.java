package com.resttest.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "StudentElement")
public class Student {

	@XmlElement
	private Name name;
	
	@XmlAttribute
	private String id;
	
	@XmlElement
	private String std;
	public Student(Name name, String id, String std) {
		super();
		this.name = name;
		this.id = id;
		this.std = std;
	}
	public Student() {
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setStd(String std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", std=" + std + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((std == null) ? 0 : std.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (std == null) {
			if (other.std != null)
				return false;
		} else if (!std.equals(other.std))
			return false;
		return true;
	}
	
}
