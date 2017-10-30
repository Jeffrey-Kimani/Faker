package com.Tunes_Developers;

/**
 * Created by Geoffrey-Kimani on 10/30/2017.
 */
public class TestFaker {
    public static void main(String[] args) {
        Faker faker = new Faker();

        System.out.println(faker.randomDigit());
        System.out.println(faker.digitBetween(5,9));
        System.out.println(faker.randomLetter());
        System.out.println(faker.numerify("Hello ####"));
        System.out.println(faker.numerifyNoZeros("Hello ####"));
        System.out.println(faker.numerify("Hello ####","Hello 2222"));
        System.out.println(faker.numerifyNoZeros("Hello ####","Hello 2222"));
        System.out.println(faker.lexify("Letters: ?????"));
        System.out.println(faker.bothify("Random: ?????##"));
        System.out.println(faker.ascify("Password: *****"));

        //Lorem
        System.out.println(faker.word());
        System.out.println(faker.sentence());
        System.out.println(faker.sentence(8));
        System.out.println(faker.paragraph());
        System.out.println(faker.paragraph(5,4));
        System.out.println(faker.paragraphs());
        System.out.println(faker.paragraphs(5,4,2));

        //Person
        System.out.println(faker.title());
        System.out.println(faker.titleMale());
        System.out.println(faker.titleFemale());
        System.out.println(faker.oneName());
        System.out.println(faker.name());
        System.out.println(faker.nameMale());
        System.out.println(faker.nameFemale());

        //City
        System.out.println(faker.city());
        System.out.println(faker.county());
        System.out.println(faker.country());
        System.out.println(faker.postCode());
        System.out.println(faker.longitude());
        System.out.println(faker.latitude());
        System.out.println(faker.phoneNumber());

        //Text
        System.out.println(faker.text());
        System.out.println(faker.text(2,4));

        //DateTime
        System.out.println(faker.date());
        System.out.println(faker.dateNow());
        System.out.println(faker.dateTime());
        System.out.println(faker.dateTimeNow());
        System.out.println(faker.time());
        System.out.println(faker.timeNow());
        System.out.println(faker.dateOld());
        System.out.println(faker.dateTimeOld());
        System.out.println(faker.month());
        System.out.println(faker.year());
        System.out.println(faker.dateOfMonth());
        System.out.println(faker.monthName());
        System.out.println(faker.monthNameShort());
        System.out.println(faker.dayOfWeek());
        System.out.println(faker.dayOfWeekShort());
        System.out.println(faker.dateTimeThisYear());

        //Internet
        System.out.println(faker.email());
        System.out.println(faker.safeEmail());
        System.out.println(faker.freeEmail());
        System.out.println(faker.emailResource());
        System.out.println(faker.safeEmailResource());
        System.out.println(faker.freeEmailResource());
        System.out.println(faker.ipv4());
        System.out.println(faker.localIpv4());
        System.out.println(faker.ipv6());
        System.out.println(faker.macAddress());
        System.out.println(faker.url());
        System.out.println(faker.domainName());
        System.out.println(faker.slug());
        System.out.println(faker.password());
        System.out.println(faker.username());
        System.out.println(faker.usernameResource());
        System.out.println(faker.tid());

        //Payment
        System.out.println(faker.creditCardType());
        System.out.println(faker.creditCardNumber());
        System.out.println(faker.creditCardExpirationDate());

        //Color
        System.out.println(faker.hexColor());
        System.out.println(faker.rgbColor());
        System.out.println(faker.rgbCssColor());
        System.out.println(faker.colorName());
        System.out.println(faker.safeColorName());

        //Barcode
        System.out.println(faker.ean13());
        System.out.println(faker.ean8());
        System.out.println(faker.isbn10());
        System.out.println(faker.isbn13());

        //Miscellaneous
        System.out.println(faker.bool());
        System.out.println(faker.md5());
        System.out.println(faker.sha1());
        System.out.println(faker.sha256());
        System.out.println(faker.locale());
        System.out.println(faker.countryCode());
        System.out.println(faker.countryCodeIsoAlpha3());
        System.out.println(faker.languageCode());
        System.out.println(faker.currencyCode());
    }
}
