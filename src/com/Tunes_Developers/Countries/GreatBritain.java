package com.Tunes_Developers.Countries;

/**
 * Created by Geoffrey-Kimani on 10/1/2017.
 */
public class GreatBritain extends Country {
    //Domains
    private String [] freeDomain = {
            "gmail.com", "yahoo.com", "hotmail.com", "gmail.co.uk", "yahoo.co.uk", "hotmail.co.uk"
    };
    private String [] domains = {
             "com", "biz", "info", "net", "org", "co.uk"
    };
    //Names
    private String [] firstNameMale = {
            "Aaron", "Adam", "Adrian", "Aiden", "Alan", "Alex", "Alexander", "Alfie", "Andrew", "Andy", "Anthony", "Archie", "Arthur",
            "Barry", "Ben", "Benjamin", "Bradley", "Brandon", "Bruce",
            "Callum", "Cameron", "Charles", "Charlie", "Chris", "Christian", "Christopher", "Colin", "Connor", "Craig",
            "Dale", "Damien", "Dan", "Daniel", "Darren", "Dave", "David", "Dean", "Dennis", "Dominic", "Duncan", "Dylan",
            "Edward", "Elliot", "Elliott", "Ethan",
            "Finley", "Frank", "Fred", "Freddie",
            "Gary", "Gavin", "George", "Gordon", "Graham", "Grant", "Greg",
            "Harley", "Harrison", "Harry", "Harvey", "Henry",
            "Ian", "Isaac",
            "Jack", "Jackson", "Jacob", "Jake", "James", "Jamie", "Jason", "Jayden", "Jeremy", "Jim", "Joe", "Joel", "John", "Jonathan", "Jordan", "Joseph", "Joshua",
            "Karl", "Keith", "Ken", "Kevin", "Kieran", "Kyle",
            "Lee", "Leo", "Lewis", "Liam", "Logan", "Louis", "Lucas", "Luke",
            "Mark", "Martin", "Mason", "Matthew", "Max", "Michael", "Mike", "Mohammed", "Muhammad",
            "Nathan", "Neil", "Nick", "Noah",
            "Oliver", "Oscar", "Owen",
            "Patrick", "Paul", "Pete", "Peter", "Philip",
            "Quentin",
            "Ray", "Reece", "Riley", "Rob", "Ross", "Ryan",
            "Samuel", "Scott", "Sean", "Sebastian", "Stefan", "Stephen", "Steve",
            "Theo", "Thomas", "Tim", "Toby", "Tom", "Tony", "Tyler",
            "Wayne", "Will", "William",
            "Zachary", "Zach"
    };
    private String [] firstNameFemale = {
            "Abbie", "Abigail", "Adele", "Alexa", "Alexandra", "Alice", "Alison", "Amanda", "Amber", "Amelia", "Amy", "Anna", "Ashley", "Ava",
            "Beth", "Bethany", "Becky",
            "Caitlin", "Candice", "Carlie", "Carmen", "Carole", "Caroline", "Carrie", "Charlotte", "Chelsea", "Chloe", "Claire", "Courtney",
            "Daisy", "Danielle", "Donna",
            "Eden", "Eileen", "Eleanor", "Elizabeth", "Ella", "Ellie", "Elsie", "Emily", "Emma", "Erin", "Eva", "Evelyn", "Evie",
            "Faye", "Fiona", "Florence", "Francesca", "Freya",
            "Georgia", "Grace",
            "Hannah", "Heather", "Helen", "Helena", "Hollie", "Holly",
            "Imogen", "Isabel", "Isabella", "Isabelle", "Isla", "Isobel",
            "Jade", "Jane", "Jasmine", "Jennifer", "Jessica", "Joanne", "Jodie", "Julia", "Julie", "Justine",
            "Karen", "Karlie", "Katie", "Keeley", "Kelly", "Kimberly", "Kirsten", "Kirsty",
            "Laura", "Lauren", "Layla", "Leah", "Leanne", "Lexi", "Lilly", "Lily", "Linda", "Lindsay", "Lisa", "Lizzie", "Lola", "Lucy",
            "Maisie", "Mandy", "Maria", "Mary", "Matilda", "Megan", "Melissa", "Mia", "Millie", "Molly",
            "Naomi", "Natalie", "Natasha", "Nicole", "Nikki",
            "Olivia",
            "Patricia", "Paula", "Pauline", "Phoebe", "Poppy",
            "Rachel", "Rebecca", "Rosie", "Rowena", "Roxanne", "Ruby", "Ruth",
            "Sabrina", "Sally", "Samantha", "Sarah", "Sasha", "Scarlett", "Selina", "Shannon", "Sienna", "Sofia", "Sonia", "Sophia", "Sophie", "Stacey", "Stephanie","Suzanne", "Summer",
            "Tanya", "Tara", "Teagan", "Theresa", "Tiffany", "Tina", "Tracy",
            "Vanessa", "Vicky", "Victoria",
            "Wendy",
            "Yasmine", "Yvette", "Yvonne",
            "Zoe",
    };
    private String [] lastName = {
            "Adams", "Allen", "Anderson",
            "Bailey", "Baker", "Bell", "Bennett", "Brown", "Butler",
            "Campbell", "Carter", "Chapman", "Clark", "Clarke", "Collins", "Cook", "Cooper", "Cox",
            "Davies", "Davis",
            "Edwards", "Ellis", "Evans",
            "Fox",
            "Graham", "Gray", "Green", "Griffiths",
            "Hall", "Harris", "Harrison", "Hill", "Holmes", "Hughes", "Hunt", "Hunter",
            "Jackson", "James", "Johnson", "Jones",
            "Kelly", "Kennedy", "Khan", "King", "Knight",
            "Lee", "Lewis", "Lloyd",
            "Marshall", "Martin", "Mason", "Matthews", "Miller", "Mitchell", "Moore", "Morgan", "Morris", "Murphy", "Murray",
            "Owen",
            "Palmer", "Parker", "Patel", "Phillips", "Powell", "Price",
            "Reid", "Reynolds", "Richards", "Richardson", "Roberts", "Robertson", "Robinson", "Rogers", "Rose", "Ross", "Russell",
            "Saunders", "Scott", "Shaw", "Simpson", "Smith", "Stevens", "Stewart",
            "Taylor", "Thomas", "Thompson", "Turner",
            "Walker", "Walsh", "Ward", "Watson", "White", "Wilkinson", "Williams", "Wilson", "Wood", "Wright",
            "Young",
    };
    //Phone Numbers
    private String [] phoneFormats = {
            "+44(0)##########",
            "+44(0)#### ######",
            "+44(0)#########",
            "+44(0)#### #####",
            "0##########",
            "0#########",
            "0#### ######",
            "0#### #####",
            "0### ### ####",
            "0### #######",
            "(0####) ######",
            "(0####) #####",
            "(0###) ### ####",
            "(0###) #######",
            "07#########",
            "07### ######",
            "07### ### ###"
    };
    //Regions
    private String [] county = {
            "Aberdeenshire", "Anglesey", "Angus", "Argyll", "Ayrshire", "Banffshire", "Bedfordshire", "Berwickshire", "Breconshire", "Buckinghamshire", "Bute", "Caernarvonshire", "Caithness", "Cambridgeshire", "Cardiganshire", "Carmarthenshire", "Cheshire", "Clackmannanshire", "Cornwall", "Isles of Scilly", "Cumbria", "Denbighshire", "Derbyshire", "Devon", "Dorset", "Dumbartonshire", "Dumfriesshire", "Durham", "East Lothian", "East Sussex", "Essex", "Fife", "Flintshire", "Glamorgan", "Gloucestershire", "Greater London", "Greater Manchester", "Hampshire", "Hertfordshire", "Inverness", "Kent", "Kincardineshire", "Kinross-shire", "Kirkcudbrightshire", "Lanarkshire", "Lancashire", "Leicestershire", "Lincolnshire", "London", "Merionethshire", "Merseyside", "Midlothian", "Monmouthshire", "Montgomeryshire", "Moray", "Nairnshire", "Norfolk", "North Yorkshire", "Northamptonshire", "Northumberland", "Nottinghamshire", "Orkney", "Oxfordshire", "Peebleshire", "Pembrokeshire", "Perthshire", "Radnorshire", "Renfrewshire", "Ross & Cromarty", "Roxburghshire", "Selkirkshire", "Shetland", "Shropshire", "Somerset", "South Yorkshire", "Staffordshire", "Stirlingshire", "Suffolk", "Surrey", "Sutherland", "Tyne and Wear", "Warwickshire", "West Lothian", "West Midlands", "West Sussex", "West Yorkshire", "Wigtownshire", "Wiltshire", "Worcestershire"
    };

    public GreatBritain() {
        super();
        super.setDetails(freeDomain, domains, firstNameMale, firstNameFemale, lastName, lastName, phoneFormats,
                county, county);
    }
}
