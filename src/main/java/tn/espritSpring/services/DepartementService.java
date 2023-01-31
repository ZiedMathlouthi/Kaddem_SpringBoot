package tn.espritSpring.services;

import tn.espritSpring.DAO.entites.Departement;
import tn.espritSpring.DAO.entites.Option;

import java.util.List;

public interface DepartementService {

    List<Departement> retrieveAllDepartement();
    Departement getdepbyid(long id);

    Departement addDepartement(Departement departement);

    Departement updateDepartement(Departement D);


    void deleteDepartement(Long id);

    Departement retrieveDepartement(Long id);

    Departement addAndAssignDepartToUniv(Departement d, Long idUniversite);
    Departement addAndAssignDepartToUniversite(Departement dep, Long idUniversite);

    List<Departement> retrieveDepartementByOptionEtudiant(Option op);

    List<String> getNomsdepartbyidUniv(String  nomUniv);
     List<Departement> saveDepartement(List<Departement> departement);

}


