package tn.espritSpring.services;


import tn.espritSpring.DAO.entites.Universite;

import java.util.List;

public interface UniversiteService {
    List<Universite> getAllUniversite();
    Universite addUniversite(Universite U);
    Universite updateUniversite(Universite U);
    void deleteUniversite(Long id);
    Universite getUniversiteById(Long id);
    public void assignDepartToUni(Long idU,Long dep);
    //List getNomsdepartbyidUniv(Long idUniv);
    long nbTotalDepartment(Long idU);
    Universite getUnid(long id);
}
