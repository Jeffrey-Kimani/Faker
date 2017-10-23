package com.Tunes_Developers.Countries;

/**
 * Created by Geoffrey-Kimani on 10/1/2017.
 */
public class Italy extends Country {
    //Domains
    private String [] freeDomain = {
            "gmail.com", "yahoo.com", "hotmail.com", "email.it", "libero.it", "yahoo.it"
    };
    private String [] domains = {
            "com","net", "org", "it"
    };
    //Names
    private String [] firstNameMale = {
            "Aaron", "Abramo", "Adriano", "Akira", "Alan", "Alberto", "Albino", "Alessandro", "Alessio", "Amedeo", "Amos", "Anastasio", "Anselmo",
            "Antimo", "Antonino", "Antonio", "Ariel", "Armando", "Aroldo", "Arturo", "Augusto", "Battista", "Bernardo", "Boris", "Caio",
            "Carlo", "Carmelo", "Ciro", "Damiano", "Danny", "Dante", "Davide", "Davis", "Demis", "Dimitri", "Domingo", "Dylan",
            "Edilio", "Egidio", "Elio", "Emanuel", "Emidio", "Enrico", "Enzo", "Ercole", "Ermes", "Ethan", "Ettore", "Eusebio",
            "Fabiano", "Fabio", "Ferdinando", "Fernando", "Fiorenzo", "Flavio", "Folco", "Fulvio", "Furio", "Gabriele", "Gaetano", "Gastone",
            "Gavino", "Gerlando", "Germano", "Giacinto", "Gianantonio", "Giancarlo", "Gianmarco", "Gianmaria", "Gioacchino", "Giordano", "Giorgio", "Giuliano",
            "Giulio", "Graziano", "Gregorio", "Guido", "Harry", "Hector", "Iacopo", "Ian", "Ilario", "Italo", "Ivano", "Jack",
            "Jacopo", "Jari", "Jarno", "Joey", "Joseph", "Joshua", "Kai", "Karim", "Kris", "Lamberto", "Lauro", "Lazzaro",
            "Leonardo", "Liborio", "Lino", "Lorenzo", "Loris", "Ludovico", "Luigi", "Manfredi", "Manuele", "Marco", "Mariano", "Marino",
            "Marvin", "Marzio", "Matteo", "Mattia", "Mauro", "Max", "Michael", "Mirco", "Mirko", "Modesto", "Moreno", "Nabil",
            "Nadir", "Nathan", "Nazzareno", "Nick", "Nico", "Noah", "Noel", "Omar", "Oreste", "Osvaldo", "Pablo", "Patrizio",
            "Pietro", "Priamo", "Quirino", "Raoul", "Renato", "Renzo", "Rocco", "Rodolfo", "Romeo", "Romolo", "Rudy", "Sabatino",
            "Sabino", "Samuel", "Sandro", "Santo", "Sebastian", "Sesto", "Silvano", "Silverio", "Sirio", "Siro", "Timoteo", "Timothy",
            "Tommaso", "Ubaldo", "Umberto", "Vinicio", "Walter", "Xavier", "Yago", "Alighieri", "Alighiero", "Amerigo", "Arcibaldo", "Arduino",
            "Artes", "Audenico", "Ausonio", "Bacchisio", "Baldassarre", "Bettino", "Bortolo", "Caligola", "Cecco", "Cirino", "Cleros",
            "Costantino", "Costanzo", "Danthon", "Demian","Domiziano", "Edipo", "Egisto", "Eliziario", "Eriberto", "Erminio",
            "Eustachio", "Evangelista", "Fiorentino", "Giacobbe", "Gianleonardo", "Gianriccardo", "Giobbe", "Ippolito",
            "Isira", "Joannes", "Kociss", "Laerte", "Maggiore", "Muzio", "Nestore", "Odino", "Odone", "Olo", "Oretta", "Orfeo",
            "Osea", "Pacifico", "Pericle", "Piererminio", "Pierfrancesco", "Piersilvio", "Primo", "Quarto", "Quasimodo",
            "Radames", "Radio", "Raniero", "Rosalino", "Rosolino", "Rufo", "Secondo", "Tancredi", "Tazio", "Terzo", "Teseo",
            "Tolomeo",  "Trevis", "Tristano", "Ulrico", "Valdo", "Zaccaria", "Dindo", "Serse"
    };
    private String [] firstNameFemale = {
            "Assia", "Benedetta", "Bibiana", "Brigitta", "Carmela", "Celeste", "Cira", "Claudia", "Concetta", "Cristyn", "Deborah", "Demi", "Diana",
            "Donatella", "Doriana", "Edvige", "Elda", "Elga", "Elsa", "Emilia", "Enrica", "Erminia", "Evita", "Fatima", "Felicia",
            "Filomena", "Fortunata", "Gilda", "Giovanna", "Giulietta", "Grazia", "Helga", "Ileana", "Ingrid", "Ione", "Irene", "Isabel",
            "Ivonne", "Jelena", "Kayla", "Kristel", "Laura", "Leone", "Lia", "Lidia", "Lisa", "Loredana", "Loretta", "Luce",
            "Lucia", "Lucrezia", "Luna", "Maika", "Marcella", "Maria", "Marianita", "Mariapia", "Marina", "Maristella", "Maruska", "Matilde",
            "Mercedes", "Michele", "Miriam", "Miriana", "Monia", "Morgana", "Naomi", "Neri", "Nicoletta", "Ninfa", "Noemi", "Nunzia",
            "Olimpia", "Ortensia", "Penelope", "Prisca", "Rebecca", "Rita", "Rosalba", "Rosaria", "Rosita", "Ruth", "Samira", "Sarita",
            "Sasha", "Shaira", "Thea", "Ursula", "Vania", "Vera", "Vienna", "Artemide", "Cassiopea", "Cesidia", "Clea", "Cleopatra",
            "Clodovea", "Cosetta", "Damiana", "Danuta", "Diamante", "Eufemia", "Flaviana", "Gelsomina", "Genziana", "Giacinta", "Guendalina",
            "Jole", "Mariagiulia", "Marieva", "Mietta", "Nayade", "Piccarda", "Selvaggia", "Sibilla", "Soriana", "Sue ellen", "Tosca","Violante",
            "Vitalba", "Zelida"
    };
    private String [] lastName = {
            "Rossi", "Russo", "Ferrari", "Esposito", "Bianchi", "Romano", "Colombo", "Ricci", "Marino", "Greco", "Bruno", "Gallo", "Conti",
            "De luca", "Mancini", "Costa", "Giordano", "Rizzo", "Lombardi", "Moretti", "Barbieri", "Fontana", "Santoro", "Mariani",
            "Rinaldi", "Caruso", "Ferrara", "Galli", "Martini", "Leone", "Longo", "Gentile", "Martinelli", "Vitale", "Lombardo", "Serra",
            "Coppola", "De Santis", "D\"angelo", "Marchetti", "Parisi", "Villa", "Conte", "Ferraro", "Ferri", "Fabbri", "Bianco",
            "Marini", "Grasso", "Valentini", "Messina", "Sala", "De Angelis", "Gatti", "Pellegrini", "Palumbo", "Sanna", "Farina",
            "Rizzi", "Monti", "Cattaneo", "Morelli", "Amato", "Silvestri", "Mazza", "Testa", "Grassi", "Pellegrino", "Carbone",
            "Giuliani", "Benedetti", "Barone", "Rossetti", "Caputo", "Montanari", "Guerra", "Palmieri", "Bernardi", "Martino", "Fiore",
            "De rosa", "Ferretti", "Bellini", "Basile", "Riva", "Donati", "Piras", "Vitali", "Battaglia", "Sartori", "Neri", "Costantini",
            "Milani", "Pagano", "Ruggiero", "Sorrentino", "D\"amico", "Orlando", "Damico", "Negri"
    };
    //Phone Numbers
    private String [] phoneFormats = {
            "+## ### ## ## ####",
            "+## ## #######",
            "+## ## ########",
            "+## ### #######",
            "+## ### ########",
            "+## #### #######",
            "+## #### ########",
            "0## ### ####",
            "+39 0## ### ###",
            "3## ### ###",
            "+39 3## ### ###"
    };
    //Regions
    private String [] county = {
            "Agrigento", "Alessandria", "Ancona", "Aosta", "Arezzo", "Ascoli Piceno", "Asti", "Avellino", "Bari", "Barletta-Andria-Trani", "Belluno", "Benevento", "Bergamo", "Biella", "Bologna", "Bolzano", "Brescia", "Brindisi", "Cagliari", "Caltanissetta", "Campobasso", "Carbonia-Iglesias", "Caserta", "Catania", "Catanzaro", "Chieti", "Como", "Cosenza", "Cremona", "Crotone", "Cuneo", "Enna", "Fermo", "Ferrara", "Firenze", "Foggia", "Forlì-Cesena", "Frosinone", "Genova", "Gorizia", "Grosseto", "Imperia", "Isernia", "La Spezia", "L\"Aquila", "Latina", "Lecce", "Lecco", "Livorno", "Lodi", "Lucca", "Macerata", "Mantova", "Massa-Carrara", "Matera", "Messina", "Milano", "Modena", "Monza e della Brianza", "Napoli", "Novara", "Nuoro", "Olbia-Tempio", "Oristano", "Padova", "Palermo", "Parma", "Pavia", "Perugia", "Pesaro e Urbino", "Pescara", "Piacenza", "Pisa", "Pistoia", "Pordenone", "Potenza", "Prato", "Ragusa", "Ravenna", "Reggio Calabria", "Reggio Emilia", "Rieti", "Rimini", "Roma", "Rovigo", "Salerno", "Medio Campidano", "Sassari", "Savona", "Siena", "Siracusa", "Sondrio", "Taranto", "Teramo", "Terni", "Torino", "Ogliastra", "Trapani", "Trento", "Treviso", "Trieste", "Udine", "Varese", "Venezia", "Verbano-Cusio-Ossola", "Vercelli", "Verona", "Vibo Valentia", "Vicenza", "Viterbo"
    };

    public Italy() {
        super();
        super.setDetails(freeDomain, domains, firstNameMale, firstNameFemale, lastName, lastName, phoneFormats,
                county, county);
    }
}
