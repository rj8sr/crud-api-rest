package in.bushansirgur.springboot.crudapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel_api")
public class Employee {

	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String roomnumber;
	@Column
	private String available;
	@Column
	private String intime;
	@Column
	private String outtime;
@Column
private String date;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getRoomnumber() {
	return roomnumber;
}
public void setRoomnumber(String roomnumber) {
	this.roomnumber = roomnumber;
}
public String getAvailable() {
	return available;
}
public void setAvailable(String available) {
	this.available = available;
}
public String getIntime() {
	return intime;
}
public void setIntime(String intime) {
	this.intime = intime;
}
public String getOuttime() {
	return outtime;
}
public void setOuttime(String outtime) {
	this.outtime = outtime;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", roomnumber=" + roomnumber + ", available=" + available + ", intime=" + intime
			+ ", outtime=" + outtime + ", date=" + date + "]";
}

	
	
}
