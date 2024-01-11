package ma.emsi.service;

import java.util.List;

import ma.emsi.model.Demande;

public interface DemandeService {
	void createDemande(Demande demande);

	Demande getDemandeById(int id);

	void AccepterDemande(Demande demande);

	void RejeterDemande(Demande demande);

	void add(Demande demande);

	List<Demande> getDemandesByEtat(String etat);

	List<Demande> searchDemandesByTitre(String titre);

	List<Demande> getDemandesByLocal(String local);

	List<Demande> getAllDemandes();

}
