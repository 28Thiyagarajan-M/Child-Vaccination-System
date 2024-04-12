package com.cvt.vaccinationRecord.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ChildProfileModel {

    private int cId;

    private String childName;

    private LocalDate dateOfBirth;

    private Gender gender;

    private Set<VaccineDetailsModel> vaccineDetailsModel;
}
