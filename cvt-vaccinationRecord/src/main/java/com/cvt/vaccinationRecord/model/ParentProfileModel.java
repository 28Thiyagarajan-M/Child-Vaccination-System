package com.cvt.vaccinationRecord.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class ParentProfileModel {

    private int pId;

    private String fatherName;

    private String motherName;

    private String mobile;

    private String mailId;


    private Set<ChildProfileModel> childProfileModel;

}
