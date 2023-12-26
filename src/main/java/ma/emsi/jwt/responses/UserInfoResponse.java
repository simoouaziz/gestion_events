package ma.emsi.jwt.responses;

import java.util.List;

public class UserInfoResponse {
	private int id;
	private String username;
	private String email;
	private String nom;
	private String prenom;
	private List<String> roles;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public UserInfoResponse(int id, String username, String email, String nom, String prenom, List<String> roles) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.roles = roles;
	}

}
