package org.example.proyecto.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="truncks")
@Getter
@Setter
@NoArgsConstructor
public class TrunckEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_stop_parking")
    private String idStopParking;

    @Column(name = "capacity")
    private String capacity;

}
