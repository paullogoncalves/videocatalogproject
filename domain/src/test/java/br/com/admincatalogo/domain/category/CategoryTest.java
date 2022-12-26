package br.com.admincatalogo.domain.category;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void testNewCategory(){
        final var expectedName = "Filmes";
        final var expectedDecription = "filme de acão";
        final var expectedIsActive = true;
        final var actualCategory =
                Category.newCategory(expectedName, expectedDecription, expectedIsActive);
        assertNotNull(actualCategory.getId());
        assertEquals(expectedName, actualCategory.getName());
        assertEquals(expectedDecription, actualCategory.getDescription());
        assertEquals(expectedIsActive, actualCategory.isActive());
        assertNotNull(actualCategory.getCreatedAt());
        assertNotNull(actualCategory.getUpdatedAt());
        assertNull(actualCategory.getDeletedAt());
    }
}