package com.cvt.vaccineDetails.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "vaccineDetails")
    public class VaccineDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vId;

    @NotNull(message = "Vaccine name is mandatory")
    private String vaccineName;

    @NotNull(message = "Dosage name is mandatory")
    private NoOfDosage dosage;

    @NotNull(message = "Date of Administration is mandatory")
    private LocalDate dateOfAdministration;

}
