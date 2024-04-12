package com.cvt.parentProfile.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ParentProfileResponse {

    private int parentId;

    private String fatherName;

    private String motherName;

    private String mobile;

    private String mailId;

    private int childId;
}
