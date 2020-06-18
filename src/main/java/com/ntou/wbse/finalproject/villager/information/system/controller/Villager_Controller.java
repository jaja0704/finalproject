package com.ntou.wbse.finalproject.villager.information.system.controller;


import com.ntou.wbse.finalproject.villager.information.system.model.Villager;
import com.ntou.wbse.finalproject.villager.information.system.service.Villager_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/{villagerId}")
    public Villager getVillagerByVillagerId(@PathVariable("villagerId") String villagerId) {
        return VillagerService.findByVillagerId(villagerId);
    }

    @GetMapping(value = "/{villagerNameTr}")
    public Villager getVillagerByNameTr(@PathVariable("villagerNameTr") String villagerNameTr) {
        return VillagerService.findByVillagerNameTr(villagerNameTr);
    }

    @GetMapping(value = "/{villagerNameEn}")
    public Villager getVillagerByNameEn(@PathVariable("villagerNameEn") String villagerNameEn) {
        return VillagerService.findByVillagerNameEn(villagerNameEn);
    }

    @GetMapping(value = "/{villagerBirthMonth}")
    public List<Villager> getVillagerByBirthMonth(@PathVariable("villagerBirthMonth") String villagerBirthMonth) {
        return VillagerService.findByVillagerBirthMonth(villagerBirthMonth);
    }

    @GetMapping(value = "/{villagerBirthDate}")
    public List<Villager> getVillagerByBirthDate(@PathVariable("villagerBirthDate") String villagerBirthDate) {
        return VillagerService.findByVillagerBirthDate(villagerBirthDate);
    }

    @GetMapping(value = "/{villagerSpecies}")
    public List<Villager> getVillagerBySpecies(@PathVariable("villagerSpecies") String villagerSpecies) {
        return VillagerService.findByVillagerSpecies(villagerSpecies);
    }

    @GetMapping(value = "/{villagerGender}")
    public List<Villager> getVillagerByGender(@PathVariable("villagerGender") String villagerGender) {
        return VillagerService.findByVillagerGender(villagerGender);
    }

    @GetMapping(value = "/{villagerPersonality}")
    public List<Villager> getVillagerByPersonality(@PathVariable("villagerPersonality") String villagerPersonality) {
        return VillagerService.findByVillagerPersonality(villagerPersonality);
    }

    @GetMapping(value = "/{villagerMotto}")
    public Villager getVillagerByMotto(@PathVariable("villagerMotto") String villagerMotto) {
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
        return new ResponseEntity("villager added successfully", HttpStatus.OK);
    }
}
