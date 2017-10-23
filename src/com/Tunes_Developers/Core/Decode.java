package com.Tunes_Developers.Core;

import com.Tunes_Developers.Countries.*;
import com.Tunes_Developers.Lang.*;

/**
 * Created by Geoffrey-Kimani on 10/2/2017.
 */
public class Decode {
    public static Country getCountry(String countryCode) {
        Country country;
        switch (countryCode.toLowerCase()) {
            case "kenya":
                country = new Kenya();
                break;
            case "china":
                country = new China();
                break;
            case "france":
                country = new France();
                break;
            case "germany":
                country = new Germany();
                break;
            case "greatbritain":
                country = new GreatBritain();
                break;
            case "great britain":
                country = new GreatBritain();
                break;
            case "greece":
                country = new Greece();
                break;
            case "india":
                country = new India();
                break;
            case "italy":
                country = new Italy();
                break;
            case "japan":
                country = new Japan();
                break;
            case "jordan":
                country = new Jordan();
                break;
            case "newzeland":
                country = new NewZeland();
                break;
            case "new zeland":
                country = new NewZeland();
                break;
            case "russia":
                country = new Russia();
                break;
            case "southkorea":
                country = new SouthKorea();
                break;
            case "south korea":
                country = new SouthKorea();
                break;
            case "spain":
                country = new Spain();
                break;
            case "usa":
                country = new USA();
                break;
            case "us":
                country = new USA();
                break;
            case "united states":
                country = new USA();
                break;
            case "united states of america":
                country = new USA();
                break;
            default:
                country = new Kenya();
                break;
        }

        return country;
    }

    public static Language getLanguage(String languageCode) {
        Language language;

        switch (languageCode.toLowerCase()) {
            case "english":
                language = new English();
                break;
            case "arabic":
                language = new Arabic();
                break;
            case "chinese":
                language = new Chinese();
                break;
            case "french":
                language = new French();
                break;
            case "german":
                language = new German();
                break;
            case "greek":
                language = new Greek();
                break;
            case "italian":
                language = new Italian();
                break;
            case "japanese":
                language = new Japanese();
                break;
            case "korean":
                language = new Korean();
                break;
            case "russian":
                language = new Russian();
                break;
            case "spanish":
                language = new Spanish();
                break;
            default:
                language = new English();
                break;
        }
        return language;
    }
}
