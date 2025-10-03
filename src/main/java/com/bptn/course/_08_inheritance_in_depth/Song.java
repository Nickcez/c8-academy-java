package com.bptn.course._08_inheritance_in_depth;


public class Song {

    //add a static variable to count how many times the verse method is called
    public static int verseCounter = 0;
    //update the method to increment the counter

    public static void printVerseCounter() {
        System.out.println("Verse counter: " + verseCounter);
    }
    public static void verse(String animal, String noise) {
        System.out.println( "Old MacDonald had a farm" );
        System.out.println( "E-I-E-I-O" );
        System.out.println( "And on that farm he had a " + animal );
        System.out.println( "E-I-E-I-O" );
        System.out.println( "With a " + noise + "-" + noise + " here") ;
        System.out.println( "And a " + noise + "-" + noise + " there" );
        System.out.println( "Here a " + noise + ", there a " + noise );
        System.out.println( "Everywhere a " + noise + "-" + noise );
        System.out.println( "Old MacDonald had a farm" );
        System.out.println( "E-I-E-I-O" );

        //increment the counter value
        verseCounter++;
    }

    public static void main(String[] args) {
        verse( "cow" , "moo" );
        verse( "duck" , "quack" );
        //add two more verses
        verse("yuck ", "aaa");
        verse("yuck ", "aaa");
        //print the counter value
        Song.printVerseCounter();

    }
}
