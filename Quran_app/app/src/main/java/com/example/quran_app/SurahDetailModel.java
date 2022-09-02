package com.example.quran_app;

import java.util.ArrayList;

public class SurahDetailModel {
    String SurahID;
    String SurahNameE;
    String Tasmiah = "بِسۡمِ اللّٰہِ الرَّحۡمٰنِ الرَّحِیۡمِ";
    String TasmiahTarjma = "شروع اللہ کا نام لے کر جو بڑا مہربان نہایت رحم والا ہے۔";
    String TasmiahTarjmaEng = "....................";
    String ArabicText;
    String FatehMuhammadJalandri;
    String DrMohsinKhan;

    public SurahDetailModel(String surahID, String surahNameE, String tasmiah, String tasmiahTarjma, String tasmiahTarjmaEng, String arabicText, String fatehMuhammadJalandri, String drMohsinKhan) {
        SurahID = surahID;
        SurahNameE = surahNameE;
        Tasmiah = tasmiah;
        TasmiahTarjma = tasmiahTarjma;
        TasmiahTarjmaEng = tasmiahTarjmaEng;
        ArabicText = arabicText;
        FatehMuhammadJalandri = fatehMuhammadJalandri;
        DrMohsinKhan = drMohsinKhan;
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

    public String getArabicText() {
        return ArabicText;
    }

    public void setArabicText(String arabicText) {
        ArabicText = arabicText;
    }

    public String getFatehMuhammadJalandri() {
        return FatehMuhammadJalandri;
    }

    public void setFatehMuhammadJalandri(String fatehMuhammadJalandri) {
        FatehMuhammadJalandri = fatehMuhammadJalandri;
    }

    public String getDrMohsinKhan() {
        return DrMohsinKhan;
    }

    public void setDrMohsinKhan(String drMohsinKhan) {
        DrMohsinKhan = drMohsinKhan;
    }
}
