package ma.emsi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;

	private String telephone;

	@NotBlank(message = "L'e-mail ne peut pas être vide")

	private String email;

	@Size(min = 8, message = "Le mot de passe doit avoir au moins 8 caractères")
	private String password;

	@NotBlank(message = "Le nom d'utilisateur ne peut pas être vide")
	private String username;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public User(int id, String nom, String prenom, String telephone,
			@NotBlank(message = "L'e-mail ne peut pas être vide") @Email(message = "L'e-mail doit être au format valide") String email,
			@Size(min = 8, message = "Le mot de passe doit avoir au moins 8 caractères") @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$%^&+=]).*$", message = "Le mot de passe doit contenir des chiffres, des lettres et des caractères spéciaux") String password,
			@NotBlank(message = "Le nom d'utilisateur ne peut pas être vide") String username) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.password = password;
		this.username = username;
	}

	public User(@NotBlank(message = "Le nom d'utilisateur ne peut pas être vide") String username,
			@NotBlank(message = "L'e-mail ne peut pas être vide") String email,
			@Size(min = 8, message = "Le mot de passe doit avoir au moins 8 caractères") String password, String nom,
			String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.username = username;
	}

	public User(@NotBlank(message = "Le nom d'utilisateur ne peut pas être vide") String username,
			@NotBlank(message = "L'e-mail ne peut pas être vide") String email,
			@Size(min = 8, message = "Le mot de passe doit avoir au moins 8 caractères") String password) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
	}

}
