package com.cvt.parentProfile.controllers;


import com.cvt.parentProfile.entity.ParentProfile;
import com.cvt.parentProfile.model.ParentProfileResponse;
import com.cvt.parentProfile.services.ParentProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/parentProfile")
public class ParentProfileController {

    @Autowired
    private ParentProfileService parentProfileService;


    @GetMapping("/")
    public ResponseEntity<List<ParentProfile>> getAll(){
        return new ResponseEntity<>(parentProfileService.getAllParentDetails(),HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<ParentProfile> addParentDetails(@RequestBody ParentProfileResponse parentDetail) throws Exception {
        return new ResponseEntity<>(parentProfileService.saveParentDetails(parentDetail), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ParentProfile> updateParentDetails(@RequestBody ParentProfile parentDetail){
        return new ResponseEntity<>(parentProfileService.updateParentDetails(parentDetail), HttpStatus.OK);
    }

    @DeleteMapping("/{pId}/delete")
    public ResponseEntity<String> deleteParentDetails(@PathVariable int pId){
        return new ResponseEntity<>(parentProfileService.deleteParentDetails(pId), HttpStatus.OK );
    }

    @GetMapping("/{pId}/get")
    public ResponseEntity<ParentProfile> getParentDetails(@PathVariable int pId){
        return new ResponseEntity<>(parentProfileService.findParentDetailsById(pId),HttpStatus.OK);
    }

    @GetMapping("/test")
    public String test(){
        return "From Parent Profile Service...........";
    }



}
