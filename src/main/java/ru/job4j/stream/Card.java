package ru.job4j.stream;

import java.util.List;
import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {

        List<Card> list = List.of(
                new Card(Suit.Diamonds, Value.V_6),
                new Card(Suit.Hearts, Value.V_6),
                new Card(Suit.Spades, Value.V_6),
                new Card(Suit.Clubs, Value.V_6)
        );

        Stream.of(Suit.values())
                .forEach(System.out::println);
    }
}