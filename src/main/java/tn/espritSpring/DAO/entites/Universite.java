package tn.espritSpring.DAO.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Universite")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Universite  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversite")
    private Long idUniversite;
    private String nomUniversite;
    private  String description;
    private  String adresse;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "universite")
    private List<Departement> departments;
}
