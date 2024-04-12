package com.cvt.parentProfile.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "parent_profile")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int parentId;

    @NotNull(message = "Father Name cannot be empty!")
    private String fatherName;


    @NotNull(message = "Mother Name cannot be empty!")
    private String motherName;

    @NotNull(message = "Mobile number must be 10 digits")
    private String mobile;

    @NotNull(message = "Mail Id cannot be empty!")
    private String mailId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "pId")
    private Set<ChildProfileHolder> children;

}

