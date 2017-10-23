package com.Tunes_Developers.Countries;

import com.Tunes_Developers.Core.Base;

import java.util.Random;

/**
 * Created by Geoffrey-Kimani on 10/1/2017.
 */
public class Country {
    Random random = new Random();
    Base base = new Base();

    //Domains
    private String [] freeDomain = {};
    private String [] domains = {};
    private String [] safeDomain = {
            "example.net","example.org","example.com"
    };
    //Names
    private String [] firstNameMale = {};
    private String [] firstNameFemale = {};
    private String [] lastNameMale = {};
    private String [] lastNameFemale = {};
    //Phone Numbers
    private String [] phoneFormats = {};
    //Regions
    private String [] county = {};
    private String [] city = {};

    private int freeDomainLength,domainsLength,firstNameMaleLength,firstNameFemaleLength,lastNameMaleLength,
            lastNameFemaleLength,phoneFormatsLength,countyLength,cityLength,safeDomainLength = 3;

    public Country() {

    }

    protected void setDetails(String[] freeDomain, String[] domains, String[] firstNameMale, String[] firstNameFemale,
                              String[] lastNameMale, String[] lastNameFemale, String[] phoneFormats,String[] county, String[] city) {

        this.freeDomain = freeDomain;
        this.domains = domains;
        this.firstNameMale = firstNameMale;
        this.firstNameFemale = firstNameFemale;
        this.lastNameMale = lastNameMale;
        this.lastNameFemale = lastNameFemale;
        this.phoneFormats = phoneFormats;
        this.county = county;
        this.city = city;

        freeDomainLength = freeDomain.length;
        domainsLength = domains.length;
        firstNameMaleLength = firstNameMale.length;
        firstNameFemaleLength = firstNameFemale.length;
        lastNameMaleLength= lastNameMale.length;
        lastNameFemaleLength = lastNameFemale.length;
        phoneFormatsLength = phoneFormats.length;
        countyLength = county.length;
        cityLength = city.length;
    }

    //Domains
    public String getFreeDomain() {
        return freeDomain[random.nextInt(freeDomainLength)];
    }

    public String getDomain() {
        return domains[random.nextInt(domainsLength)];
    }

    public String getSafeDomain() {
       return safeDomain[random.nextInt(safeDomainLength)];
    }

    //Names
    public String getFirstNameMale() {
        return firstNameMale[random.nextInt(firstNameMaleLength)];
    }

    public String getLastNameMale() {
        return lastNameMale[random.nextInt(lastNameMaleLength)];
    }

    public String getFirstNameFemale() {
        return firstNameFemale[random.nextInt(firstNameFemaleLength)];
    }

    public String getLastNameFemale() {
        return lastNameFemale[random.nextInt(lastNameFemaleLength)];
    }

    //Phone Numbers
    public String getPhoneNumber() {
        return base.replaceWildcardNumerify(phoneFormats[random.nextInt(phoneFormatsLength)]);
    }

    //Region
    public String getCity() {
        return city[random.nextInt(cityLength)];
    }

    public String getCounty() {
        return county[random.nextInt(countyLength)];
    }
}
