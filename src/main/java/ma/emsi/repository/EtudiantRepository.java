package ma.emsi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.model.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>{

	// Rechercher un étudiant par son nom
    List<Etudiant> findByNom(String nom);

    // Rechercher tous les étudiants par un comité d'organisation spécifique
    List<Etudiant> findByComiteOrganisation(String comiteOrganisation);

    // Rechercher tous les étudiants dont la demande est en cours de traitement
    List<Etudiant> findByDemandeEnCours();
}
