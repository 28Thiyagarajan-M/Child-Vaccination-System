package com.cvt.childProfile.model;

import com.cvt.childProfile.entity.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChildProfileRequest {

    private int childId;

    private String childName;

    private Gender gender;

    private LocalDate dateOfBirth;

    private ParentProfileRequest parentProfileRequest;
}
