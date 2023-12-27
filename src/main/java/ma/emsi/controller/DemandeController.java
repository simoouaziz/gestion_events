package ma.emsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ma.emsi.model.Demande;
import ma.emsi.service.DemandeService;

public class DemandeController {
	 @Autowired
	    private DemandeService demandeService;

	    @PostMapping("/add")
	    public ResponseEntity<Void> addDemande(@RequestBody Demande demande) {
	        demandeService.createDemande(demande);
	        return ResponseEntity.noContent().build();
	    }

	    @GetMapping("/get/{id}")
	    public ResponseEntity<Demande> getDemandeById(@PathVariable int id) {
	        Demande demande = demandeService.getDemandeById(id);
	        return ResponseEntity.ok().body(demande);
	    }

	    @PutMapping("/update")
	    public ResponseEntity<Void> updateDemande(@RequestBody Demande demande) {
	        demandeService.updateDemande(demande);
	        return ResponseEntity.noContent().build();
	    }

	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> deleteDemande(@PathVariable int id) {
	        demandeService.deleteDemande(id);
	        return ResponseEntity.noContent().build();
	    }

}
