package com.cvt.parentProfile.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChildProfileHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int childId;
}
