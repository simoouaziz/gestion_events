package ma.emsi.service;

import ma.emsi.model.ComiteOrganisation;

public interface ComiteOrganisationService {

	void createComiteOrganisation(ComiteOrganisation comiteOrganisation);
    ComiteOrganisation getComiteOrganisationById(int id);
    void updateComiteOrganisation(ComiteOrganisation comiteOrganisation);
    void deleteComiteOrganisation(int id);
}
