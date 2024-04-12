package com.cvt.childProfile.services;

import com.cvt.childProfile.entity.ChildProfile;
import com.cvt.childProfile.model.ChildProfileRequest;

import java.util.List;

public interface ChildProfileService {

    public List<ChildProfile> getAllChildProfile();
    public ChildProfile saveChildProfile(ChildProfileRequest childProfileRequest) throws Exception;
    public ChildProfile updateChildProfile(int cId, ChildProfile childDetails);
    public String deleteChildProfile(int cId);
    public ChildProfile findChildProfileById(int id);


}
