package tn.espritSpring.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import tn.espritSpring.DAO.entites.Universite;

import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    /*@Query("SELECT departement FROM Departement departement,Universite universite inner JOIN universite.departements d ON d.idDepartement=departement.idDepartement and Departement.nomDepartement=:Noms and universite.idUniversite=:idUniv ")
    List findUniversiteByDepartements(Long idUniv);*/
    Universite findUniversiteByNomUniversite(String nomUniv);
}
