package com.cvt.vaccineDetails.controllers;


import com.cvt.vaccineDetails.entity.VaccineDetails;
import com.cvt.vaccineDetails.services.VaccineDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vaccine")
public class CvtVaccineDetailsController {

    @Autowired
    private VaccineDetailsService vaccineDetailsService;
    @GetMapping("/")
    public ResponseEntity<List<VaccineDetails>> getAllVaccineDetails(){
        return new ResponseEntity<>(vaccineDetailsService.getAllVaccineDetails(), HttpStatus.OK);
    }

    @GetMapping("/{vId}")
    public ResponseEntity<VaccineDetails> getVaccineDetailsById(@PathVariable int vId){
        return new ResponseEntity<>(vaccineDetailsService.findVaccineDetailsById(vId),HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<VaccineDetails> addVaccineDetails(@RequestBody VaccineDetails vaccineDetails) throws Exception {
        return new ResponseEntity<>(vaccineDetailsService.saveVaccineDetails(vaccineDetails),HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<VaccineDetails> updateVaccineDetails(@RequestBody VaccineDetails vaccineDetails){
        return new ResponseEntity<>(vaccineDetailsService.updateVaccineDetails(vaccineDetails),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{vId}")
    public String deleteVaccineDetails(@PathVariable int vId){
        return vaccineDetailsService.deleteVaccineDetails(vId);
    }

}
