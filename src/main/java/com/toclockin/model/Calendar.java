package com.toclockin.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendar {
    @Id
    private Long id;
    @ManyToOne
    private DateType dateType;
    private String description;
    private LocalDateTime specialDate;
}
