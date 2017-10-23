package com.Tunes_Developers.Core;

import com.Tunes_Developers.Countries.Country;
import com.Tunes_Developers.Countries.Kenya;
import com.Tunes_Developers.Lang.English;
import com.Tunes_Developers.Lang.Language;

import java.util.Random;

/**
 * Created by Geoffrey-Kimani on 10/1/2017.
 */
public class Internet {
    Country country;
    Language language;
    Person person;
    Random random = new Random();
    Base base = new Base();


    public Internet(String country,String language) {
        this.country = Decode.getCountry(country);
        this.language = Decode.getLanguage(language);

        person = new Person(this.country, this.language);
    }

    public Internet(Country country, Language language) {
        this.country = country;
        this.language = language;
    }

    public Internet() {
        this.country = new Kenya();
        this.language = new English();

        person = new Person(this.country, this.language);
    }

    public String getIPV4() {
        return  base.replaceWildcardNumerifyConstrainNoZeros("###.###.###.##","255.255.255.99");
    }

    public String getlocalIPV4() {
        return base.replaceWildcardNumerifyConstrainNoZeros("##.###.##.#","99.255.99.9");
    }

    public String getIPV6() {
        String address = "",colon = ":";

        for (int i = 0; i < 8; i++) {
            if (i == 7) {
                colon = "";
            }
            String add = Integer.toHexString(random.nextInt(65535)),zero = "";

            if (add.length() < 4) {
                for (int j = 0; j < 4-add.length(); j++) {
                    zero += "0";
                }
            }

            address += zero + add + colon;
        }

        return address;
    }

    public String getMacAddress() {
        String address = "",colon = ":";

        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                colon = "";
            }
            String add = Integer.toHexString(random.nextInt(64));

            if (add.length() < 2) {
                address += "0" + add + colon;
            } else {
                address += add + colon;
            }
        }

        return address.toUpperCase();
    }

    public String getEmail() {
        return (person.getUserName()+"@"+ person.getLastNameMale()+"."+country.getDomain()).toLowerCase();
    }

    public String getFreeEmail() {
        return (person.getUserName()+"@"+country.getFreeDomain()).toLowerCase();
    }

    public String getSafeEmail() {
        return (person.getUserName()+"@"+country.getSafeDomain()).toLowerCase();
    }

    public String getEmailResource(String firstName,String lastName) {
        person.setFirstName(firstName);
        person.setLastName(lastName);
        return (person.getUserNameResource()+"@"+ person.getOneName()+"."+country.getDomain()).toLowerCase();
    }

    public String getFreeEmailResource(String firstName,String lastName) {
        person.setFirstName(firstName);
        person.setLastName(lastName);
        return (person.getUserNameResource()+"@"+country.getFreeDomain()).toLowerCase();
    }

    public String getSafeEmailResource(String firstName,String lastName) {
        person.setFirstName(firstName);
        person.setLastName(lastName);
        return (person.getUserNameResource()+"@"+country.getSafeDomain()).toLowerCase();
    }

    public String getUrl() {
        String username = person.getUserName();

        String base =  "http://"+username+"."+country.getDomain()+"/";
        Lorem lorem = new Lorem();

        for (int i = -1; i < random.nextInt(6); i++) {
            base+=lorem.getWord()+"-";
        }
        base = base.substring(0, base.lastIndexOf("-"));

        switch (random.nextInt(2)) {
            case 0:
                base += ".html";
                break;
            default:
                base += ".htm";
                break;
        }
        return base.toLowerCase();
    }

    public String getDomainName() {
        String username = person.getUserName();

        return (username+"."+country.getDomain()).toLowerCase();
    }

    public String getSlug() {
        String slug = "";
        Lorem lorem = new Lorem();

        for (int i = -1; i < random.nextInt(4); i++) {
            slug+=lorem.getWord()+"-";
        }

        return slug.substring(0,slug.lastIndexOf("-"));
    }

    public String getPassword() {
        return base.replaceWildcardAsciify("***********");
    }

    public String getTid() {
        return country.getDomain();
    }
}
