package no.hvl.dat250.di.services;

import no.hvl.dat250.di.domain.Quote;
import no.hvl.dat250.di.entities.QuoteEntity;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FamousQuoteServiceTest {


    @Test
    public void testCorrectOrder() {
        QuoteService service = new FamousQuoteService();
        List<Quote> quotes = service.listQuotes();
        // expects at least two elements
        assertNotEquals(0, quotes.size());
        assertNotEquals(1, quotes.size());
        for (int i = 1; i < quotes.size(); i++) {
            assertTrue(quotes.get(i - 1).getVotes() >= quotes.get(i).getVotes());
        }
    }
}
