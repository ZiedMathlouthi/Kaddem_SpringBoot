package tn.espritSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.espritSpring.DAO.entites.Departement;
import tn.espritSpring.DAO.entites.Option;
;

import java.util.List;

public interface DepartementRepository extends JpaRepository<Departement,Long> {


    @Query("SELECT  departement FROM Departement  departement  , Etudinat e where departement.idDepartement=e.departement.idDepartement and e.option = :op")
    List<Departement> retrieveDepartementByOptionEtudiant(@Param("op") Option op);

}
