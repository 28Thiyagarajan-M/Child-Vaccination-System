package com.cvt.childProfile.controllers;

import com.cvt.childProfile.entity.ChildProfile;
import com.cvt.childProfile.feignclient.ParentProfileClient;
import com.cvt.childProfile.model.ChildProfileRequest;
import com.cvt.childProfile.services.ChildProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/childProfile")
@RestController
public class ChildProfileController {

    @Autowired
    private ChildProfileService childProfileService;

    @Autowired
    private ParentProfileClient parentProfileClient;


    @GetMapping("/")
    public ResponseEntity<List<ChildProfile>> getAllChildProfile(){
        return new ResponseEntity<>(childProfileService.getAllChildProfile(), HttpStatus.OK);
    }

    @GetMapping("/{cId}")
    public ResponseEntity<ChildProfile> getChildProfileById(@PathVariable int cId){
        return new ResponseEntity<>(childProfileService.findChildProfileById(cId), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ChildProfile> addChildProfile(@RequestBody ChildProfileRequest childProfileRequest) throws Exception {
        return new ResponseEntity<>(childProfileService.saveChildProfile(childProfileRequest), HttpStatus.OK);
    }


    @PutMapping("/{cId}/update")
    public ResponseEntity<ChildProfile> updateChildProfile(@PathVariable int cId, @RequestBody ChildProfile childProfile) throws Exception {
        return new ResponseEntity<>(childProfileService.updateChildProfile(cId, childProfile), HttpStatus.OK);
    }

    @DeleteMapping("/{cId}/delete")
    public ResponseEntity<String> deleteChildProfile(@PathVariable int cId) throws Exception {
        return new ResponseEntity<>(childProfileService.deleteChildProfile(cId), HttpStatus.OK );
    }

    @GetMapping("/parentProfile/test")
    public String test(){
        return parentProfileClient.t();
    }
}
