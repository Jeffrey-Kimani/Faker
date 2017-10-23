package com.Tunes_Developers.Core;

import com.Tunes_Developers.Countries.Country;
import com.Tunes_Developers.Countries.Kenya;
import com.Tunes_Developers.Lang.English;
import com.Tunes_Developers.Lang.Language;

import java.util.Random;

/**
 * Created by Geoffrey-Kimani on 10/5/2017.
 */
public class Address {
    Country country;
    Language language;
    Base base = new Base();
    Random random = new Random();

    private String[] postalCodesFormat = {
            "####",
            "#####",
            "#####-###"
    };

    public Address(String country,String language) {
        this.country = Decode.getCountry(country);
        this.language = Decode.getLanguage(language);
    }

    public Address(Country country, Language language) {
        this.country = country;
        this.language = language;
    }

    public Address() {
        this.country = new Kenya();
        this.language = new English();
    }

    public String getCountry() {
       return language.getCountry();
    }

    public String getCity() {
        return country.getCity();
    }

    public String getCounty() {
        return country.getCounty();
    }

    public String getPostCode() {
        return base.replaceWildcardNumerifyNoZero(postalCodesFormat[random.nextInt(3)]);
    }

    public String getLatitude() {
        String latitude;

        switch (random.nextInt(2)) {
            case 0:
                latitude = base.replaceWildcardNumerifyNoZero(random.nextInt(90)+".######");
                break;
            default:
                latitude = base.replaceWildcardNumerifyNoZero("-"+ random.nextInt(90)+".######");
                break;
        }
        return latitude;
    }

    public String getLongitude() {
        String longitude;

        switch (random.nextInt(2)) {
            case 0:
                longitude = base.replaceWildcardNumerifyNoZero(random.nextInt(180)+".######");
                break;
            default:
                longitude = base.replaceWildcardNumerifyNoZero("-"+ random.nextInt(180)+".######");
                break;
        }
        return longitude;
    }
}
