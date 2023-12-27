package ma.emsi.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.emsi.model.Demande;
import ma.emsi.repository.DemandeRepository;
import ma.emsi.service.DemandeService;

public class DemandeServiceImpl implements DemandeService{
	
	 @Autowired
	    private DemandeRepository demandeRepository;

	    @Override
	    public void createDemande(Demande demande) {
	        demandeRepository.save(demande);
	    }

	    @Override
	    public Demande getDemandeById(int id) {
	        return demandeRepository.findById(id).orElse(null);
	    }

	    @Override
	    public void updateDemande(Demande demande) {
	        demandeRepository.save(demande);
	    }

	    @Override
	    public void deleteDemande(int id) {
	        demandeRepository.deleteById(id);
	    }
	    @Override
	    public List<Demande> getDemandesByEtat(String etat) {
	        return demandeRepository.findByEtat(etat);
	    }

	    @Override
	    public List<Demande> searchDemandesByTitre(String titre) {
	        return demandeRepository.findByTitreContaining(titre);
	    }

}
