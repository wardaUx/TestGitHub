package com.example.sb.warda.languageapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class Words {

    private String EnglishTranslation;
    private String urduTranslation;
  //  private int imagesId;

    public Words(String mEnglishTranslation, String murduTranslation) {
        EnglishTranslation = mEnglishTranslation;
        urduTranslation= murduTranslation;
    //   imagesId = mImagesId;
    }


    public String getEnglishTranslation() {
        return EnglishTranslation;
    }

    public String getUrduTranslation() {
        return urduTranslation;
    }

//    public int getImagesId() {
//        return imagesId;
//    }
}
