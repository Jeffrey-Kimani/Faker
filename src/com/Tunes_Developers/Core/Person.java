package com.Tunes_Developers.Core;

import com.Tunes_Developers.Countries.Country;
import com.Tunes_Developers.Countries.Kenya;
import com.Tunes_Developers.Lang.English;
import com.Tunes_Developers.Lang.Language;

import java.util.Random;

/**
 * Created by Geoffrey-Kimani on 10/1/2017.
 */
public class Person {
    private Country country;
    private Language language;
    private String firstName = null;
    private String lastName = null;
    Random random = new Random();

    public Person(String country,String language) {
        this.country = Decode.getCountry(country);
        this.language = Decode.getLanguage(language);
    }

    public Person() {
        this.country = new Kenya();
        this.language = new English();
    }

    public Person(Country country, Language language) {
        this.country = country;
        this.language = language;
    }

    public String getFirstNameMale() {
       return country.getFirstNameMale();
    }

    public String getFirstNameFemale() {
       return country.getFirstNameFemale();
    }

    public String getLastNameMale() {
        return country.getLastNameMale();
    }

    public String getLastNameFemale() {
        return country.getLastNameFemale();
    }

    public String getOneName() {
        int choice = random.nextInt(4);

        switch (choice) {
            case 0:
                firstName = country.getFirstNameMale();
                return firstName;
            case 1:
                firstName = country.getFirstNameFemale();
                return firstName;
            case 2:
                firstName = country.getLastNameMale();
                return firstName;
            default:
                firstName = country.getLastNameFemale();
                return firstName;
        }
    }

    public String getNameMale() {
        int choice = random.nextInt(4);

        switch (choice) {
            case 0:
                firstName = country.getFirstNameMale();
                lastName = country.getLastNameMale();
                return firstName + " " + lastName;
            case 1:
                firstName = country.getFirstNameMale();
                lastName = country.getLastNameMale();
                return firstName + " " + lastName + " " + country.getLastNameMale();
            case 2:
                firstName = country.getFirstNameMale();
                lastName = country.getLastNameMale();
                return firstName + " " + lastName + " " + country.getLastNameMale();
            default:
                firstName = country.getFirstNameMale();
                lastName = country.getLastNameMale();
                return language.getTitleMale() + " " + firstName + " " + lastName + " " + country.getLastNameMale();
        }
    }

    public String getNameFemale() {
        int choice = random.nextInt(4);

        switch (choice) {
            case 0:
                firstName = country.getFirstNameFemale();
                lastName = country.getLastNameFemale();
                return firstName + " " + lastName;
            case 1:
                firstName = country.getFirstNameFemale();
                lastName = country.getLastNameFemale();
                return firstName + " " + lastName + " " + country.getLastNameFemale();
            case 2:
                firstName = country.getFirstNameFemale();
                lastName = country.getLastNameFemale();
                return language.getTitleMale() + " " + firstName + " " + lastName;
            default:
                firstName = country.getFirstNameFemale();
                lastName = country.getLastNameFemale();
                return language.getTitleFemale() + " " + firstName + " " + lastName + " " + country.getLastNameFemale();
        }
    }

    public String getName() {
        int choice = random.nextInt(4);
        String name = "";

        switch (choice) {
            case 0:
                firstName = country.getFirstNameFemale();
                lastName = getLastNameFemale();
                return firstName + " " + lastName;
            case 1:
                firstName = country.getFirstNameFemale();
                lastName = getLastNameFemale();
                return firstName + " " + lastName + " " + country.getLastNameFemale();
            case 2:
                firstName = country.getFirstNameMale();
                lastName = getLastNameMale();
                return firstName + " " + lastName;
            default:
                firstName = country.getFirstNameMale();
                lastName = getLastNameMale();
                return firstName + " " + lastName + " " + country.getLastNameMale();
        }
    }

    public String getTitle() {
        int choice = random.nextInt(1);

        switch (choice) {
            case 0:
                return language.getTitleMale();
            default:
                return language.getTitleFemale();
        }
    }

    public String getNameMaleTitled() {
        firstName = country.getFirstNameMale();
        lastName = country.getLastNameMale();
        return language.getTitleMale() + " " + firstName + " " + lastName;
    }

    public String getNameFemaleTitled() {
        firstName = country.getFirstNameFemale();
        lastName = country.getLastNameFemale();
        return language.getTitleFemale() + " " + firstName + " " + lastName;
    }

    public String getUserName() {
        String name;
        Base b = new Base();

        switch (random.nextInt(9)) {
            case 0:
                name = country.getFirstNameMale() + "." + country.getLastNameMale();
                break;
            case 1:
                name = country.getFirstNameFemale()+"."+country.getLastNameFemale();
                break;
            case 2:
                name = country.getLastNameFemale();
                break;
            case 3:
                name = country.getLastNameMale();
                break;
            case 4:
                name = b.replaceWildcardLexify("??_"+country.getLastNameMale());
                break;
            case 5:
                name = b.replaceWildcardLexify("??_"+country.getLastNameFemale());
                break;
            case 6:
                name = b.replaceWildcardLexify(country.getLastNameMale()+"_??");
                break;
            case 7:
                name = b.replaceWildcardLexify(country.getLastNameFemale()+"_??");
                break;
            case 8:
                name = b.replaceWildcardNumerify(country.getLastNameMale()+"##");
                break;
            default:
                name = b.replaceWildcardNumerify(country.getLastNameFemale()+"##");
                break;
        }
        return name;
    }

    public String getUserNameResource() {
        String name;
        Base b = new Base();

        if (firstName == null && lastName == null) {
            return getUserName();
        }else{
            if (lastName != null) {
                switch (random.nextInt(9)) {
                    case 0:
                        name = firstName + "." + lastName;
                        break;
                    case 1:
                        name = firstName+"."+lastName;
                        break;
                    case 2:
                        name = lastName;
                        break;
                    case 3:
                        name = lastName;
                        break;
                    case 4:
                        name = b.replaceWildcardLexify("??_"+lastName);
                        break;
                    case 5:
                        name = b.replaceWildcardLexify("??_"+lastName);
                        break;
                    case 6:
                        name = b.replaceWildcardLexify(lastName+"_??");
                        break;
                    case 7:
                        name = b.replaceWildcardLexify(lastName+"_??");
                        break;
                    case 8:
                        name = b.replaceWildcardNumerify(lastName+"##");
                        break;
                    default:
                        name = b.replaceWildcardNumerify(lastName+"##");
                        break;
                }
            }else{
                switch (random.nextInt(8)) {
                    case 0:
                        name = firstName;
                        break;
                    case 1:
                        name = firstName;
                        break;
                    case 2:
                        name = b.replaceWildcardLexify("??_"+firstName);
                        break;
                    case 3:
                        name = b.replaceWildcardLexify("??_"+firstName);
                        break;
                    case 4:
                        name = b.replaceWildcardLexify(firstName+"_??");
                        break;
                    case 5:
                        name = b.replaceWildcardLexify(firstName+"_??");
                        break;
                    case 6:
                        name = b.replaceWildcardNumerify(firstName+"##");
                        break;
                    default:
                        name = b.replaceWildcardNumerify(firstName+"##");
                        break;
                }
            }
        }

        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
