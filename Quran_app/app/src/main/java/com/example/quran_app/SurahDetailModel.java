package com.example.quran_app;

import java.util.ArrayList;

public class SurahDetailModel {
    String ArabicText;
    String FatehMuhammadJalandri;
    String DrMohsinKhan;

    public SurahDetailModel(String arabicText, String fatehMuhammadJalandri, String drMohsinKhan) {
        ArabicText = arabicText;
        FatehMuhammadJalandri = fatehMuhammadJalandri;
        DrMohsinKhan = drMohsinKhan;
    }

    @Override
    public String toString() {
        return  ArabicText+"\n" +
                "\n" + FatehMuhammadJalandri +
                "\n" + DrMohsinKhan;
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
