package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Addresses {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String address;
	private String City;
	private int zip;
	public Addresses(long id, String name, String address, String city, int zip) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		City = city;
		this.zip = zip;
	}
	public Addresses(String name, String address, String city, int zip) {
		super();
		this.name = name;
		this.address = address;
		City = city;
		this.zip = zip;
	}
	public Addresses() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Addresses [id=" + id + ", name=" + name + ", address=" + address + ", City=" + City + ", zip=" + zip
				+ "]";
	}

	
}
