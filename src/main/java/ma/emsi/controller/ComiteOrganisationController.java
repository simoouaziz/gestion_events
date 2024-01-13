package ma.emsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ma.emsi.model.ComiteOrganisation;
import ma.emsi.service.ComiteOrganisationService;

public class ComiteOrganisationController {
	
	@Autowired
    private ComiteOrganisationService comiteOrganisationService;

    @PostMapping("/add")
    public ResponseEntity<Void> addComiteOrganisation(@RequestBody ComiteOrganisation comiteOrganisation) {
        comiteOrganisationService.createComiteOrganisation(comiteOrganisation);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ComiteOrganisation> getComiteOrganisationById(@PathVariable int id) {
        ComiteOrganisation comiteOrganisation = comiteOrganisationService.getComiteOrganisationById(id);
        return ResponseEntity.ok().body(comiteOrganisation);
    }

    @PutMapping("/update")
    public ResponseEntity<Void> updateComiteOrganisation(@RequestBody ComiteOrganisation comiteOrganisation) {
        comiteOrganisationService.updateComiteOrganisation(comiteOrganisation);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteComiteOrganisation(@PathVariable int id) {
        comiteOrganisationService.deleteComiteOrganisation(id);
        return ResponseEntity.noContent().build();
    }

}
