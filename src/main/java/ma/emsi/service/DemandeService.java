package ma.emsi.service;

import java.util.List;

import ma.emsi.model.Demande;

public interface DemandeService {
	 void createDemande(Demande demande);
	    Demande getDemandeById(int id);
	    void updateDemande(Demande demande);
	    void deleteDemande(int id);
	    List<Demande> getDemandesByEtat(String etat);
	    List<Demande> searchDemandesByTitre(String titre);
}
