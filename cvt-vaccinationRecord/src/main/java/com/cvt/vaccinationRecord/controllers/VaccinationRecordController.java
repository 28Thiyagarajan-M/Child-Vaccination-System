package com.cvt.vaccinationRecord.controllers;


import com.cvt.vaccinationRecord.model.VaccineRecord;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaccinationRecordController {

    @PostMapping("/")
    public ResponseEntity<VaccineRecord> home(@RequestBody VaccineRecord vaccineRecord) {
        return new ResponseEntity<>(vaccineRecord, HttpStatus.OK);
    }
}
