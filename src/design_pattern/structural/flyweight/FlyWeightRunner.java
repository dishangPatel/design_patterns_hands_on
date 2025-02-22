package design_pattern.structural.flyweight;

public class FlyWeightRunner {
    public static void main(String[] args) {

        CharacterFactory.getCharSet('A').display(1,1);
        CharacterFactory.getCharSet('B').display(1,2);
        CharacterFactory.getCharSet('B').display(1,3);

    }
}
