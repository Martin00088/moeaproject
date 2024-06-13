package org.example.proyecto.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TrunckDto {
        private Integer idStopDeparture;
        private Integer idStopArrival;
        private String category;
        private String pickupTime;
        private String idStopParking;
        private String capacity;
        private Integer id;



        // Constructor con todos los campos
        public TrunckDto(Integer idStopDeparture, Integer idStopArrival, String category, String pickupTime, String idStopParking, String capacity, Integer id) {
            this.idStopDeparture = idStopDeparture;
            this.idStopArrival = idStopArrival;
            this.category = category;
            this.pickupTime = pickupTime;
            this.idStopParking = idStopParking;
            this.capacity = capacity;
            this.id = id;
        }


    }
