package be.ehb.ExamenJava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class huurder {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    @NotBlank
    private String voornaam;

    @NotBlank
    private String achternaam;

    @NotBlank
    private int telefoonnummer;

    @Email
    @NotBlank
    private String email;

}
