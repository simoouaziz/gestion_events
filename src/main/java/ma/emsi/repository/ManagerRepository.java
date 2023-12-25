package ma.emsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.model.Manager;
import ma.emsi.model.User;

public interface ManagerRepository extends JpaRepository<Manager, Integer>{

}
