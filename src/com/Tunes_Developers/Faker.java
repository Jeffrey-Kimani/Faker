package com.Tunes_Developers;

import com.Tunes_Developers.Core.*;
import com.Tunes_Developers.Countries.Country;
import com.Tunes_Developers.Countries.Kenya;
import com.Tunes_Developers.Lang.English;
import com.Tunes_Developers.Lang.Language;

import java.util.Random;

/**
 * Created by Geoffrey-Kimani on 10/5/2017.
 */
public class Faker {
    private Address address;
    private Person person;
    private Country country;
    private Language language;
    private Internet internet;
    private Payment payment;

    private Random random = new Random();
    private Base base = new Base();
    private Lorem lorem = new Lorem();
    private Miscellaneous miscellaneous = new Miscellaneous();
    private Color color = new Color();
    private Barcode barcode = new Barcode();
    private DateTime dateTime = new DateTime();

    String firstName=null, lastName = null;

    public Faker() {
        this.country = new Kenya();
        this.language = new English();

        person = new Person();
        internet = new Internet();
        address = new Address();
        payment = new Payment(person);
    }

    public Faker(String language, String country) {
        this.country = Decode.getCountry(country);
        this.language = Decode.getLanguage(language);

        person = new Person(country,language);
        internet = new Internet(country,language);
        address = new Address(country,language);
        payment = new Payment(person);
    }



    /*******************************************************************************************
     ******************************************Base***********************************************
     ********************************************************************************************/

    public String randomDigit() {
       return base.randomDigit()+"";
    }

    public String digitBetween(int min,int max) {
        return base.digitBetween(min,max)+"";
    }

    public String randomLetter() {
        return base.randomLetter()+"";
    }

    public String numerify(String format) {
        return base.replaceWildcardNumerify(format);
    }

    public String numerifyNoZeros(String format) {
        return base.replaceWildcardNumerifyNoZeros(format);
    }

    public String numerifyAboveZero(String format) {
        return base.replaceWildcardNumerifyNoZero(format);
    }

    public String numerify(String format,String constrain) {
        return base.replaceWildcardNumerifyConstrain(format,constrain);
    }

    public String numerifyNoZeros(String format,String constrain) {
        return base.replaceWildcardNumerifyConstrainNoZeros(format,constrain);
    }

    public String lexify(String format) {
        return base.replaceWildcardLexify(format);
    }

    public String bothify(String format) {
        return base.replaceWildcardBothify(format);
    }

    public String ascify(String format) {
        return base.replaceWildcardAsciify(format);
    }



    /*******************************************************************************************
    ******************************************Lorem*********************************************
    ********************************************************************************************/
    public String word() {
        return lorem.getWord();
    }

    public String[] words(int nbWords) {
        return lorem.getWords(nbWords);
    }

    public String sentence() {
        return lorem.getSentence();
    }

    public String sentence(int nbWords) {
        return lorem.getSentence(nbWords);
    }

    public String[] sentences(int nbWords,int nbSentences) {
        return lorem.getSentences(nbWords,nbSentences);
    }

    public String paragraph(int nbWords,int nbSentences) {
        return lorem.getParagraph(nbWords,nbSentences);
    }

    public String paragraph() {
        return lorem.getRandomParagraph();
    }

    public String paragraphs() {
        return lorem.getRandomParagraphs();
    }

    public String paragraphs(int nbWords, int nbSentences, int nbParagraphs) {
        return lorem.getParagraphs(nbWords,nbSentences,nbParagraphs);
    }



    /*******************************************************************************************
     ******************************************Person********************************************
     ********************************************************************************************/
    public String title() {
        return person.getTitle();
    }

    public String titleMale() {
        return language.getTitleMale();
    }

    public String titleFemale() {
        return language.getTitleFemale();
    }

    public String oneName() {
        String name = person.getOneName();
        firstName = person.getFirstName();
        lastName = person.getLastName();
        return name;
    }

    public String name() {
        String name = person.getName();
        firstName = person.getFirstName();
        lastName = person.getLastName();
        return name;
    }

    public String nameMale() {
        String name = person.getNameMale();
        firstName = person.getFirstName();
        lastName = person.getLastName();
        return name;
    }

    public String nameFemale() {
        String name = person.getNameFemale();
        firstName = person.getFirstName();
        lastName = person.getLastName();
        return name;
    }



    /*******************************************************************************************
     ******************************************Address******************************************
     ********************************************************************************************/
    public String city() {
        return address.getCity();
    }

    public String county() {
        return address.getCounty();
    }

    public String country() {
        return address.getCountry();
    }

    public String postCode() {
        return address.getPostCode();
    }

    public String longitude() {
        return address.getLongitude();
    }

    public String latitude() {
        return address.getLatitude();
    }

    public String phoneNumber() {
        return country.getPhoneNumber();
    }


