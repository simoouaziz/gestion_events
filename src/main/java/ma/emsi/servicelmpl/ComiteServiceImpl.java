package ma.emsi.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;

import ma.emsi.model.ComiteOrganisation;
import ma.emsi.repository.ComiteOrganisationRepository;
import ma.emsi.service.ComiteOrganisationService;

public class ComiteServiceImpl implements ComiteOrganisationService{
	@Autowired
    private ComiteOrganisationRepository comiteOrganisationRepository;

    @Override
    public void createComiteOrganisation(ComiteOrganisation comiteOrganisation) {
        comiteOrganisationRepository.save(comiteOrganisation);
    }

    @Override
    public ComiteOrganisation getComiteOrganisationById(int id) {
        return comiteOrganisationRepository.findById(id).orElse(null);
    }

    @Override
    public void updateComiteOrganisation(ComiteOrganisation comiteOrganisation) {
        comiteOrganisationRepository.save(comiteOrganisation);
    }

    @Override
    public void deleteComiteOrganisation(int id) {
        comiteOrganisationRepository.deleteById(id);
    }

}
