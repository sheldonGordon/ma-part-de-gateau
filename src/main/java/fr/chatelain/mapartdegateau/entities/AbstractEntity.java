package fr.chatelain.mapartdegateau.entities;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public abstract class AbstractEntity implements Serializable {

    @Id
    private String id;

    public AbstractEntity() {
        this.id = UUID.randomUUID().toString();
    }
}
