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
    lexify("Letters: ?????")                      // Letters: jtsvw
    bothify("Random: ?????##")                    // Random: eweow28
    ascify("Password: *****")                     // Password: @5Gyx
```

### `Faker\Core\Lorem`

```
    word()                                     // veniam

    sentence()                                 
    //reiciendis minus rerum earum aut explicabo.

    sentence(8)                                
    // eveniet expedita autem exercitationem saepe cum ut et.

    paragraph()                                
    //  Sint enim. Cupiditate rerum. Animi animi maxime quasi saepe sapiente similique.

    paragraph(5,4)                             
        //  Aliquam perspiciatis quia quibusdam ipsa. Et optio dolorem ab quo. Qui voluptatem ut provident alias. Architecto eum repudiandae commodi voluptatem.

    paragraphs()                               
        //  Ut modi ratione quae assumenda laborum voluptatem ea voluptates dolorum in pariatur. Asperiores odit.

         Dolores illum quidem dolore quia sit qui enim id est dolores aperiam tempora libero. Sit voluptatum voluptas corporis aut fuga neque. Corrupti assumenda illum libero dolor quia ad ex consequuntur in quia omnis fuga. Ut ut voluptas non. Perspiciatis fuga qui. Asperiores sed. Reiciendis accusantium distinctio reprehenderit eos quas repellat eum quia quos. Cumque facilis odio doloribus dignissimos sunt nobis quod tempora molestiae vel modi qui enim. Laudantium quis odit totam soluta.

         Omnis repudiandae optio sunt. Assumenda rem ipsum enim harum rerum dolores iure ullam vero porro aperiam doloribus cum. Facilis aut repellendus tempore voluptatum.

         Quasi deserunt eveniet eum dolor ipsam vel veritatis dolor quia. Earum a. Aut maxime ut id et incidunt maxime et corrupti minus ut veritatis. Quaerat molestiae voluptas quibusdam. Eius sunt. Et quo alias at sit at ut et non neque. Aperiam molestias sunt harum dolorem repellendus est iusto enim voluptas ut ea molestiae. Facilis voluptatum debitis aut numquam in qui voluptatum qui maxime necessitatibus.

         Ut asperiores delectus dolor doloribus doloremque quia sint repellendus eum molestias magnam qui eius. Eum ad.

    paragraphs(5,4,2)                           
        //  Optio dolorum nemo quo neque. Laudantium amet repellat veniam sequi. Aut ipsa qui ut nihil. Et neque qui modi asperiores.

        Accusantium quas qui vel voluptates. Eos nihil molestiae tempora dolorem. Harum odit ut ipsum laborum. Ut rerum at aut fuga.
```

### `Faker\Core\Person`

```
    title()                                 // Prof.
    titleMale()                             // Dr.
    titleFemale()                           // Mrs.
    oneName()                               // Wanjiku
    name()                                  // Felix Nakhatandi Mungai
    nameMale()                              // Charles Mwangi Mwai
    nameFemale()                            // Katrina Barongo Nyathera
```

### `Faker\Core\Address`

```
    city()                                  // Nanyuki
    county()                                // Nairobi
    country()                               // New Caledonia
    postcode()                              // 07676-532
    longitude()                             // -134.302227
    latittude()                             // 87.105282
    phoneNumber()                           // 0761482856
```

### `Faker\Core\Text`

```
    text()                                 
        // into the garden at once; but, alas for poor Alice! when she got to the

    text(2,4)                             
        // 'If I'd been the whiting,' said Alice, whose thoughts were still running     What would become of you? the place of the March Hare. The Hatter was the only one who got any those roses?'

        in a wondering tone. diamonds, and walked two and two, as the soldiers did. After these came on.' noticing her. Then followed the Knave of Hearts, carrying the King's
```

### `Faker\Core\Date Time`

```
    date()                                  // 2010-11-07
    dateNow()                               // 2017-10-30
    dateTime()                              // 2010-01-01 10:44:37
    dateTimeNow()                           // 2017-10-30 6:13:05
    time()                                  // 22:57:06
    timeNow()                               // 6:13:05
    dateOld()                               // 1103-11-15
    dateTimeOld()                           // 1764-01-11 03:33:32
    month()                                 // 01
    year()                                  // 1347
    dateOfMonth()                           // 11
    monthName()                             // October
    monthNameShort()                        // Jul
    dayOfWeek()                             // Wednesday
    dayOfWeekShort()                        // Mon
    dateTimeThisYear()                      // 2017-11-26 11:46:53
```

### `Faker\Core\Internet`

```
    email()                                 // wanjiru_fm@kahuthia.biz
    safeEmail()                             // karanja80@example.org
    freeEmail()                             // owuor@yahoo.com
    emailResource()                         // barongo47@kaleb.org
    safeEmailResource()                     // dh_barongo@example.com
    freeEmailResource()                     // rc_barongo@yahoo.com
    ipv4()                                  // 122.142.153.87
    localIpv4()                             // 94.213.13.6
    ipv6()                                  
    // fd7b:4a1f:8735:ca2b:d611:8df5:d444:1782

    macAddress()                            // 2D:20:0F:02:0F:0D
    url()                                   
    // http://thuu.go.ke/voluptates-nostrum.htm

    domainName()                            // osano.or.ke
    slug()                                  // aut-maiores-aut-assumenda
    password()                              // z3S(w4^U-3*
    username()                              // Aoko
    usernameResource()                      // tn_Barongo
    tid()                                   // net
```

### `Faker\Core\Payment`

```
    creditCardType()                        // Discover Card
    creditCardNumber()                      // 557804104412347
    creditCardExpirationDate()              // 01/18
```

### `Faker\Core\Color`

```
    hexColor()                              // #b534bc
    rgbColor()                              // 193,8,38
    rgbCssColor()                           // rgb(199,209,77)
    colorName()                             // Thistle
    safeColorName()                         // navy
```

### `Faker\Core\Barcode`

```
    ean13()                                 // 4741053723568
    ean8()                                  // 21571576
    isbn10()                                // 4506452872
    isbn13()                                // 3628705431327
```

### `Faker\Core\Miscellaneous `

```
    bool()                                  // false
    md5()                                   // 702aed673828231eed6458dc6aca139d
    sha1()                                  
    // 434970c4080a0e0d4e1c065892888396e99374e4

    sha256()                        
    // 78c700a3d4e07d28504279c7979325d1280004cd16070d9155d892657ce847ca

    locale()                                // gu_IN
    countryCode()                           // TD
    countryCodeIsoAlpha3()                  // IRQ
    languageCode()                          // gn
    currencyCode()                          // HRK
```