package es.dgc.gesco.model.commom.db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * Standard entity that provides a state field and no predefined ID.
 */
@MappedSuperclass
@Getter
@Setter
public abstract class StandardEntity extends BaseEntity implements StatefulEntity {


    @Column(name = "ID_STATE", nullable = false)
    @Setter
    private Integer state = 1;

    @Override
    public String toString() {
        return "state=" + state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StandardEntity)) return false;
        StandardEntity that = (StandardEntity) o;
        return Objects.equals(getId(), that.getId())
                && Objects.equals(getState(), that.getState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getState());
    }
}
