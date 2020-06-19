package com.ntou.wbse.finalproject.villager.information.system.controller;


import com.ntou.wbse.finalproject.villager.information.system.model.Villager;
import com.ntou.wbse.finalproject.villager.information.system.service.Villager_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController("")
@RequestMapping("/villagers")
public class Villager_Controller {

    @Autowired
    private Villager_Service VillagerService;

    @RequestMapping("/")
    public String index() {
        return "Spring Boot Example!!";
    }

    @GetMapping(value = "/")
    public List<Villager> getAllVillager() {
        return VillagerService.findAll();
    }

    @GetMapping(value = "/id/{villagerId}")
    public Villager getVillagerByVillagerId(@PathVariable("villagerId") String villagerId) {
        return VillagerService.findByVillagerId(villagerId);
    }

    @GetMapping(value = "/NameTr/{villagerNameTr}")
    public List<Villager> getVillagerByNameTr(@PathVariable("villagerNameTr") String villagerNameTr) {
        return VillagerService.findByVillagerNameTr(villagerNameTr);
    }

    @GetMapping(value = "/NameEn/{villagerNameEn}")
    public List<Villager> getVillagerByNameEn(@PathVariable("villagerNameEn") String villagerNameEn) {
        return VillagerService.findByVillagerNameEn(villagerNameEn);
    }

    @GetMapping(value = "/BirthMonth/{villagerBirthMonth}")
    public List<Villager> getVillagerByBirthMonth(@PathVariable("villagerBirthMonth") String villagerBirthMonth) {
        return VillagerService.findByVillagerBirthMonth(villagerBirthMonth);
    }

    @GetMapping(value = "//BirthDate/{villagerBirthDate}")
    public List<Villager> getVillagerByBirthDate(@PathVariable("villagerBirthDate") String villagerBirthDate) {
        return VillagerService.findByVillagerBirthDate(villagerBirthDate);
    }

    @GetMapping(value = "/Species/{villagerSpecies}")
    public List<Villager> getVillagerBySpecies(@PathVariable("villagerSpecies") String villagerSpecies) {
        return VillagerService.findByVillagerSpecies(villagerSpecies);
    }

    @GetMapping(value = "/Gender/{villagerGender}")
    public List<Villager> getVillagerByGender(@PathVariable("villagerGender") String villagerGender) {
        return VillagerService.findByVillagerGender(villagerGender);
    }

    @GetMapping(value = "/Personality/{villagerPersonality}")
    public List<Villager> getVillagerByPersonality(@PathVariable("villagerPersonality") String villagerPersonality) {
        return VillagerService.findByVillagerPersonality(villagerPersonality);
    }

