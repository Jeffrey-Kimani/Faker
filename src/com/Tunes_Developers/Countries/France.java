package com.Tunes_Developers.Countries;

/**
 * Created by Geoffrey-Kimani on 10/1/2017.
 */
public class France extends Country {
    //Domains
    private String [] freeDomain = {
            "voila.fr", "gmail.com", "hotmail.fr", "yahoo.fr", "laposte.net", "free.fr", "sfr.fr", "orange.fr", "bouygtel.fr", "club-internet.fr", "dbmail.com", "live.com", "ifrance.com", "noos.fr", "tele2.fr", "tiscali.fr", "wanadoo.fr"
    };
    private String [] domains = {
            "com", "com", "com", "net", "org", "fr", "fr", "fr"
    };
    //Names
    private String [] firstNameMale = {
            "Adrien", "Aimé", "Alain", "Alexandre", "Alfred", "Alphonse", "André", "Antoine", "Arthur", "Auguste", "Augustin",
            "Benjamin", "Benoît", "Bernard", "Bertrand", "Charles", "Christophe", "Daniel", "David", "Denis", "Édouard", "Émile",
            "Emmanuel", "Éric", "Étienne", "Eugène", "François", "Franck", "Frédéric", "Gabriel", "Georges", "Gérard", "Gilbert",
            "Gilles", "Grégoire", "Guillaume", "Guy", "William", "Henri", "Honoré", "Hugues", "Isaac", "Jacques", "Jean", "Jérôme",
            "Joseph", "Jules", "Julien", "Laurent", "Léon", "Louis", "Luc", "Lucas", "Marc", "Marcel", "Martin", "Matthieu",
            "Maurice", "Michel", "Nicolas", "Noël", "Olivier", "Patrick", "Paul", "Philippe", "Pierre", "Raymond", "Rémy", "René",
            "Richard", "Robert", "Roger", "Roland", "Sébastien", "Stéphane", "Théodore", "Théophile", "Thibaut", "Thibault", "Thierry",
            "Thomas", "Timothée", "Tristan", "Victor", "Vincent", "Xavier", "Yves", "Zacharie", "Claude", "Dominique"
    };
    private String [] firstNameFemale = {
            "Adélaïde", "Adèle", "Adrienne", "Agathe", "Agnès", "Aimée", "Alexandrie", "Alix", "Alexandria", "Alex", "Alice",
            "Amélie", "Anaïs", "Anastasie", "Andrée", "Anne", "Anouk", "Antoinette", "Arnaude", "Astrid", "Audrey", "Aurélie",
            "Aurore", "Bernadette", "Brigitte", "Capucine", "Caroline", "Catherine", "Cécile", "Céline", "Célina", "Chantal",
            "Charlotte", "Christelle", "Christiane", "Christine", "Claire", "Claudine", "Clémence", "Colette", "Constance",
            "Corinne", "Danielle", "Denise", "Diane", "Dorothée", "Édith", "Éléonore", "Élisabeth", "Élise", "Élodie", "Émilie",
            "Emmanuelle", "Françoise", "Frédérique", "Gabrielle", "Geneviève", "Hélène", "Henriette", "Hortense", "Inès", "Isabelle",
            "Jacqueline", "Jeanne", "Jeannine", "Joséphine", "Josette", "Julie", "Juliette", "Laetitia", "Laure", "Laurence",
            "Lorraine", "Louise", "Luce", "Lucie", "Lucy", "Madeleine", "Manon", "Marcelle", "Margaux", "Margaud", "Margot",
            "Marguerite", "Margot", "Margaret", "Maggie", "Marianne", "Marie", "Marine", "Marthe", "Martine", "Maryse",
            "Mathilde", "Michèle", "Michelle", "Michelle", "Monique", "Nathalie", "Nath", "Nathalie", "Nicole", "Noémi", "Océane",
            "Odette", "Olivie", "Patricia", "Paulette", "Pauline", "Pénélope", "Philippine", "Renée", "Sabine", "Simone", "Sophie",
            "Stéphanie", "Susanne", "Suzanne", "Susan", "Suzanne", "Sylvie", "Thérèse", "Valentine", "Valérie", "Véronique",
            "Victoire", "Virginie", "Zoé", "Camille", "Dominique"
    };
    private String [] lastName = {
            "Allard", "Arsenault", "Audet",
            "Beaudoin", "Beaulieu", "Bédard", "Bélanger", "Benoît", "Bergeron", "Bernard", "Bernier", "Bertrand", "Bérubé",
            "Bilodeau", "Blais", "Blanchette", "Boisvert", "Boivin", "Bolduc", "Bouchard", "Boucher", "Boudreau",
            "Caron", "Carrier", "Champagne", "Charbonneau", "Cloutier", "Côté", "Couture", "Cyr",
            "Demers", "Deschênes", "Desjardins", "Desrosiers", "Dion", "Dionne", "Drouin", "Dubé", "Dubois", "Dufour", "Dupuis",
            "Fillion", "Fontaine", "Fortier", "Fortin", "Fournier",
            "Gagné", "Gagnon", "Gaudreault", "Gauthier", "Giguère", "Gilbert", "Gingras", "Girard", "Giroux", "Goulet",
            "Gosselin", "Gravel", "Grenier", "Guay",
            "Hamel", "Harvey", "Hébert", "Houle",
            "Jean", "Jacques",
            "Labelle", "Lachance", "Lacroix", "Lalonde", "Lambert", "Landry", "Langlois", "Lapierre", "Lapointe", "Larouche",
            "Lauzon", "Lavoie", "Leblanc", "Leduc", "Leclerc", "Lefebvre", "Legault", "Lemay", "Lemieux", "Lepage", "Lessard",
            "Lévesque",
            "Martel", "Martin", "Ménard", "Mercier", "Michaud", "Moreau", "Morin",
            "Nadeau", "Nguyen",
            "Ouellet",
            "Paquette", "Paradis", "Parent", "Pelletier", "Perreault", "Perron", "Picard", "Plante", "Poirier", "Poulin",
            "Proulx",
            "Raymond", "Renaud", "Richard", "Rioux", "Robert", "Rousseau", "Roy",
            "Savard", "Simard", "St-Pierre",
            "Tardif", "Tessier", "Thériault", "Therrien", "Thibault", "Tremblay", "Trudel", "Turcotte",
            "Vachon", "Vaillancourt", "Villeneuve"
    };
    //Phone Numbers
    private String [] phoneFormats = {
            "+33 (0)1 ## ## ## ##",
            "+33 (0)1 ## ## ## ##",
            "+33 (0)2 ## ## ## ##",
            "+33 (0)3 ## ## ## ##",
            "+33 (0)4 ## ## ## ##",
            "+33 (0)5 ## ## ## ##",
            "+33 (0)6 ## ## ## ##",
            "+33 (0)8 ## ## ## ##",
            "+33 (0)9 ## ## ## ##",
            "+33 1 ## ## ## ##",
            "+33 1 ## ## ## ##",
            "+33 2 ## ## ## ##",
            "+33 3 ## ## ## ##",
            "+33 4 ## ## ## ##",
            "+33 5 ## ## ## ##",
            "+33 6 ## ## ## ##",
            "+33 8 ## ## ## ##",
            "+33 9 ## ## ## ##",
            "01########",
            "01########",
            "02########",
            "03########",
            "04########",
            "05########",
            "06########",
            "08########",
            "09########",
            "01 ## ## ## ##",
            "01 ## ## ## ##",
            "02 ## ## ## ##",
            "03 ## ## ## ##",
            "04 ## ## ## ##",
            "05 ## ## ## ##",
            "06 ## ## ## ##",
            "08 ## ## ## ##",
            "09 ## ## ## ##",
            "+33 6 ## ## ## ##",
            "06########",
            "07########",
            "06 ## ## ## ##",
            "07 ## ## ## ##",
    };
    //Regions
    private String [] county = {
            "Alsace", "Aquitaine", "Auvergne", "Bourgogne", "Bretagne", "Centre", "Champagne-Ardenne",
            "Corse", "Franche-Comté", "Île-de-France", "Languedoc-Roussillon", "Limousin",
            "Lorraine", "Midi-Pyrénées", "Nord-Pas-de-Calais", "Basse-Normandie", "Haute-Normandie",
            "Pays-de-Loire", "Picardie", "Poitou-Charentes", "Provence-Alpes-Côte d'Azur", "Rhone-Alpes",
            "Guadeloupe", "Martinique", "Guyane", "Réunion", "Saint-Pierre-et-Miquelon", "Mayotte",
            "Saint-Barthélémy", "Saint-Martin", "Wallis-et-Futuna", "Polynésie française", "Nouvelle-Calédonie"
    };

    public France() {
        super();
        super.setDetails(freeDomain, domains, firstNameMale, firstNameFemale, lastName, lastName, phoneFormats,
                county, county);
    }
}
