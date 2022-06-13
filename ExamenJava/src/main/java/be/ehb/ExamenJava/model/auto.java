package be.ehb.ExamenJava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class auto {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    @NotBlank
    private int chassisNummer;

    @NotBlank
    private String merk;

    @NotBlank
    private String fabrikant;

    @NotBlank
    private int aantalDeuren;

}
