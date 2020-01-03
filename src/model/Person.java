package model;

public class Person {
	private String firstname, lastname, pseudo, email, tel, password;

	public Person(String pseudo, String password) {
		this.pseudo = pseudo;
		this.password = password;
	}

	public Person(String firstname, String lastname, String pseudo, String email, String tel, String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.pseudo = pseudo;
		this.email = email;
		this.tel = tel;
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstname + " " + lastname + " " + pseudo + " " + email + " " + tel + " " + password;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Person) {
			Person p = (Person) obj;
			boolean b = (p.getFirstname().equals(firstname) && p.getLastname().equals(lastname)
					|| p.getPseudo().equals(pseudo)) && (p.getEmail().equals(email) || p.getTel().equals(tel))
					&& p.getPassword().equals(password);
			boolean b2 = p.getPseudo().equals(pseudo) && p.getPassword().equals(password);
			return b || b2;
		}
		return false;
	}

}
