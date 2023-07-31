
package com.mycompany.speakerexample;

public class SpeakerExample {

    public static void main(String[] args) {
        Speaker politician = new Politician();
        Speaker lecturer = new Lecturer();
        Speaker priest = new Priest();

        System.out.println("Politician speaking:");
        politician.speak();

        System.out.println("\nLecturer speaking:");
        lecturer.speak();

        System.out.println("\nPriest speaking:");
        priest.speak();
    }
}

    
