package com.example.quran_app;

public class SurahModel {
    String SurahID;
    String SurahNameE;

    public SurahModel(String id,String name) {
    this.SurahID=id;
    this.SurahNameE=name;
    }

    @Override
    public String toString() {
        return SurahID + ". " + SurahNameE;
    }

    public String getSurahID() {
        return SurahID;
    }

    public void setSurahID(String surahID) {
        SurahID = surahID;
    }

    public String getSurahNameE() {
        return SurahNameE;
    }

    public void setSurahNameE(String surahNameE) {
        SurahNameE = surahNameE;
    }
}
