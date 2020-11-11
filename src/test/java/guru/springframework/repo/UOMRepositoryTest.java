package guru.springframework.repo;

import guru.springframework.domain.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class UOMRepositoryTest {

    @Autowired
    private UOMRepository uomRepository;

    @BeforeEach
    public void setUp() {

    }

    @Test
    void findByDescription() {
        final Optional<UnitOfMeasure> asd = uomRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon", asd.get().getDescription());
    }
}