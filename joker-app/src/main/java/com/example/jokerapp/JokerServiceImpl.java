package com.example.jokerapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokerServiceImpl implements JokerService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokerServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoker() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