    @GetMapping(value = "/Motto/{villagerMotto}")
    public List<Villager> getVillagerByMotto(@PathVariable("villagerMotto") String villagerMotto) {
        return VillagerService.findByVillagerMotto(villagerMotto);
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> saveOrUpdateVillager(@RequestBody Villager villager) {
        VillagerService.saveOrUpdateVillager(villager);
        return new ResponseEntity("villager added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{villagerId}")
    public ResponseEntity<?> deleteVillager(@PathVariable String villagerId) {
        VillagerService.deleteVillager(VillagerService.findByVillagerId(villagerId).getVillagerId());
        return new ResponseEntity("villager delete successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/user/contactSearch/Species", method = RequestMethod.GET)
    public ModelAndView  contactSearch(String keyword){
//        String villagerSpecies = (String) session.getAttribute("Species");
        ModelAndView model = new ModelAndView("searchchr");
        model.addObject("contactList", VillagerService.findByVillagerSpecies(keyword));
        return model;
    }
    @RequestMapping(value = "/user/contactSearch/NameTr", method = RequestMethod.GET)
    public ModelAndView  contactSearchNameTr(String keyword){
//        String villagerSpecies = (String) session.getAttribute("Species");
        ModelAndView model = new ModelAndView("searchchr");
        model.addObject("contactList", VillagerService.findByVillagerNameTr(keyword));
        return model;
    }
    @RequestMapping(value = "/user/contactSearch/NameEn", method = RequestMethod.GET)
    public ModelAndView  contactSearchNameEn(String keyword){
//        String villagerSpecies = (String) session.getAttribute("Species");
        ModelAndView model = new ModelAndView("searchchr");
        model.addObject("contactList", VillagerService.findByVillagerNameEn(keyword));
        return model;
    }
    @RequestMapping(value = "/user/contactSearch/Gender", method = RequestMethod.GET)
    public ModelAndView  contactSearchGender(String keyword){
//        String villagerSpecies = (String) session.getAttribute("Species");
        ModelAndView model = new ModelAndView("searchchr");
        model.addObject("contactList", VillagerService.findByVillagerGender(keyword));
        return model;
    }
    @RequestMapping(value = "/user/contactSearch/BirthMonth", method = RequestMethod.GET)
    public ModelAndView  contactSearchBirthMonth(String keyword){
//        String villagerSpecies = (String) session.getAttribute("Species");
        ModelAndView model = new ModelAndView("searchchr");
        model.addObject("contactList", VillagerService.findByVillagerBirthMonth(keyword));
        return model;
    }
    @RequestMapping(value = "/user/contactSearch/BirthDay", method = RequestMethod.GET)
    public ModelAndView  contactSearchBirthDay(String keyword){
//        String villagerSpecies = (String) session.getAttribute("Species");
        ModelAndView model = new ModelAndView("searchchr");
        model.addObject("contactList", VillagerService.findByVillagerBirthDate(keyword));
        return model;
    }
    @RequestMapping(value = "/user/contactSearch/Personality", method = RequestMethod.GET)
    public ModelAndView  contactSearchPersonality(String keyword){
//        String villagerSpecies = (String) session.getAttribute("Species");
        ModelAndView model = new ModelAndView("searchchr");
        model.addObject("contactList", VillagerService.findByVillagerPersonality(keyword));
        return model;
    }
    @RequestMapping(value = "/user/contactSearch/Motto", method = RequestMethod.GET)
    public ModelAndView  contactSearchMotto(String keyword){
//        String villagerSpecies = (String) session.getAttribute("Species");
        ModelAndView model = new ModelAndView("searchchr");
        model.addObject("contactList", VillagerService.findByVillagerMotto(keyword));
        return model;
    }

    @RequestMapping(value = "/admin/insert", method = RequestMethod.POST)
    public ModelAndView  createProduct(String Id, String NameTr, String NameEn, String Gender, String BirthMonth, String BirthDate, String Personality, String Species, String Motto ){
//        String villagerSpecies = (String) session.getAttribute("Species");
        ModelAndView model = new ModelAndView("admin");

        Villager villager= new Villager();
        villager.setVillagerId(Id);
        villager.setVillagerNameTr(NameTr);
        villager.setVillagerNameEn(NameEn);
        villager.setVillagerBirthMonth(BirthMonth);
        villager.setVillagerBirthDate(BirthDate);
        villager.setVillagerGender(Gender);
        villager.setVillagerPersonality(Personality);
        villager.setVillagerSpecies(Species);
        villager.setVillagerMotto(Motto);

        VillagerService.saveOrUpdateVillager(villager);

        return model;
    }

//    @PostMapping("/admin/insert")
//    public ResponseEntity<String> createProduct(@RequestBody Villager request){
////        String villagerSpecies = (String) session.getAttribute("Species");
//         Villager villager= new Villager();
//        villager.setVillagerId(request.getVillagerId());
//        villager.setVillagerNameTr(request.getVillagerNameTr());
//        villager.setVillagerNameEn(request.getVillagerNameEn());
//        villager.setVillagerBirthMonth(villager.getVillagerBirthMonth());
//        villager.setVillagerBirthDate(villager.getVillagerBirthDate());
//        villager.setVillagerGender(villager.getVillagerGender());
//        villager.setVillagerPersonality(villager.getVillagerPersonality());
//        villager.setVillagerMotto(villager.getVillagerMotto());
//
//        VillagerService.saveOrUpdateVillager(villager);
//
//        return new ResponseEntity("villager added successfully", HttpStatus.OK);
//    }

    @RequestMapping(value = "/admin/delete", method = RequestMethod.POST)
    public ModelAndView  deleteTd(String Id){
//        String villagerSpecies = (String) session.getAttribute("Species");
        ModelAndView model = new ModelAndView("admin");
        VillagerService.deleteVillager(VillagerService.findByVillagerId(Id).getVillagerId());
        return model;
    }
}