    /*******************************************************************************************
     ******************************************Text**********************************************
     ********************************************************************************************/
    public String text() {
        return language.getText();
    }

    public String text(int nbParagraphs, int nbSentences) {
        return language.getText(nbParagraphs,nbSentences);
    }



    /*******************************************************************************************
     ******************************************Date Time*****************************************
     ********************************************************************************************/

    public String date() {
       return dateTime.getDate();
    }

    public String dateNow() {
        return dateTime.getDateNow();
    }

    public String dateTime() {
        return dateTime.getDateTime();
    }

    public String dateTimeNow() {
        return dateTime.getDateTimeNow();
    }

    public String time() {
        return dateTime.getTime();
    }

    public String timeNow() {
        return dateTime.getTimeNow();
    }

    public String dateOld() {
        return dateTime.getDateOld();
    }

    public String dateTimeOld() {
        return dateTime.getDateTimeOld();
    }

    public String month() {
        return dateTime.getMonth();
    }

    public String year() {
        return dateTime.getYear();
    }

    public String dateOfMonth() {
        return dateTime.getDateOfMonth();
    }

    public String monthName() {
        return dateTime.getMonthName();
    }

    public String monthNameShort() {
        return dateTime.getMonthNameShort();
    }

    public String dayOfWeek() {
        return dateTime.getDayOfWeek();
    }

    public String dayOfWeekShort() {
        return dateTime.getDayOfWeekShort();
    }

    public String dateTimeThisYear() {
        return dateTime.getDateTimeThisYear();
    }



    /*******************************************************************************************
     ******************************************Internet******************************************
     ********************************************************************************************/
    public String email() {
        return internet.getEmail();
    }

    public String safeEmail() {
        return internet.getSafeEmail();
    }

    public String freeEmail() {
        return internet.getFreeEmail();
    }

    public String emailResource() {
        return internet.getEmailResource(firstName,lastName);
    }

    public String safeEmailResource() {
        return internet.getSafeEmailResource(firstName,lastName);
    }

    public String freeEmailResource() {
        return internet.getFreeEmailResource(firstName,lastName);
    }

    public String ipv4() {
        return internet.getIPV4();
    }

    public String localIpv4() {
        return internet.getlocalIPV4();
    }

    public String ipv6() {
        return internet.getIPV6();
    }

    public String macAddress() {
        return internet.getMacAddress();
    }

    public String url() {
        return internet.getUrl();
    }

    public String domainName() {
        return internet.getDomainName();
    }

    public String slug() {
        return internet.getSlug();
    }

    public String password() {
        return internet.getPassword();
    }

    public String username() {
        return person.getUserName();
    }

    public String usernameResource() {
        return person.getUserNameResource();
    }

    public String tid() {
        return internet.getTid();
    }



    /*******************************************************************************************
     ***************************************Payment*********************************************
     ********************************************************************************************/
    public String creditCardType() {
        return payment.getCreditCardType();
    }

    public String creditCardNumber() {
        return payment.getCreditCardNumber();
    }

    public String creditCardNumberResource() {
        return payment.getCreditCardNumberResource();
    }

    public String creditCardExpirationDate() {
        return payment.getCreditCardExpiration();
    }

    public String[] creditCardDetails() {
        return payment.getCreditCardDetails();
    }



    /*******************************************************************************************
     ****************************************Color***********************************************
     ********************************************************************************************/
    public String hexColor() {
        return color.getHexColor();
    }

    public String rgbColor() {
        return color.getRgbColor();
    }

    public String rgbCssColor() {
        return color.getRgbCssColor();
    }

    public String colorName() {
        return color.getColorName();
    }

    public String safeColorName() {
        return color.getSafeColorName();
    }


    /*******************************************************************************************
     ******************************************Barcode*******************************************
     ********************************************************************************************/
    public String ean13() {
        return barcode.getEan13();
    }

    public String ean8() {
        return barcode.getEan8();
    }

    public String isbn13() {
        return barcode.getIsbn13();
    }

    public String isbn10() {
        return barcode.getIsbn10();
    }


    /*******************************************************************************************
     *********************************Miscellaneous***********************************************
     ********************************************************************************************/
    public String bool() {
        int choice = random.nextInt(2);

        if (choice == 1) {
            return "true";
        } else {
            return "false";
        }
    }

    public String md5() {
        return miscellaneous.getMd5();
    }

    public String sha1() {
        return miscellaneous.getSha1();
    }

    public String sha256() {
        return miscellaneous.getSha256();
    }

    public String locale() {
        return miscellaneous.getLocale();
    }

    public String countryCode() {
        return miscellaneous.getCountryCode();
    }

    public String countryCodeIsoAlpha3() {
        return miscellaneous.getCountryCodeISOAlpha3();
    }

    public String languageCode() {
        return miscellaneous.getLanguageCode();
    }

    public String currencyCode() {
        return miscellaneous.getCurrencyCode();
    }
}