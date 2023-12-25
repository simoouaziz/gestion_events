package ma.emsi.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Entity
public class Etudiant extends User{
	
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Etudiant(String role) {
		super();
		this.role = role;
	}

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(int id, String nom, String prenom, String telephone,
			@NotBlank(message = "L'e-mail ne peut pas être vide") @Email(message = "L'e-mail doit être au format valide") String email,
			@Size(min = 8, message = "Le mot de passe doit avoir au moins 8 caractères") @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$%^&+=]).*$", message = "Le mot de passe doit contenir des chiffres, des lettres et des caractères spéciaux") String password,
			@NotBlank(message = "Le nom d'utilisateur ne peut pas être vide") String username) {
		super(id, nom, prenom, telephone, email, password, username);
		
	}

	
	

}
