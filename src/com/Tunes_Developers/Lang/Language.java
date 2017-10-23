package com.Tunes_Developers.Lang;

import com.Tunes_Developers.FakerException.LanguageDeclarationMissingException;

import java.util.Random;

/**
 * Created by Geoffrey-Kimani on 10/1/2017.
 */
public class Language {
    private String [] text = {};
    private String [] titleMale = {};
    private String [] titleFemale = {};
    private String [] countries = {};

    private Random ran = new Random();
    private int textLength = 0;
    private int titleMaleLength = 0;
    private int titleFemaleLength = 0;
    private int countriesLength = 0;

    public Language() {

    }

    protected void setDetails(String [] text,String [] titleMale,String [] titleFemale,String [] countries) {
        this.text = text;
        this.titleMale = titleMale;
        this.titleFemale = titleFemale;
        this.countries = countries;
        textLength = text.length;
        titleMaleLength = titleMale.length;
        titleFemaleLength = titleFemale.length;
        countriesLength = countries.length;
    }

    public String getText() {
        if (textLength < 1) {
            try {
                throw new LanguageDeclarationMissingException();
            } catch (LanguageDeclarationMissingException e) {
                e.printStackTrace();
            }
            return null;
        }else{
            return text[ran.nextInt(textLength)];
        }
    }

    public String getText(int paragraphs,int sentences) {
        String ParagraphText = "";

        if (textLength < 1) {
            try {
                throw new LanguageDeclarationMissingException();
            } catch (LanguageDeclarationMissingException e) {
                e.printStackTrace();
            }
            return null;
        }else{
            for (int i=0;i<paragraphs;i++) {
                for (int j = 0; j < sentences; j++) {
                    ParagraphText += " " + text[ran.nextInt(textLength)];
                }
                ParagraphText += "\n\n";
            }
        }
        return ParagraphText;
    }

    public String getCountry() {
        return countries[ran.nextInt(countriesLength)];
    }

    public String getTitleMale() {
        if (titleMaleLength < 1) {
            return "";
        }else{
            return titleMale[ran.nextInt(titleMaleLength)];
        }
    }

    public String getTitleFemale() {
        if (titleFemaleLength < 1) {
            return "";
        }else{
            return titleFemale[ran.nextInt(titleFemaleLength)];
        }
    }
}
