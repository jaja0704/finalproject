package com.ntou.wbse.finalproject.villager.information.system.service;

import com.ntou.wbse.finalproject.villager.information.system.model.Villager;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Villager_Service {

    Villager findByVillagerId(String villagerId);

    Villager findByVillagerNameTr(String villagerNameTr);

    Villager findByVillagerNameEn(String villagerNameEn);

    List<Villager> findByVillagerBirthMonth(String villagerBirthMonth);

    List<Villager> findByVillagerBirthDate(String villagerBirthDate);

    List<Villager> findByVillagerSpecies(String villagerSpecies);

    List<Villager> findByVillagerGender(String villagerGender);

    List<Villager> findByVillagerPersonality(String villagerPersonality);

    Villager findByVillagerMotto(String villagerMotto);

    List<Villager> findAll();

    void saveOrUpdateVillager(Villager villager);

    void deleteVillager(String id);



}
