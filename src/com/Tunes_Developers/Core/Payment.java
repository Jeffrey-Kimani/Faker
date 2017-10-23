package com.Tunes_Developers.Core;

import java.util.Calendar;
import java.util.Random;

/**
 * Created by Geoffrey-Kimani on 10/5/2017.
 */
public class Payment {
    private String [] visa = {
            "4539########",
            "4539###########",
            "4556########",
            "4556###########",
            "4916########",
            "4916###########",
            "4532########",
            "4532###########",
            "4929########",
            "4929###########",
            "40240071####",
            "40240071#######",
            "4485########",
            "4485###########",
            "4716########",
            "4716###########",
            "4###########",
            "4##############"
    };

    private String [] masterCard = {
            "2221###########",
            "23#############",
            "24#############",
            "25#############",
            "26#############",
            "2720###########",
            "51#############",
            "52#############",
            "53#############",
            "54#############",
            "55#############"
    };

    private String [] americanExpress = {
            "34############",
            "37############"
    };

    private String [] discoverCard = {
            "6011###########"
    };

    private String [] creditCardType = {
            "Visa","Master Card","American Express", "Discover Card"
    };

    int visaLength=18,masterCardLength=11, americanExpressLength = 2,discoverCardLength = 1,creditCardTypeLength=4;
    Random random = new Random();
    Base base = new Base();
    Calendar calendar = Calendar.getInstance();
    Person person;
    int creditCardTypeNo = 1;

    public Payment(Person person) {
        this.person = person;
    }

    public String getCreditCardType() {
        creditCardTypeNo = random.nextInt(creditCardTypeLength);
        return creditCardType[creditCardTypeNo];
    }

    public String getCreditCardNumber() {
        int choice = random.nextInt(4);

        switch (choice) {
            case 0:
                return base.replaceWildcardNumerify(visa[random.nextInt(visaLength)]);
            case 1:
                return base.replaceWildcardNumerify(masterCard[random.nextInt(masterCardLength)]);
            case 2:
                return base.replaceWildcardNumerify(americanExpress[random.nextInt(americanExpressLength)]);
            default:
                return base.replaceWildcardNumerify(discoverCard[0]);
        }
    }

    public String getCreditCardNumberResource() {
        int choice = random.nextInt(4);

        switch (creditCardTypeNo) {
            case 0:
                return base.replaceWildcardNumerify(visa[random.nextInt(visaLength)]);
            case 1:
                return base.replaceWildcardNumerify(masterCard[random.nextInt(masterCardLength)]);
            case 2:
                return base.replaceWildcardNumerify(americanExpress[random.nextInt(americanExpressLength)]);
            default:
                return base.replaceWildcardNumerify(discoverCard[0]);
        }
    }

    public String getCreditCardExpiration() {

       return base.replaceWildcardNumerifyConstrain("#","1")+base.digitBetween(1,2)+"/"+
               (calendar.get(Calendar.YEAR)-(2000-random.nextInt(2)))+"";
    }

    public String [] getCreditCardDetails() {
       int choice = random.nextInt();
       String [] details = new String[4];

        switch (choice) {
            case 0:
                details[0] = "Visa";
                details[1] = visa[random.nextInt(visaLength)];
                details[2] = person.getName();
                details[3] = getCreditCardExpiration();
                return details;
            case 1:
                details[0] = "Master Card";
                details[1] = masterCard[random.nextInt(masterCardLength)];
                details[2] = person.getName();
                details[3] = getCreditCardExpiration();
                return details;
            case 2:
                details[0] = "American Express";
                details[1] = americanExpress[random.nextInt(americanExpressLength)];
                details[2] = person.getName();
                details[3] = getCreditCardExpiration();
                return details;
            default:
                details[0] = "Discover Card";
                details[1] =  discoverCard[0];
                details[2] = person.getName();
                details[3] = getCreditCardExpiration();
                return details;
        }
    }
}
