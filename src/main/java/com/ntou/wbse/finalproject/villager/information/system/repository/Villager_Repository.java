package com.ntou.wbse.finalproject.villager.information.system.repository;

import com.ntou.wbse.finalproject.villager.information.system.model.Villager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Villager_Repository extends MongoRepository<Villager, String> {

    Villager findByVillagerId(String villagerId);

    Villager findByVillagerNameTr(String villagerNameTr);

    Villager findByVillagerNameEn(String villagerNameEn);

    List<Villager> findByVillagerBirthMonth(String villagerBirthMonth);

    List<Villager> findByVillagerBirthDate(String villagerBirthDate);

    List<Villager> findByVillagerSpecies(String villagerSpecies);

    List<Villager> findByVillagerGender(String villagerGender);

    List<Villager> findByVillagerPersonality(String villagerPersonality);

    Villager findByVillagerMotto(String villagerMotto);

}
