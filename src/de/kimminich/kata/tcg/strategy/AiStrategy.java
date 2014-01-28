package de.kimminich.kata.tcg.strategy;

import de.kimminich.kata.tcg.Card;

import java.util.List;
import java.util.Optional;

public class AiStrategy implements Strategy {

    @Override
    public Optional<Card> nextCard(int mana, List<Card> availableCards) {
        return Optional.empty();
    }
}