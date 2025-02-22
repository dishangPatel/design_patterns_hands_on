package design_pattern.structural.flyweight;

import java.util.HashMap;

public interface ICharSet {
    public void display(int r,int c);
}

class CharacterA implements ICharSet {
    char symbol;

    public CharacterA(char symbol) {
        this.symbol = symbol;
    }

    public void display(int r,int c) {
        System.out.println("Displaying character " + symbol + " at row " + r + " column " + c);
    }
}


class CharacterB implements ICharSet {
    char symbol;

    public CharacterB(char symbol) {
        this.symbol = symbol;
    }

    public void display(int r,int c) {
        System.out.println("Displaying character " + symbol + " at row " + r + " column " + c);
    }
}


class CharacterFactory{

    static HashMap<Character,ICharSet> cachedICharSets = new HashMap<Character,ICharSet>();

    public static ICharSet getCharSet(Character symbol) {
        if (cachedICharSets.containsKey(symbol)) {
            return cachedICharSets.get(symbol);
        }

        if (symbol == 'A') {
            ICharSet iCharSet = new CharacterA('A');
            cachedICharSets.put(symbol, iCharSet);

        } else if (symbol == 'B') {
            ICharSet iCharSet = new CharacterA('B');
            cachedICharSets.put(symbol, iCharSet);
        }

        return cachedICharSets.get(symbol);
    }

}


