package ma.emsi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.model.MoyenDeTransport;

public interface MoyenDeTransportRepository extends JpaRepository<MoyenDeTransport, Integer> {

	// Rechercher tous les moyens de transport par type
    List<MoyenDeTransport> findByType(String type);

    // Rechercher tous les moyens de transport disponibles (non utilisés dans une demande)
   // List<MoyenDeTransport> findUnusedTransports();
}
