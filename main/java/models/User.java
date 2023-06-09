package models;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class User {

	String idUser;
	String username;
	String password;
	String identification;
	Date dob;
	String gender;
	String phone;
	String email;
	String BHYT;
	
	

	public String getBHYT() {
		return BHYT;
	}

	public void setBHYT(String bHYT) {
		BHYT = bHYT;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(String username, String BHYT, String password, String identification, Date dob, String gender, String phone,
			String email) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException,
			IllegalBlockSizeException, BadPaddingException {
		super();
		this.idUser = Encrypt.encryptTo(BHYT);
		this.username = username;
		this.password = password;
		this.identification = identification;
		this.dob = dob;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}

	public User() {
		super();
	}

	public static void main(String[] args) {
		User vu = null;
		try {
			vu = new User("trinhvu","34Eaasn9128739" ,"password", "2018276811", new Date(), "male", "0908902820", "asdsaasd");
		} catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException
				| BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
