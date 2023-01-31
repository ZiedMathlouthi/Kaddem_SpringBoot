package tn.espritSpring.services;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import tn.espritSpring.DAO.entites.Departement;
import tn.espritSpring.DAO.entites.Option;
import tn.espritSpring.DAO.entites.Universite;
import tn.espritSpring.repositories.DepartementRepository;
import tn.espritSpring.repositories.UniversiteRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class DepartementServiceImpl implements DepartementService{
    DepartementRepository departementRepository;
    UniversiteRepository universiteRepository;
    @Override
    public List<Departement> retrieveAllDepartement() {
        return departementRepository.findAll();
    }

    @Override
    public Departement addDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public Departement updateDepartement(Departement D) {
        return departementRepository.save(D);
    }

    @Override
    public void deleteDepartement(Long id) {
        departementRepository.deleteById(id);

    }

    public Departement addAndAssignDepartToUniversite(Departement dep, Long idUniversite){
        Universite universite=universiteRepository.findById(idUniversite).orElse(null);
        dep.setUniversite(universite);
        departementRepository.save(dep);
        return dep;
    }
    @Override
    public Departement getdepbyid(long id) {
        return departementRepository.findById(id).orElse(null);
    }



    @Override
    public Departement retrieveDepartement(Long id) {
        return departementRepository.findById(id).orElse(null);
    }

    /*@Override
    public Departement addAndAssignDepartToUniv(Departement d, Long idUniversite) {
        Universite universite=universiteRepository.findById(idUniversite).orElse(null);
        universite.().add(d);
        departementRepository.save(d);
        return d;
    }*/


    @Override
    public List<Departement> retrieveDepartementByOptionEtudiant(Option op) {
        return departementRepository.retrieveDepartementByOptionEtudiant(op);
    }

    @Override
    public List<String> getNomsdepartbyidUniv(String nomUniv) {
        return null;
    }

    @Override
    public List<Departement> saveDepartement(List<Departement> departement) {
        List<Departement> response = (List<Departement>) departementRepository.saveAll(departement);
        return response;
    }

    @Override
    public Departement addAndAssignDepartToUniv(Departement d, Long idUniversite) {

        Universite universite=universiteRepository.findById(idUniversite).orElse(null);
        d.setUniversite(universite);
        departementRepository.save(d);
        return d;
    }


  /*  @Override
    public Departement affectDepartmentToUniv(Departement d, String nomUniversite) {
        Universite universite=universiteRepository.findUniversiteByNomUniversite(nomUniversite);
        universite.getDepartement();
        d.setUniversites(universite);
        departementRepository.save(d);

        return d;
    }*/



}
