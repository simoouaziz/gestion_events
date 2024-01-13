package ma.emsi.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.emsi.model.Demande;
import ma.emsi.repository.DemandeRepository;
import ma.emsi.service.DemandeService;

public class DemandeServiceImpl implements DemandeService {

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
	public List<Demande> getDemandesByEtat(String etat) {
		return demandeRepository.findByEtat(etat);
	}

	@Override
	public List<Demande> searchDemandesByTitre(String titre) {
		return demandeRepository.findByTitreContaining(titre);
	}

	@Override
	public List<Demande> getDemandesByLocal(String ville) {
		return demandeRepository.findByLocal(ville);
	}

	@Override
	public List<Demande> getAllDemandes() {
		return demandeRepository.findAll();
	}

	@Override
	public void AccepterDemande(Demande demande) {
		Demande d = getDemandeById(demande.getId());
		if (d != null) {
			d.setEtat("Acceptée");
			demandeRepository.save(d);
		}
	}

	@Override
	public void RejeterDemande(Demande demande) {
		Demande d = getDemandeById(demande.getId());
		if (d != null) {
			d.setEtat("Rejetée");
			demandeRepository.save(d);
		}
	}

	@Override
	public void add(Demande demande) {
		if (demande.getTitre() == null || demande.getTitre().isEmpty()) {
			throw new IllegalArgumentException("Le titre ne peut pas être nul ou vide");
		}
		demandeRepository.save(demande);
	}

}
