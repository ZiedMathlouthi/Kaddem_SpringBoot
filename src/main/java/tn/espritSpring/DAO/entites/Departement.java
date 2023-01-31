package tn.espritSpring.DAO.entites;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import com.sun.istack.NotNull;
import lombok.*;
import tn.espritSpring.DAO.entites.Etudinat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Departement")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Departement implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idDepartement")
    private Long idDepartement;
    private String nomDepartement;
    private  String code;
    private  String type;
    private  String description;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "departement")
    private Set<Etudinat> etudiants;
    @ManyToOne
    Universite universite;
}
