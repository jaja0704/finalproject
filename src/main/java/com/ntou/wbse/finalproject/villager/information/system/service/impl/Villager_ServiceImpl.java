package com.ntou.wbse.finalproject.villager.information.system.service.impl;

import com.ntou.wbse.finalproject.villager.information.system.model.Villager;
import com.ntou.wbse.finalproject.villager.information.system.repository.Villager_Repository;
import com.ntou.wbse.finalproject.villager.information.system.service.Villager_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Villager_ServiceImpl implements Villager_Service{

    @Autowired
    private Villager_Repository VillagerRepository;

    @Override
    public Villager findByVillagerId(String villagerId) {
        return VillagerRepository.findByVillagerId(villagerId);
    }

    @Override
    public Villager findByVillagerNameTr(String villagerNameTr) {
        return VillagerRepository.findByVillagerNameTr(villagerNameTr);
    }

    @Override
    public Villager findByVillagerNameEn(String villagerNameEn) {
        return VillagerRepository.findByVillagerNameEn(villagerNameEn);
    }

    @Override
    public List<Villager> findByVillagerBirthMonth(String villagerBirthMonth) {
        return VillagerRepository.findByVillagerBirthMonth(villagerBirthMonth);
    }

    @Override
    public List<Villager> findByVillagerBirthDate(String villagerBirthDate) {
        return VillagerRepository.findByVillagerBirthDate(villagerBirthDate);
    }

    @Override
    public List<Villager> findByVillagerSpecies(String villagerSpecies) {
        return VillagerRepository.findByVillagerSpecies(villagerSpecies);
    }

    @Override
    public List<Villager> findByVillagerGender(String villagerGender) {
        return VillagerRepository.findByVillagerGender(villagerGender);
    }

    @Override
    public List<Villager> findByVillagerPersonality(String villagerPersonality) {
        return VillagerRepository.findByVillagerPersonality(villagerPersonality);
    }

    @Override
    public Villager findByVillagerMotto(String villagerMotto) {
        return VillagerRepository.findByVillagerMotto(villagerMotto);
    }


    @Override
    public List<Villager> findAll() {
        return VillagerRepository.findAll();
    }

    @Override
    public void saveOrUpdateVillager(Villager villager) {
        VillagerRepository.save(villager);
    }

    @Override
    public void deleteVillager(String id) {
        VillagerRepository.deleteById(id);
    }

}
