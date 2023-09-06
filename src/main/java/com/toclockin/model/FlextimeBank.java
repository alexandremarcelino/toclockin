package com.toclockin.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
public class FlextimeBank {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class FlextimeBankId implements Serializable{
        private long idFlextimeBank;
        private long idMovement;
        private long idUser;
    }

    @EmbeddedId
    private FlextimeBankId id;
    private LocalDateTime workDate;
    private BigDecimal amountHours;
    private BigDecimal hoursBalance;
}
