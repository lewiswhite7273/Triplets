/*
 * Lewis White
 * February 26, 2019
 * This program will output a random 3 line poem
 */

package triplets;

import java.util.ArrayList;

public class Triplets {
    public static void main(String[] args) {
        //This program will use dynamic arrays
        ArrayList<String> nouns = new ArrayList<String>();
        nouns.add("cat");
        nouns.add("dog");
        nouns.add("horse");
        nouns.add("goat");
        nouns.add("eagle");
        nouns.add("lion");
        nouns.add("giraffe");
        nouns.add("John Cena");

        ArrayList<String> verbs = new ArrayList<String>();
        verbs.add("shat");
        verbs.add("tracked");
        verbs.add("jumped");
        verbs.add("raced");
        verbs.add("ran over");
        verbs.add("tripped");
        verbs.add("smooshed");
        verbs.add("tapped");

        ArrayList<String> rhymingNouns = new ArrayList<String>();
        rhymingNouns.add("bass");
        rhymingNouns.add("mass");
        rhymingNouns.add("sass");
        rhymingNouns.add("gas");
        rhymingNouns.add("glass");
        rhymingNouns.add("grass");
        rhymingNouns.add("brass");
        rhymingNouns.add("trash");

        String noun, verb1, verb2, rhymingNoun1, rhymingNoun2, rhymingNoun3;
        int randomNum;

        //get a random noun from the nouns ArrayList
        //use .size() method to get the # of elements in the ArrayList
        randomNum = (int)(Math.random() * nouns.size());
        noun = nouns.get(randomNum);

        //get the first verb & remove it from the array
        randomNum = (int)(Math.random() * verbs.size());
        verb1 = verbs.get(randomNum);
        verbs.remove(randomNum);

        //get the second verb
        randomNum = (int)(Math.random() * verbs.size());
        verb2 = verbs.get(randomNum);

        //get the three rhyming nouns
        randomNum = (int)(Math.random() * rhymingNouns.size());
        rhymingNoun1 = rhymingNouns.get(randomNum);
        rhymingNouns.remove(randomNum);

        randomNum = (int)(Math.random() * rhymingNouns.size());
        rhymingNoun2 = rhymingNouns.get(randomNum);
        rhymingNouns.remove(randomNum);
        
        randomNum = (int)(Math.random() * rhymingNouns.size());
        rhymingNoun3 = rhymingNouns.get(randomNum);
        

        //Display the poem
        System.out.println("The " + noun + " " + verb1 + " in the " + rhymingNoun1 + "\n" +
                "And then " + verb2 + " it in the " + rhymingNoun2 + "\nIt owns some " + rhymingNoun3);


    }

}

