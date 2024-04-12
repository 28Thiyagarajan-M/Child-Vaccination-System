package com.cvt.childProfile.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "childprofile")
public class ChildProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int childId;

    @NotNull(message = "Child Name cannot be empty!")
    private String childName;

    @NotNull(message = "Gender cannot be empty!")
    private Gender gender;

    @NotNull(message = "Date of Birth cannot be empty!")
    private LocalDate dateOfBirth;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "cId")
    private Set<VaccineHolder> vaccineHolder;

}
