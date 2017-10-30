# Faker
Faker is a Java library that generates fake data for you. Whether you need to bootstrap your database, create
good-looking XML documents, fill-in your persistence to stress test it, or anonymize data taken from a production
service, Faker is for you.

Faker is heavily inspired by Fzaninotto's faker library in php.

# Table of Contents

- [Installation]
- [Supported Languages]
- [Supported Countries]
- [Basic Usage]
- [Formatters]
	- [Base]
	- [Lorem Ipsum Text]
	- [Person]
	- [Address]
	- [Phone Number]
	- [Company]
	- [Real Text]
	- [Date and Time]
	- [Internet]
	- [User Agent]
	- [Payment]
	- [Color]
	- [Barcode]

## Supported Languages
- [Arabic]
- [Chinese]
- [English]
- [French]
- [German]
- [Greek]
- [Italian]
- [Japanese]
- [Korean]
- [Russian]
- [Spanish]

## Supported Countries
- [China]
- [France]
- [Germany]
- [Great Britain]
- [Greece]
- [India]
- [Italy]
- [Japan]
- [Jordan]
- [Kenya]
- [New Zeland]
- [Russia]
- [South Korea]
- [Spain]
- [USA / United States]

## Basic Usage

Import com.Tunes_Developers.Faker to access faker library classes and methods.Use a faker object to create and initialize the faker library. In the object specify the language and the country. If not specified the default
language will be English and the default country will be Kenya. Use of Upper case letters will nor affect the operation of the library provided that the country and language is supported. Above is a list of languages and
countries supported.

```java
import com.Tunes_Developers.Faker;

public class TestFaker {
    public static void main(String[] args) {
        //Initialize an object of the faker class to access the methods
        Faker faker = new Faker("English","Kenya");

        System.out.println(faker.name());
    }
}
```


Above is a simple call to create a random name. Each call to `faker.name()` yields a different random name. The faker library is designed to simulate real world scenarios.

```java
import com.Tunes_Developers.Faker;

public class TestFaker {
    public static void main(String[] args) {
        //Initialize an object of the faker class to access the methods
        Faker faker = new Faker("English","Kenya");

        for (int i=0;i<10;i++){
            System.out.println(faker.name());
        }

        // Douglas Murigo
        // Ellen Kanyi Makinia
        // Benjamin Odek
        // Thomas Opolo Mungai
        // Esta Muringo
        // Emanuel Nyamu Ndiege
        // Cecil Wambua Nekoye
        // Carolyne Nia
        // Fatima WaMbeere Wangui
        // Hope Wambui
    }
}
```

### `Faker\Core\Base`
The Base class provides a number of usefull functionality like generating random numbers, ascii characters or even alphabetic characters with a specified format. Assuming you need to create random admision numbers with this format "J17-5380-2014"

```java
    import com.Tunes_Developers.Faker;

    public class TestFaker {
        public static void main(String[] args) {
            Faker faker = new Faker();

            for(int i=0;i<10;i++) {
                System.out.println(
                    faker.numerify("J##-####-201#","J29-9999-2017")
                );
            }
        }

        // J07-6940-2012
        // J28-4540-2014
        // J14-8626-2016
        // J26-8863-2013
        // J03-5004-2010
        // J17-6295-2014
        // J20-8281-2014
        // J14-3870-2013
        // J09-4835-2010
        // J25-3439-2015
    }
```

The `faker.numerfy(String format,String constrain)` method has been used to simulate admision numbers with a specific format. The `#` is used in places where you wish to replace with a random digit. The constrain parameter is used to define the maximum admission number that can be generated. Here are some more functionalities of the base class.

```
    randomDigit()                                 // 3
    digitBetween(5,9)                             // 5
    randomLetter()                                // v
    numerify("Hello ####")                        // Hello 4424
    numerifyNoZeros("Hello ####")                 // Hello 8755
    numerify("Hello ####","Hello 2222")           // Hello 0200
    numerifyNoZeros("Hello ####","Hello 2222")    // Hello 2111
    lexify("Letters: ?????")                      //Letters: jtsvw
    bothify("Random: ?????##")                    //Random: eweow28
    ascify("Password: *****")                     //Password: @5Gyx
```