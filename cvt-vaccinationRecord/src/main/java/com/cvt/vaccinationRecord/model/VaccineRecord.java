package com.cvt.vaccinationRecord.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class VaccineRecord {

   private int vaccinationRecordId;

   private ParentProfileModel parentProfileModel;

}
