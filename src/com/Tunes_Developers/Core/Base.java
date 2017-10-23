package com.Tunes_Developers.Core;

import com.Tunes_Developers.FakerException.ArgumentMismatchException;
import com.Tunes_Developers.FakerException.UnexpectedConstrainParameterException;

import java.util.Random;


/**
 * Created by Geoffrey-Kimani on 3/10/2017.
 */
public class Base {
    Random ran = new Random();

    public int randomDigit() {
        return ran.nextInt(10);
    }

    public char digitBetween(int min, int max) {
       char [] digits = {'0','1','2','3','4','5','6','7','8','9'};

       int choice = ran.nextInt(max+1);

        if (choice < min) {
            choice = min;
        }

        if (choice > 0) {
            return digits[choice];
        }else{
            return '0';
        }
    }

    public String replaceWildcardNumerifyConstrain(String data, String constarin) {
        String returnData = "";
        if (data.length() == constarin.length()) {
            char [] _data = data.toCharArray();
            char [] _constrain = constarin.toCharArray();
            char[] numbers = {
                    '0','1','2','3','4','5','6','7','8','9'
            };

            for (int i = 0; i < _data.length; i++) {
                if (_data[i] == '#') {
                    try {
                        int bound = Integer.parseInt(_constrain[i] + "")+1;

                        if (bound <= 0) {
                            _data[i] = numbers[0];
                        }else{
                            _data[i] = numbers[ran.nextInt(bound)];
                        }
                    } catch (NumberFormatException ex) {
                        try {
                            throw new UnexpectedConstrainParameterException(_constrain[i]);
                        } catch (UnexpectedConstrainParameterException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            returnData = convertToString(_data);
        } else {
            try {
                throw new ArgumentMismatchException();
            } catch (ArgumentMismatchException e) {
                e.printStackTrace();
            }
        }
        return returnData;
    }

    public String replaceWildcardNumerifyConstrainNoZeros(String data, String constarin) {
        String returnData = "";
        if (data.length() == constarin.length()) {
            char [] _data = data.toCharArray();
            char [] _constrain = constarin.toCharArray();
            char[] numbers = {
                    '1','2','3','4','5','6','7','8','9'
            };

            for (int i = 0; i < _data.length; i++) {
                if (_data[i] == '#') {
                    try {
                        int bound = Integer.parseInt(_constrain[i] + "");

                        if (bound <= 0) {
                            _data[i] = numbers[0];
                        }else{
                            _data[i] = numbers[ran.nextInt(bound)];
                        }
                    } catch (NumberFormatException ex) {
                        try {
                            throw new UnexpectedConstrainParameterException(_constrain[i]);
                        } catch (UnexpectedConstrainParameterException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            returnData = convertToString(_data);
        } else {
            try {
                throw new ArgumentMismatchException();
            } catch (ArgumentMismatchException e) {
                e.printStackTrace();
            }
        }
        return returnData;
    }

    public String replaceWildcardNumerify(String data) {
        char [] _data = data.toCharArray();
        char[] numbers = {
                '0','1','2','3','4','5','6','7','8','9'
        };

        for (int i = 0; i < _data.length; i++) {
            if (_data[i] == '#') {
                _data[i] = numbers[ran.nextInt(9)];
            }
        }

        return convertToString(_data);
    }

    public String replaceWildcardNumerifyNoZero(String data) {
        char [] _data = data.toCharArray();
        char[] numbers = {
                '0','1','2','3','4','5','6','7','8','9'
        };

        for (int i = 0; i < _data.length; i++) {
            if (_data[i] == '#') {
                _data[i] = numbers[ran.nextInt(9)];
            }

            if (i == _data.length) {
                _data[i] = digitBetween(1,9);
            }
        }

        return convertToString(_data);
    }

    public String replaceWildcardNumerifyNoZeros(String data) {
        char [] _data = data.toCharArray();
        char[] numbers = {
                '1','2','3','4','5','6','7','8','9'
        };

        for (int i = 0; i < _data.length; i++) {
            if (_data[i] == '#') {
                _data[i] = numbers[ran.nextInt(8)];
            }
        }

        return convertToString(_data);
    }

    public String generateRandom(String max) {
        String data = "";
        char[] _max = max.toCharArray();
        boolean less = false;

        for (int i = 0; i < _max.length; i++) {
            int num = Integer.parseInt(_max[i]+""),
                    ranNum = ran.nextInt(num+1);

            if (num < ranNum) {
                less = true;
            }

            if (i == _max.length - 1 && less==false && num >= ranNum) {
                if (ranNum != 0) {
                    ranNum-=1;
                }
            }
            data+=ranNum+"";
        }
        return data;
    }

    public String replaceWildcardLexify(String data) {
        char [] _data = data.toCharArray();
        char[] alphabets = {
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
        };

        for (int i = 0; i < _data.length; i++) {
            if (_data[i] == '?') {
                _data[i] = alphabets[ran.nextInt(25)];
            }
        }

        return convertToString(_data);
    }

    public char randomLetter() {
        char[] alphabets = {
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
        };

        return alphabets[ran.nextInt(25)];
    }

    public String replaceWildcardAsciify(String data) {
        char [] _data = data.toCharArray();
        char[] alphabets = {
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
                'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                '0','1','2','3','4','5','6','7','8','9',
                '+','-','*','&','^','$','!','@','<','>','#','%','(',')','|'
        };

        for (int i = 0; i < _data.length; i++) {
            if (_data[i] == '*') {
                _data[i] = alphabets[ran.nextInt(77)];
            }
        }

        return convertToString(_data);
    }

    public String replaceWildcardBothify(String data) {
        char [] _data = data.toCharArray();
        char[] numbers = {
                '0','1','2','3','4','5','6','7','8','9'
        };
        char[] alphabets = {
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
        };

        for (int i = 0; i < _data.length; i++) {
            if (_data[i] == '#') {
                _data[i] = numbers[ran.nextInt(9)];
            }
            if (_data[i] == '?') {
                _data[i] = alphabets[ran.nextInt(25)];
            }
        }

        return convertToString(_data);
    }

    public String convert(String format,int Number) {
        char [] number_raw = Integer.toString(Number).toCharArray();
        char [] format_c = trimJunk(format.toCharArray(),number_raw);
        char [] number_c = new char[format_c.length];

        int j = number_raw.length-1;
        int k = 0;
        for (int i =format_c.length-1;i>-1;i--) {
            if (format_c[i] == '#') {
                number_c[k] = number_raw[j];
                j--;
            } else {
                if (i == 0 && format_c[0] == ',') {

                } else {
                    number_c[k] = format_c[i];
                }
            }
            k++;
        }
        return convertToString(reverseArray(number_c));
    }

    public String convert(String format,String Number) {
        char [] number_raw = Number.toCharArray();
        char [] format_c = trimJunk(format.toCharArray(),number_raw);
        char [] number_c = new char[format_c.length];

        int j = number_raw.length-1;
        int k = 0;
        for (int i =format_c.length-1;i>-1;i--) {
            if (format_c[i] == '#') {
                number_c[k] = number_raw[j];
                j--;
            } else {
                if (i == 0 && format_c[0] == ',') {

                } else {
                    number_c[k] = format_c[i];
                }
            }
            k++;
        }
        return convertToString(reverseArray(number_c));
    }

    public String convert(String prefix,String format,String Number) {
        char [] number_raw = Number.toCharArray();
        char [] format_c = trimJunkAll(format.toCharArray(),number_raw);
        char [] number_c = new char[format_c.length];

        int j = number_raw.length-1;
        int k = 0;
        for (int i =format_c.length-1;i>-1;i--) {
            if (format_c[i] == '#') {
                number_c[k] = number_raw[j];
                j--;
            } else {
                if (i == 0 && format_c[0] == ',') {

                } else {
                    number_c[k] = format_c[i];
                }
            }
            k++;
        }
        return prefix+convertToString(reverseArray(number_c));
    }

    public String convert(String prefix,String format,int Number) {
        char [] number_raw = Integer.toString(Number).toCharArray();
        char [] format_c = trimJunkAll(format.toCharArray(),number_raw);
        char [] number_c = new char[format_c.length];

        int j = number_raw.length-1;
        int k = 0;
        for (int i =format_c.length-1;i>-1;i--) {
            if (format_c[i] == '#') {
                number_c[k] = number_raw[j];
                j--;
            } else {
                if (i == 0 && format_c[0] == ',') {

                } else {
                    number_c[k] = format_c[i];
                }
            }
            k++;
        }
        return prefix+convertToString(reverseArray(number_c));
    }

    public String convert(String format, double Number) {
        char [] number_raw = Double.toString(Number).toCharArray();
        char [] format_c = trimJunkDouble(format.toCharArray(),number_raw);
        char [] number_c = new char[format_c.length];

//        int j = number_raw.length-1;
//        int k = 0;
//        for (int i =format_c.length-1;i>-1;i--) {
//            if (format_c[i] == '#') {
//                number_c[k] = number_raw[j];
//                j--;
//            } else {
//                if (i == 0 && format_c[0] == ',') {
//
//                } else {
//                    number_c[k] = format_c[i];
//                }
//            }
//            k++;
//        }
        return convertToString(reverseArray(number_c));
    }
    public char[] reverseArray(char[] array) {
        char [] ReversedArray;
        String ReversedArray_s = "";

        for (int i = array.length-1; i > -1 ; i--) {
            ReversedArray_s+=array[i];
        }
        ReversedArray = ReversedArray_s.toCharArray();
        return ReversedArray;
    }

    public String convertToString(char[] array) {
        String data = "";

        for (int i=0;i<array.length;i++) {
            if (array[i] != '`') {
                data += array[i];
            }
        }

        return data;
    }

    private char[] trimJunk(char[] format,char[] number) {
        int count = 0,length_f=format.length,length_n=number.length,position =0;
        int TrimCount = 0;


        for (int i=length_f-1;i>-1;i--) {
            if (format[i] == '#') {
                count++;
            }
            if (count == length_n) {
                position = i;
                break;
            }
        }

        for (int i = 0; i < position; i++) {
            if (format[i] == '#' || format[i] == ',' || format[i] == ',') {
                format[i] = '`';
            }
        }
        return format;
    }

    private char[] trimJunkAll(char[] format,char[] number) {
        int count = 0,length_f=format.length,length_n=number.length,position =0;
        int TrimCount = 0;


        for (int i=length_f-1;i>-1;i--) {
            if (format[i] == '#') {
                count++;
            }
            if (count == length_n) {
                position = i;
                break;
            }
        }

        for (int i = 0; i < position; i++) {
            format[i] = '`';
        }
        return format;
    }
    private char[] trimJunkDouble(char[] format,char[] number) {
        int count = 0,length_f=format.length-1,length_n=number.length-1,position =0;
        int TrimBeforeCount = 0, TrimAfterCount = 0, BeforeNum = 0, AfterNum = 0,DecimalCountFormat = 0,DecimalCountNumber = 0;

        for (int i = length_f; i > -1; i--) {
            if (format[i] == '.') {
                DecimalCountFormat = i;
                break;
            }
        }
        for (int i = length_n; i > -1; i--) {
            if (number[i] == '.') {
                DecimalCountNumber = i;
                break;
            }
        }

        for (int i = 0; i > DecimalCountFormat; i++) {
            if (format[i] == '#') {
                TrimBeforeCount++;
            }
        }

        for (int i = length_f; i > DecimalCountFormat; i--) {
            if (format[i] == '#') {
                TrimAfterCount++;
            }
        }

        for (int i = 0; i > DecimalCountNumber; i++) {
            BeforeNum++;
        }

        for (int i = length_f; i > DecimalCountNumber; i--) {
            AfterNum++;
        }

        if (TrimBeforeCount > BeforeNum) {
            int Position = TrimBeforeCount-BeforeNum;
            for (int i = 0; i > DecimalCountFormat; i++) {
                if (Position == position) {
                    break;
                }
                format[i] = '`';
                if (format[i] == '#') {
                    position++;
                }
            }
        }

        if (TrimAfterCount > AfterNum) {
            int Position = TrimAfterCount-AfterNum;
            position = 0;
            for (int i = length_f; i > DecimalCountFormat; i--) {
                if (Position == position) {
                    break;
                }
                format[i] = '`';
                if (format[i] == '#') {
                    position++;
                }
            }
        }
        System.out.println(convertToString(format));
        System.out.println(TrimBeforeCount+" "+BeforeNum+" "+TrimAfterCount+" "+AfterNum+" "+DecimalCountFormat+" "+DecimalCountNumber);
        return format;
    }

    private char[] trimJunkDoubleAll(char[] format,char[] number) {
        int count = 0,length_f=format.length,length_n=number.length,position =0;
        int TrimCount = 0;


        for (int i=length_f-1;i>-1;i--) {
            if (format[i] == '#') {
                count++;
            }
            if (count == length_n) {
                position = i;
                break;
            }
        }

        for (int i = 0; i < position; i++) {
            format[i] = '`';
        }
        return format;
    }
}
