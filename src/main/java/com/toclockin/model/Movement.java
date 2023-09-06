package com.toclockin.model;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movement {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class MovementId implements Serializable{
        private long idMovement;
        private long idUser;
    }

    @EmbeddedId
    private MovementId id;
    private LocalDateTime dateEntry;
    private LocalDateTime dateLeft;
    private BigDecimal period;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private Calendar calendar;
}
