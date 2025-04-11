package guru.springframework.spring6resttemplate.client;

import guru.springframework.spring6resttemplate.model.BeerStyle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeerClientImplTest {

    @Autowired
    BeerClient beerClient;

    @Test
    void listBeersNoValues() {
        beerClient.listBeers();
    }

    @Test
    void listBeers() {
        beerClient.listBeers("Caldera", BeerStyle.ALE, false, 0, 3);
    }
}