package ma.emsi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.model.Demande;

public interface DemandeRepository extends JpaRepository<Demande, Integer>{
	
	 List<Demande> findByEtat(String etat);
	 
	 List<Demande> findByTitreContaining(String titre);

}
