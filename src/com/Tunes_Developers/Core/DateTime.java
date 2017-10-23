package com.Tunes_Developers.Core;

import java.util.Calendar;
import java.util.Random;

/**
 * Created by Geoffrey-Kimani on 10/5/2017.
 */
public class DateTime {
    Random random = new Random();
    Base base = new Base();

    private String[] century = {
            "I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX","XXI"
    };

    private String[] days = {
            "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
    };

    private String[] daysShort = {
            "Mon","Tue","Wed","Thu","Fri","Sat","Sun"
    };

    private String[] months = {
            "January","February","March","April","May","June","July","August","September","October","November","December"
    };

    private String[] monthsShort = {
            "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"
    };

    int centuryLength = century.length,daysLength = 7, monthsLength = 12;
    Calendar calendar = Calendar.getInstance();

    public String getCentury() {
       return century[random.nextInt(centuryLength)];
    }

    public String getMonthName() {
        return months[random.nextInt(monthsLength)];
    }

    public String getMonthNameShort() {
        return monthsShort[random.nextInt(monthsLength)];
    }

    public String getDayOfWeek() {
        return days[random.nextInt(daysLength)];
    }

    public String getDayOfWeekShort() {
        return daysShort[random.nextInt(daysLength)];
    }

    public String getDateTime() {
        String year = base.replaceWildcardNumerifyConstrain("20##","20"+(calendar.get(Calendar.YEAR)-2000)+"");
        String month = base.replaceWildcardNumerifyConstrain("#","1")+base.digitBetween(1,2);
        String date = base.replaceWildcardNumerifyConstrain("#","2")+base.digitBetween(1,8);

        return year+"-"+month+"-"+date+" "+
                base.replaceWildcardNumerifyConstrain("##","23")+":"+
                base.replaceWildcardNumerifyConstrain("##","59")+":"+
                base.replaceWildcardNumerifyConstrain("##","59");
    }

    public String getDateTimeNow() {
        return calendar.get(Calendar.YEAR)+"-"+convertIntToCorrectString(calendar.get(Calendar.MONTH)+1)+"-"+convertIntToCorrectString(calendar.get(Calendar.DATE))+" "+
                calendar.get(Calendar.HOUR)+":"+convertIntToCorrectString(calendar.get(Calendar.MINUTE)+1)+":"+convertIntToCorrectString(calendar.get(Calendar.SECOND));
    }

    public String getDateNow() {
        return calendar.get(Calendar.YEAR)+"-"+convertIntToCorrectString(calendar.get(Calendar.MONTH)+1)+"-"+convertIntToCorrectString(calendar.get(Calendar.DATE));
    }

    public String getDate() {
        String year = base.replaceWildcardNumerifyConstrain("20##","20"+(calendar.get(Calendar.YEAR)-2000)+"");
        String month = base.replaceWildcardNumerifyConstrain("#","1")+base.digitBetween(0,2)+"";
        String date = base.replaceWildcardNumerifyConstrain("#","2")+base.digitBetween(0,8)+"";

        return year+"-"+month+"-"+date;
    }

    public String getDateOld() {
        String year = "1"+base.replaceWildcardNumerify("##")+base.digitBetween(1,9);
        String month = base.replaceWildcardNumerifyConstrain("#","1")+base.digitBetween(1,2);
        String date = base.replaceWildcardNumerifyConstrain("#","2")+base.digitBetween(1,8);

        return year+"-"+month+"-"+date;
    }

    public String getTime() {
        return base.replaceWildcardNumerifyConstrain("##","23")+":"+
                base.replaceWildcardNumerifyConstrain("##","59")+":"+
                base.replaceWildcardNumerifyConstrain("##","59");
    }

    public String getTimeNow() {
        return calendar.get(Calendar.HOUR)+":"+convertIntToCorrectString(calendar.get(Calendar.MINUTE)+1)+":"+convertIntToCorrectString(calendar.get(Calendar.SECOND));
    }

    public String getDateTimeThisYear() {
        String year = calendar.get(Calendar.YEAR)+"";
        String month = base.replaceWildcardNumerifyConstrain("#","1")+base.digitBetween(1,2);
        String date = base.replaceWildcardNumerifyConstrain("#","2")+base.digitBetween(1,8);

        return year+"-"+month+"-"+date+" "+
                base.replaceWildcardNumerifyConstrain("##","23")+":"+
                base.replaceWildcardNumerifyConstrain("##","59")+":"+
                base.replaceWildcardNumerifyConstrain("##","59");
    }

    public String getDateTimeOld() {
        String year = "1"+base.replaceWildcardNumerify("##")+base.digitBetween(1,9);
        String month = base.replaceWildcardNumerifyConstrain("#","1")+base.digitBetween(1,2);
        String date = base.replaceWildcardNumerifyConstrain("#","2")+base.digitBetween(1,8);

        return year+"-"+month+"-"+date+" "+
                base.replaceWildcardNumerifyConstrain("##","23")+":"+
                base.replaceWildcardNumerifyConstrain("##","59")+":"+
                base.replaceWildcardNumerifyConstrain("##","59");
    }

    public String getYear() {
        return "1"+base.replaceWildcardNumerify("##")+base.digitBetween(1,9);
    }

    public String getMonth() {
       return base.replaceWildcardNumerifyConstrain("#","1")+base.digitBetween(1,2);
    }

    public String getDateOfMonth() {
            return base.replaceWildcardNumerifyConstrain("#","2")+base.digitBetween(1,8);
    }

    private String convertIntToCorrectString(int number) {
        if (number < 10) {
            return "0" + number;
        } else {
            return number+"";
        }
    }
}
