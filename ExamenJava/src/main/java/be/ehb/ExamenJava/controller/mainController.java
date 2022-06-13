package be.ehb.ExamenJava.controller;

import be.ehb.ExamenJava.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class mainController {

    autoDao autoDao;

    huurderDao huurderDao;

    verhuurderDao verhuurderDao;


    @Autowired

    public mainController(autoDao autoDao, huurderDao huurderDao, verhuurderDao verhuurderDao) {
        this.autoDao = autoDao;
        this.huurderDao = huurderDao;
        this.verhuurderDao = verhuurderDao;
    }

    @RequestMapping(value = "/api/cars", method = RequestMethod.GET)
    @ResponseBody

    public Iterable<auto> findAll(){

    return autoDao.findAll();
    }

    @RequestMapping(value = "/api/cars/{manufacturer}" , method = RequestMethod.GET)
    @ResponseBody

    public Iterable<auto> giveAllAutosForFabrikant(@PathVariable("fabrikant")String fabrikant){
        if (autoDao.equals(fabrikant)){
        auto autoEen = autoDao.findAll(fabrikant).get();

        return autoEen.getFabrikant();
        }
    return new ArrayList<fabrikant>();
    }



    @RequestMapping(value = "/api/locations", method = RequestMethod.GET)
    @ResponseBody

    public Iterable<verhuurder> findAllVerhuurder(){
        return verhuurderDao.findAll();
    }


    @RequestMapping(value = "/api/customers/new", method = RequestMethod.POST)

    public HttpStatus nieuwHuurder(@RequestParam("voornaam")String voornaam,
                                   @RequestParam("achternaam") String achternaam,
                                   @RequestParam("telefoonnummer") int telefoonnummer,
                                   @RequestParam("email") String email){

    huurder huurdereen = new huurder();
    huurdereen.setVoornaam(voornaam);
    huurdereen.setAchternaam(achternaam);
    huurdereen.setTelefoonnummer(telefoonnummer);
    huurdereen.setEmail(email);
    huurderDao.save(huurdereen);


    return HttpStatus.OK;
    }



}
