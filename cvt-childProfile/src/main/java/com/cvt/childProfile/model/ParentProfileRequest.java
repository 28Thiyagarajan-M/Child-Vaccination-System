package com.cvt.childProfile.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ParentProfileRequest {

    private int parentId;

    private String fatherName;

    private String motherName;

    private String mobile;

    private String mailId;

    @JsonIgnore
    private int childId;
}
