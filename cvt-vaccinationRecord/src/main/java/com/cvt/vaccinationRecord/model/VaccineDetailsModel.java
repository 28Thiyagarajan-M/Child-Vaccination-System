package com.cvt.vaccinationRecord.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class VaccineDetailsModel {

    private int vId;

    private String vaccineName;

    private LocalDate dateOfAdministration;

}
