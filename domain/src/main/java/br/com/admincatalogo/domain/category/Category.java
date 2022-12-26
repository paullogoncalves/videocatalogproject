package br.com.admincatalogo.domain.category;

import br.com.admincatalogo.domain.AggregateRoot;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
public class Category extends AggregateRoot<CategoryID> {

    private  String name;
    private  String description;
    private  boolean active;
    private  Instant createdAt;
    private  Instant updatedAt;
    private  Instant deletedAt;

    private Category(
            final CategoryID id,
            final String name,
            final String description,
            final boolean active,
            final Instant createdAt,
            final Instant updatedAt,
            final Instant deletedAt) {
        super(id);
        this.name = name;
        this.description = description;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public CategoryID getId(){
        return id;
    }
    public static Category newCategory(final String aName, final String aDescription, final boolean aIsActive){
        final var uuid = CategoryID.unique();
        final var instantNow = Instant.now();
        return new Category(uuid, aName, aDescription, aIsActive, instantNow, instantNow, null);
    }
}