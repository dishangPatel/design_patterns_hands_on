package design_pattern.structural.adapter;


interface EnglishSpeaker {
    public void speakEnglish(String message);
}

class FrenchTranslator implements EnglishSpeaker {

    FrenchSpeaker frenchSpeaker;

    public FrenchTranslator(FrenchSpeaker speaker) {
        frenchSpeaker = speaker;
    }

    public void speakEnglish(String message) {
        System.out.println("Speaking in english " + message);
        String frenchMessage = convertEnglishToFrench(message);
        frenchSpeaker.speakFrench(frenchMessage);
    }

    String convertEnglishToFrench(String message) {
        System.out.println("Converting english to french ....");

        return switch (message) {
            case "Hello" -> "Bounjour";
            case "Good morning" -> "Bon matin";
            case "Bye" -> "Au revoir";
            default -> "Some french message";
        };
    }
}

class GermanTranslator implements EnglishSpeaker {

    GermanSpeaker germanSpeaker;

    public GermanTranslator(GermanSpeaker speaker) {
        germanSpeaker = speaker;
    }

    public void speakEnglish(String message) {
        System.out.println("Speaking in english " + message);
        String frenchMessage = convertEnglishToGerman(message);
        germanSpeaker.speakGerman(frenchMessage);
    }

    String convertEnglishToGerman(String message) {
        System.out.println("Converting english to german ....");

        return switch (message) {
            case "Hello" -> "Hallo";
            case "Good morning" -> "Guten Morgen";
            case "Bye" -> "Tschüss";
            default -> "Some german message";
        };
    }
}

class EnglishClient {

    EnglishSpeaker englishSpeaker;

    public EnglishClient(EnglishSpeaker speaker) {
        englishSpeaker = speaker;
    }

    public void converse(String message) {
        englishSpeaker.speakEnglish(message);
    }
}

public class AdapterRunner {

    public static void main(String[] args) {

        FrenchSpeaker frenchSpeaker = new FrenchSpeaker();
        GermanSpeaker germanSpeaker = new GermanSpeaker();

        EnglishSpeaker frenchTranslator = new FrenchTranslator(frenchSpeaker);
        EnglishSpeaker germanTranslator = new GermanTranslator(germanSpeaker);

        EnglishClient client = new EnglishClient(frenchTranslator);
        client.converse("Hello");

        EnglishClient client2 = new EnglishClient(germanTranslator);
        client2.converse("Hello");
    }

}
