package com.ntou.wbse.finalproject.villager.information.system.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "villagers")
public class Villager {

    @Id
    private String villagerId;
    private String villagerNameTr;
    private String villagerNameEn;
    private String villagerBirthMonth;
    private String villagerBirthDate;
    private String villagerSpecies;
    private String villagerGender;
    private String villagerPersonality;
    private String villagerMotto;


//    private  照片


    public String getVillagerNameTr() {
        return villagerNameTr;
    }

    public void setVillagerNameTr(String villagerNameTr) {
        this.villagerNameTr = villagerNameTr;
    }

    public String getVillagerNameEn() {
        return villagerNameEn;
    }

    public void setVillagerNameEn(String villagerNameEn) {
        this.villagerNameEn = villagerNameEn;
    }

    public String getVillagerBirthMonth() {
        return villagerBirthMonth;
    }

    public void setVillagerBirthMonth(String villagerBirthMonth) {
        this.villagerBirthMonth = villagerBirthMonth;
    }

    public String getVillagerBirthDate() {
        return villagerBirthDate;
    }

    public void setVillagerBirthDate(String villagerBirthDate) {
        this.villagerBirthDate = villagerBirthDate;
    }

    public String getVillagerSpecies() {
        return villagerSpecies;
    }

    public void setVillagerSpecies(String villagerSpecies) {
        this.villagerSpecies = villagerSpecies;
    }

    public String getVillagerGender() {
        return villagerGender;
    }

    public void setVillagerGender(String villagerGender) {
        this.villagerGender = villagerGender;
    }

    public String getVillagerPersonality() {
        return villagerPersonality;
    }

    public void setVillagerPersonality(String villagerPersonality) {
        this.villagerPersonality = villagerPersonality;
    }

    public String getVillagerMotto() {
        return villagerMotto;
    }

    public void setVillagerMotto(String villagerMotto) {
        this.villagerMotto = villagerMotto;
    }

    public String getVillagerId() {
        return villagerId;
    }

    public void setVillagerId(String villagerId) {
        this.villagerId = villagerId;
    }
}
