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

Import com.Tunes_Developers.Faker to access faker library classes and methods.Use a faker object to create and
initialize the faker library. In the object specify the language and the country. If not specified the default
language will be English and the default country will be Kenya. Use of Upper case letters will nor affect the
operation of the library provided that the country and language is supported. Above is a list of languages and
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

Above is a simple call to create a random name. Each call to `faker.name()` yields a different random name. The
faker library is designed to simulate real world scenarios.

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