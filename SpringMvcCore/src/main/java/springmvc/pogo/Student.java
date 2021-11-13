package springmvc.pogo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.dao.DataAccessException;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="student_details")
public class Student {
	
	@Column(name="c_student_fname")
	private String fname;
	
	@Column(name="c_student_lname")
	private String lname;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String language;
	
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date date;
	
	private List<String> cars;
	
	private String type;
	
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getCars() {
		return cars;
	}
	public void setCars(List<String> cars) {
		this.cars = cars;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return String.format("Student [fname=%s, lname=%s, id=%s, language=%s, date=%s, cars=%s, type=%s, address=%s]",
				fname, lname, id, language, date, cars, type, address);
	}
	public Student(String fname, String lname, Long id, String language, Date date, List<String> cars, String type) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.id = id;
		this.language = language;
		this.date = date;
		this.cars = cars;
		this.type = type;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
