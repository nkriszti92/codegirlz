package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThirdExercise {
    public static void main(String[] args) {
        Deck deck = new Deck(10);
        System.out.println(deck);
    }
}

class Deck{
    static ArrayList<String> colors = new ArrayList<>(Arrays.asList("Hearths", "Spades", "Diamonds", "Clubs"));
    static ArrayList<String> figures = new ArrayList<>(Arrays.asList("Ace","King", "Queen", "Jack","2","3","4","5","6","7","8","9","10"));
    static ArrayList<Card> deckList = new ArrayList<>();

    public Deck(int numberOfCards){
        for (int i = 0; i < colors.size(); i++) {
            for (int j = 0; j < figures.size(); j++) {
                Card actualCard = new Card(colors.get(i),figures.get(j));
                deckList.add(actualCard);
            }
        }

        Collections.shuffle(deckList);

        for (int i = 0; i < 52-numberOfCards; i++) {
            deckList.remove(0);
        }
    }

    @Override
    public String toString() {
        int numberOfHearths=0;
        int numberOfSpades=0;
        int numberOfDiamonds=0;
        int numberOfClubs=0;
        for (int i=0; i<deckList.size();i++){
            switch (deckList.get(i).color){
                case "Hearths": numberOfHearths++;
                    break;
                case "Spades" : numberOfSpades++;
                    break;
                case "Diamonds": numberOfDiamonds++;
                    break;
                case "Clubs" : numberOfClubs++;
                    break;
            }
        }
        return deckList.size()+" cards - "+numberOfClubs+" Clubs, "+numberOfDiamonds+" Diamonds, "+numberOfHearths+" Hearths, "+numberOfSpades+" Spades";
    }
}

class Card{
    String value;
    String color;
    public Card(String color, String value){
        this.value = value;
        this.color = color;
    }
    @Override
    public String toString() {
        return value + " " +color;
    }
}