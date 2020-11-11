package guru.springframework.domain;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryTest {
    Category category;

    @BeforeEach
    public void setUp() {
        category = new Category();
    }


    @Test
    void getId() {
        category.setId(1l);
        assertEquals(1l, category.getId());
    }

    @Test
    void getDescription() {
        category.setDescription("Descr");
        assertEquals("Descr", category.getDescription());
    }

    @Test
    void getRecipes() {
    }
}