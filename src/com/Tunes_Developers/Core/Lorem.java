package com.Tunes_Developers.Core;

import java.util.Random;

/**
 * Created by Geoffrey-Kimani on 10/1/2017.
 */
public class Lorem {
    private String [] WordList = {
            "alias", "consequatur", "aut", "perferendis", "sit", "voluptatem",
            "accusantium", "doloremque", "aperiam", "eaque","ipsa", "quae", "ab",
            "illo", "inventore", "veritatis", "et", "quasi", "architecto",
            "beatae", "vitae", "dicta", "sunt", "explicabo", "aspernatur", "aut",
            "odit", "aut", "fugit", "sed", "quia", "consequuntur", "magni",
            "dolores", "eos", "qui", "ratione", "voluptatem", "sequi", "nesciunt",
            "neque", "dolorem", "ipsum", "quia", "dolor", "sit", "amet",
            "consectetur", "adipisci", "velit", "sed", "quia", "non", "numquam",
            "eius", "modi", "tempora", "incidunt", "ut", "labore", "et", "dolore",
            "magnam", "aliquam", "quaerat", "voluptatem", "ut", "enim", "ad",
            "minima", "veniam", "quis", "nostrum", "exercitationem", "ullam",
            "corporis", "nemo", "enim", "ipsam", "voluptatem", "quia", "voluptas",
            "sit", "suscipit", "laboriosam", "nisi", "ut", "aliquid", "ex", "ea",
            "commodi", "consequatur", "quis", "autem", "vel", "eum", "iure",
            "reprehenderit", "qui", "in", "ea", "voluptate", "velit", "esse",
            "quam", "nihil", "molestiae", "et", "iusto", "odio", "dignissimos",
            "ducimus", "qui", "blanditiis", "praesentium", "laudantium", "totam",
            "rem", "voluptatum", "deleniti", "atque", "corrupti", "quos",
            "dolores", "et", "quas", "molestias", "excepturi", "sint",
            "occaecati", "cupiditate", "non", "provident", "sed", "ut",
            "perspiciatis", "unde", "omnis", "iste", "natus", "error",
            "similique", "sunt", "in", "culpa", "qui", "officia", "deserunt",
            "mollitia", "animi", "id", "est", "laborum", "et", "dolorum", "fuga",
            "et", "harum", "quidem", "rerum", "facilis", "est", "et", "expedita",
            "distinctio", "nam", "libero", "tempore", "cum", "soluta", "nobis",
            "est", "eligendi", "optio", "cumque", "nihil", "impedit", "quo",
            "porro", "quisquam", "est", "qui", "minus", "id", "quod", "maxime",
            "placeat", "facere", "possimus", "omnis", "voluptas", "assumenda",
            "est", "omnis", "dolor", "repellendus", "temporibus", "autem",
            "quibusdam", "et", "aut", "consequatur", "vel", "illum", "qui",
            "dolorem", "eum", "fugiat", "quo", "voluptas", "nulla", "pariatur",
            "at", "vero", "eos", "et", "accusamus", "officiis", "debitis", "aut",
            "rerum", "necessitatibus", "saepe", "eveniet", "ut", "et",
            "voluptates", "repudiandae", "sint", "et", "molestiae", "non",
            "recusandae", "itaque", "earum", "rerum", "hic", "tenetur", "a",
            "sapiente", "delectus", "ut", "aut", "reiciendis", "voluptatibus",
            "maiores", "doloribus", "asperiores", "repellat"
    };

    int WordNo = WordList.length;
    Random ran = new Random();

    public Lorem() {

    }

    public String getWord() {
        return WordList[ran.nextInt(WordNo)];
    }

    public String[] getWords(int nbWords) {
        String[] words = new String[nbWords];

        for (int i = 0; i < nbWords; i++) {
            words[i] = WordList[ran.nextInt(WordNo)];
        }

        return words;
    }

    public String getSentence() {
        String sentence = "";

        for (int i = 0; i < 6; i++) {
            sentence +=" "+WordList[ran.nextInt(WordNo)];
        }

        return sentence+".";
    }

    public String getSentence(int nbWords) {
        String sentence = "";

        for (int i = 0; i < nbWords; i++) {
            sentence +=" "+WordList[ran.nextInt(WordNo)];
        }

        return sentence+".";
    }

    public String[] getSentences(int nbWords,int nbSentence) {
        String[] sentence = null;

        for (int i = 0; i < nbSentence; i++) {
            sentence[i] = getSentence(nbWords);
        }

        return sentence;
    }

    public String getParagraph(int nbWords, int nbSentences) {
        String sentence="",paragraph="";

        for (int i = 0; i < nbSentences; i++) {
            sentence = "";
            for (int j = 0; j < nbWords; j++) {
                String word = WordList[ran.nextInt(WordNo)];
                if (j == 0) {
                    word = word.substring(0,1).toUpperCase()+word.substring(1,word.length());
                }
                sentence +=" "+word;
            }
            paragraph += sentence+".";
        }

        return paragraph;
    }

    public String getRandomParagraph() {
        String sentence="",paragraph="";
        int nbSentences = correctZeros(ran.nextInt(10));

        for (int i = 0; i < nbSentences; i++) {
            sentence = "";
            int nbWords = correctZeros(ran.nextInt(15));

            for (int j = 0; j < nbWords; j++) {
                String word = WordList[ran.nextInt(WordNo)];
                if (j == 0) {
                    word = word.substring(0,1).toUpperCase()+word.substring(1,word.length());
                }
                sentence +=" "+word;
            }
            paragraph += sentence+".";
        }

        return paragraph;
    }

    public String getParagraphs(int nbWords, int nbSentences, int nbParagraphs) {
        String sentence="",paragraph="",paragraphs="";

        for (int i = 0; i < nbParagraphs; i++) {
            paragraph = "";

            for (int j = 0; j < nbSentences; j++) {
                sentence = "";

                for (int k = 0; k < nbWords; k++) {
                    String word = WordList[ran.nextInt(WordNo)];
                    if (k == 0) {
                        word = word.substring(0,1).toUpperCase()+word.substring(1,word.length());
                    }
                    sentence +=" "+word;
                }
                paragraph += sentence+".";
            }
            paragraphs+=paragraph+"\n\n";
        }

        return paragraphs;
    }

    public String getRandomParagraphs() {
        String sentence="",paragraph="",paragraphs="";
        int nbParagraphs = correctZeros(ran.nextInt(10));

        for (int i = 0; i < nbParagraphs; i++) {
            paragraph = "";
            int nbSentences = correctZeros(ran.nextInt(10));

            for (int j = 0; j < nbSentences; j++) {
                sentence = "";
                int nbWords = correctZeros(ran.nextInt(15));

                for (int k = 0; k < nbWords; k++) {
                    String word = WordList[ran.nextInt(WordNo)];
                    if (k == 0) {
                        word = word.substring(0,1).toUpperCase()+word.substring(1,word.length());
                    }
                    sentence +=" "+word;
                }
                paragraph += sentence+".";
            }
            paragraphs+=paragraph+"\n\n";
        }

        return paragraphs;
    }

    private int correctZeros(int number) {
        if (number == 0 || number == 1) {
            number += 2;
        }
        return number;
    }
}
