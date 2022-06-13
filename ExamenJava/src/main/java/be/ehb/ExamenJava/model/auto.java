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

    public auto() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChassisNummer() {
        return chassisNummer;
    }

    public void setChassisNummer(int chassisNummer) {
        this.chassisNummer = chassisNummer;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getFabrikant() {
        return fabrikant;
    }

    public void setFabrikant(String fabrikant) {
        this.fabrikant = fabrikant;
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
    }
}
