package springmvc.pogo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;

@Entity
@Table(name = "user_details")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "i_user_Id")
	private int Id;
	
	@Column(name = "c_user_fname")
	private String fname;
	
	@Column(name = "c_user_lname")
	private String lname;
	
	@Column(name = "c_user_pass")
	private String pass;
	
	@Column(name = "c_user_cpass")
	private String cpass;
	
	@Column(name = "c_user_email")
	private String email;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCpass() {
		return cpass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(int id, String fname, String lname, String pass, String cpass, String email) {
		super();
		Id = id;
		this.fname = fname;
		this.lname = lname;
		this.pass = pass;
		this.cpass = cpass;
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("User [Id=%s, fname=%s, lname=%s, pass=%s, cpass=%s, email=%s]", Id, fname, lname, pass,
				cpass, email);
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}