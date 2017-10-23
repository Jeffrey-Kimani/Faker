package com.Tunes_Developers.Countries;

/**
 * Created by Geoffrey-Kimani on 10/1/2017.
 */
public class Kenya extends Country {
    //Domains
    private String [] freeDomain = {
            "gmail.com", "yahoo.com", "hotmail.com"
    };
    private String [] domains = {
            "com","net", "org", "co.ke","or.ke","go.ke","biz"
    };
    //Names
    private String [] firstNameMale = {
            "Aaron","Abdul","Abdullah","Abraham","Adam","Agustin","Ahmad","Ahmed","Akeem","Albert","Alex","Alfred","Ali","Allan","Allen","Alvin","Amani","Ambrose","Amos","Anderson","Andrew","Angel","Anthony","Arnold","Arthur","Austin",
            "Barry","Ben","Benjamin","Bennie","Benny","Bernard","Berry","Berta","Bertha","Bill","Billy","Bobby","Boyd","Bradley","Brian","Bruce",
            "Caesar","Caleb","Carol","Cecil","Charles","Charlie","Chris","Christian","Christopher","Cleveland","Clifford","Clinton","Collin","Conrad",
            "Dan","Daren","Dave","David","Dax","Denis","Dennis","Derek","Derick","Derrick","Don","Donald","Douglas","Dylan",
            "Earnest","Eddie","Edgar","Edison","Edmond","Edmund","Edward","Edwin","Elias","Elijah","Elliot","Emanuel","Emmanuel","Eric","Ernest","Ethan","Eugene","Ezra",
            "Felix","Francis","Frank","Frankie","Fred",
            "Gaetano","Gaston","Gavin","Geoffrey","George","Gerald","Gideon","Gilbert","Glen","Godfrey","Graham","Gregory",
            "Hans","Harold","Henry","Herbert","Herman","Hillary","Howard",
            "Ian","Isaac","Isaiah","Ishmael",
            "Jabari","Jack","Jackson","Jacob","Jamaal","Jamal","Jasper","Jayson","Jeff","Jeffery","Jeremy","Jimmy","Joe","Joel","Joesph","Johathan","John","Johnathan","Johnny","Johnson","Jonathan","Jordan","Joseph","Joshua","Julian","Julio","Julius","Junior",
            "Kaleb","Keith","Kelly","Kelvin","Ken","Kennedy","Kenneth","Kevin","Kim",
            "Lawrence","Lewis","Lincoln","Lloyd","Luis","Luther",
            "Mackenzie","Martin","Marvin","Mathew","Mathias","Matt","Maurice","Max","Maxwell","Mckenzie","Micheal","Mike","Milton","Mitchel","Mitchell","Mohamed","Mohammad","Mohammed","Morris","Moses","Muhammad","Myles",
            "Nasir","Nat","Nathan","Newton","Nicholas","Nick","Nicklaus","Nickolas","Nicolas","Noah","Norbert",
            "Oscar","Owen",
            "Patrick","Paul","Peter","Philip",
            "Rashad","Rasheed","Raul","Ray","Raymond","Reagan","Regan","Richard","Richie","Rick","Robb","Robbie","Robert","Robin","Roger","Rogers","Ronald","Rowland","Royal","Ryan",
            "Sam","Samson","Sean","Shawn","Sid","Sidney","Solomon","Steve","Stevie","Stewart","Stuart",
            "Taylor","Theodore","Thomas","Timmy","Timothy","Titus","Tom","Tony","Travis","Trevor","Troy","Trystan","Tyler","Tyson",
            "Victor","Vince","Vincent","Vinnie",
            "Walter","Warren","Wilford","Wilfred","Will","William","Willis","Willy","Wilson"
    };
    private String [] firstNameFemale = {
            "Abigail","Adela","Adrianna","Adrienne","Aisha","Alice","Alisha","Alison","Amanda","Amelia","Amina","Amy","Anabel","Anabelle","Angela","Angelina","Angie","Anita","Anna","Annamarie","Anne","Annette","April","Arianna","Ariela","Asha","Ashley","Ashly","Audrey","Aurelia",
            "Barbara","Beatrice","Bella","Bernadette","Beth","Bethany","Bethel","Betsy","Bette","Bettie","Betty","Blanche","Bonita","Bonnie","Brenda","Bridget","Bridgette","Carissa","Carol","Carole","Carolina","Caroline","Carolyn","Carolyne","Catharine","Catherine","Cathrine","Cathryn","Cathy","Cecelia","Cecile","Cecilia","Charity","Charlotte","Chloe","Christina","Christine","Cindy","Claire","Clara","Clarissa","Claudine","Cristal","Crystal","Cynthia",
            "Dahlia","Daisy","Daniela","Daniella","Danielle","Daphne","Daphnee","Daphney","Darlene","Deborah","Destiny","Diana","Dianna","Dina","Dolly","Dolores","Donna","Dora","Dorothy","Dorris",
            "Edna","Edwina","Edyth","Elizabeth","Ella","Ellen","Elsa","Elsie","Emelia","Emilia","Emilie","Emily","Emma","Emmanuelle","Erica","Esta","Esther","Estella","Eunice","Eva","Eve","Eveline","Evelyn",
            "Fabiola","Fatima","Fiona","Flavia","Flo","Florence","Frances","Francesca","Francisca","Frida",
            "Gabriella","Gabrielle","Genevieve","Georgiana","Geraldine","Gertrude","Gladys","Gloria","Grace","Gracie",
            "Helen","Hellen","Hilda","Hillary","Hope",
            "Imelda","Isabel","Isabell","Isabella","Isabelle",
            "Jackie","Jacklyn","Jacky","Jaclyn","Jacquelyn","Jane","Janelle","Janet","Jaquelin","Jaqueline","Jenifer","Jennifer","Jessica","Joan","Josephine","Joy","Joyce","Juanita","Julia","Juliana","Julie","Juliet","Justine",
            "Katarina","Katherine","Katheryn","Katrina",
            "Laura","Leah","Leila","Lilian","Lillian","Lilly","Lina","Linda","Lisa","Lora","Loraine","Lucie","Lucy","Lulu","Lydia",
            "Mabel","Maggie","Mandy","Margaret","Margarete","Margret","Maria","Mariah","Mariam","Marian","Mariana","Mariane","Marianna","Marianne","Marie","Marilyne","Marina","Marion","Marjorie","Marjory","Marlene","Mary","Matilda","Maudie","Maureen","Maya","Meagan","Melisa","Melissa","Melody","Michele","Michelle","Minerva","Minnie","Miracle","Monica",
            "Nadia","Naomi","Naomie","Natalia","Natalie","Natasha","Nichole","Nicole","Nina","Nora",
            "Pamela","Patience","Patricia","Pauline","Pearl","Phoebe","Phyllis","Pink","Pinkie","Priscilla","Prudence",
            "Rachael","Rachel","Rebeca","Rebecca","Rhoda","Rita","Robyn","Rose","Rosemary","Ruth","Ruthe","Ruthie",
            "Sabina","Sabrina","Salma","Samantha","Sandra","Sandy","Sarah","Serena","Shakira","Sharon","Sheila","Sierra","Sonia","Sonya","Sophia","Sophie","Stacey","Stacy","Stella","Susan","Susana","Susanna","Susie","Suzanne","Sylvia",
            "Tabitha","Teresa","Tess","Theresa","Tia","Tiffany","Tina","Tracy","Trinity","Trisha","Trudie","Trycia",
            "Ursula",
            "Valentine","Valerie","Vanessa","Veronica","Vickie","Vicky","Victoria","Viola","Violet","Violette","Viva","Vivian","Viviane","Vivianne","Vivien","Vivienne",
            "Wanda","Wendy","Whitney","Wilma","Winifred",
            "Yvette","Yvonne",
            "Zita","Zoe"
    };
    private String [] lastNameMale = {
            //Luo Names
            "Agina", "Adida", "Obong\\'o", "Ahenda", "Hera", "Obama", "Obiero", "Obonyo", "Obura", "Oburu", "Obuo", "Ochanda", "Ochieng",
            "Ochola", "Ochuka", "Odede", "Odero", "Odhiambo","Adhiambo", "Odek", "Odika", "Odinga", "Odiwuor", "Odondi", "Odongo","Odoyo","Oduol","Oero",
            "Ogola","Ogol","Ogolo","Ogot","Ogutu","Oigo","Ojwang\\'","Ojuok","Okelo","Okech","Okeyo","Okinyi","Akinyi","Okinyo","Okombo","Akombo","Okomo","Akomo",
            "Okongo","Akongo","Okoth","Akoth","Okumu","Akumu","Okungu","Akungu","Oloo","Aloo","Oludhe","Aludhe","Oluoch","Aluoch","Omolo","Amolo","Omole","Omondi",
            "Amondi","Okoka","Anoka","Ondiek","Oneko","Aneko","Ongonga","Angonga","Onyango","Anyango","Ooko","Aoko","Ooro","Aoro","Opiyo","Apiyo","Opolo","Apolo","Opondo",
            "Apondo","Osano","Otieno","Atieno","Otiende","Ouma","Auma","Owino","Awino","Ounda","Ouko","Ochanda","Owiti","Awiti","Owuor","Awuor","Odwuor","Oyange","Ayange",
            "Adede","Ajek","Gor","Jalang\\'o","Jow","Julu","Kidenda","Kowa","Hongo","Magero","Majuma","Meyo","Muga","Ndiege","Nyang\\'au","Nyaoro","Raila","Ramogi","Rao",
            "Rawo","Ogwang","Ogweyo","Omire","Omuga","Onango","Oronge","Oruoch","Sialo","Were","Yienya",

            //Luhya Names
            "Nasimiyu","Nekesa","Namwonyonyi","Nelima","Nakhatandi","Namachanja","Nekoye","Nabumbo","Nafula","Makinia",
            "Khasundi","Mutenyo","Nanjala","Natelo","Ambetsa","Werengekha","Namiranda","Nasambu",

            //Kamba Names
            "Mutua","Mutisya","Kaloki","Muange","Wambua",

            //Kikuyu Names
            "Chege","Chombao","Ciugu",
            "Gichere","Gachagua","Gachanja","Gachara","Gachii","Gachuhi","Gakure","Gathaiya","Gathanja","Gathenya","Gathigira","Gathogo","Gathongo","Gathu","Gathua","Gathuuri","Gatimu","Gicheha","Gichiku","Gichohi","Gichuhi","Gichuki","Gichuru","Gikonyo","Gitahi","Gitari","Gitau","Githaiga","Githendu","Githinji","Githire","Gitonga","Gituku","Gituma","Gitura","Goko",
            "Hinga",
            "Ireri","Irungu",
            "Kabiru","Kabutha","Kago","Kagoci","Kagwa","Kahara","Kahii","Kahuthia","Kairu","Kamande","Kamangi","Kamau","Kamotho","Kamotho",
            "Kaniu","Kanja","Karanja","Karimi","Kariuki","Kariithi","Karugu","Karungu","Kenyatta","Kibachia","Kibaki","Kibe","Kibunja","Kihara",
            "Kihia","Kihiu","Kihoro","Kihuna","Kimani","Kimaru","Kimotho","Kimunya","King’ori","Kinuthia","Kinuthia","Kinyanjui","Kinyua",
            "Kioi","Kiongo","Kiragu","Kirika","Kirima","Kogi","Koinange","Kungu","Kuria","Macharia","Mahihu","Maina","Maitho","Mathenge","Matu",
            "Mbira","Mbugua","Mburu","Michuki","Muchene","Muchoki","Muciri","Mugane","Mugo","Muhia","Muhoho","Muhoro","Muhuri","Muiruri","Muite",
            "Mukundi","Munene","Mungai","Mungania","Muraguri","Murakaru","Muraya","Murigi","Murigo","Muriithi","Murimi","Murira","Muriranja",
            "Muriu","Muriuki","Murungaru","Mutegi","Muthinji","Muthui","Muthungu","Mutiga","Mutugi","Mutung’u","Muya","Mwagiru","Mwai","Mwangi",
            "Mwaniki","Mwathi","Ndegwa","Nderitu","Ndiangui","Ndirangu","Ndun\\'gu","Ng\\'ang\\'a","Ngari","Ngechu","Ngengi","Ngichu","Ngigi",
            "Ngina","Nginyo","Ngugi","Ngunjiri","Ngure","Njagi","Njara","Njau","Njenga","Njeru","Njogu","Njoka","Njomo","Njonjo","Njoroge",
            "Njuguna","Njuki","Nyamu","Nyoike","Nyoro","Thairu","Theuri","Thuku","Thuu","Wachira,","Wachiuri","Wachiuru","Wahome","Waigwa",
            "Wainaina","Waita","Waititu","Wakaritu","Wamahiu","Wambugu","Wamiti","Wamugunda","Wanderi","Wang’ombe","Wang’ondu","Wanyoike",
            "Warari","Warui","Waruiru","Watene","Waweru",

            //Kisii Names
            "Onkwani", "Sokoro", "Morani", "Muga", "Nyachae", "Makori",

            //Swahili Names
            "Barack", "Barak", "Barrak","Baraka","Faraji", "Jabari", "Omari", "Sadeeki", "Sadiki", "Sahel", "Simba", "Yazeed",
    };
    private String [] lastNameFemale = {
            //Luhya names
            "Nasimiyu","Nekesa","Namwonyonyi","Nelima","Nakhatandi","Namachanja","Nekoye","Nabumbo","Nafula","Makinia","Khasundi","Mutenyo","Nanjala","Natelo","Ambetsa",
            "Werengekha","Namiranda","Nasambu",

            //Kamba Names
            "Wanza","Ngina","Koki","Mumbua","Nzula",

            //Kikuyu Names
            "Wanjiru","Wambui","Njeri","Wanjiku","Nyambura","Wairimu","Waithira","Wangari","Wangui","Gakuhi","Kanyi","Mukami","Mukina",
            "Mumbi","Muringa","Muringo","Murugi","Muthoni","Mwara","Nduta","Ng’endo","Ngina","Njambi","Njeri","Njoki","Nungari","Nyagura",
            "Nyaguthii","Nyambugi","Nyambura","Nyawira","Nyokabi","Waceke","Wacu","WaCuka","WaGichugu","Wahu","Wairimu","Waitherero","Waithira",
            "Wamaitha","WaMbeere","Wambugua","Wambui","WaMeru","Wamuyu","WaNdia","Wangari","Wangeci","Wangu","Wangui","Wanja","Wanjiku","Wanjira",
            "Wanjiru","Wanyiri","Wanyora","Warigia","Waringa","Waruguru","Wathira","Wawira",

            //Kisii Names
            "Barongo", "Kerubo", "Kwamboka", "Mongina", "Moraa", "Nyanjera", "Nyathera",

            //Swahili Names
            "Amani", "Ayanna", "Jina", "Lakeisha", "Lela", "Lulu", "Nea", "Neema female", "Dalila", "Nia", "Niah",
            "Nya", "Nyah", "Safia", "Safiya", "Safiyah", "Shani", "Shanit", "Hasina",
    };
    //Phone Numbers
    private String [] phoneFormats = {
            "072#######",
            "073#######",
            "076#######",
            "077#######",
            "078#######",
            "079#######",
            "+254 72#######",
            "+254 73#######",
            "+254 76#######",
            "+254 77#######",
            "+254 78#######",
            "+254 79#######",
            "0800-######",
            "0800######",
            "0800 ######",
            "0800 ### ###",
    };
    //Regions
    private String [] county = {};
    private String [] city = {
            "Nairobi", "Mombasa", "Kisumu", "Machakos", "Nyeri", "Eldoret", "Lamu", "Bungoma", "Nyahururu", "Busia",
            "Nanyuki", "Wote", "Kilifi", "Kericho", "Nakuru", "Naivasha", "Baringo"
    };

    public Kenya() {
        super();
        super.setDetails(freeDomain, domains, firstNameMale, firstNameFemale, lastNameMale, lastNameFemale, phoneFormats,
                city, city);
    }
}
