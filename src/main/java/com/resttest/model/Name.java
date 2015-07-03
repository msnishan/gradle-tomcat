package com.resttest.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NameElement")
public class Name {
	
	@XmlAttribute
	private String salutaion;
	
	@XmlElement
	private String firstName;
	
	@XmlElement
	private String middleName;
	
	@XmlElement
	private String lastName;
	
	public Name(String salutaion, String firstName, String middleName,
			String lastName) {
		super();
		this.salutaion = salutaion;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public Name() {
	}

	public void setSalutaion(String salutaion) {
		this.salutaion = salutaion;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result
				+ ((salutaion == null) ? 0 : salutaion.hashCode());
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
		Name other = (Name) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (salutaion == null) {
			if (other.salutaion != null)
				return false;
		} else if (!salutaion.equals(other.salutaion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Name [salutaion=" + salutaion + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}
	
	
}
