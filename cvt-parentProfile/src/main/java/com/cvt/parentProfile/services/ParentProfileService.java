package com.cvt.parentProfile.services;

import com.cvt.parentProfile.entity.ParentProfile;
import com.cvt.parentProfile.model.ParentProfileResponse;

import java.util.List;

public interface ParentProfileService {

    public List<ParentProfile> getAllParentDetails();
    public ParentProfile saveParentDetails(ParentProfileResponse parentProfile) throws Exception;
    public ParentProfile updateParentDetails(ParentProfile parentProfile);
    public String deleteParentDetails(int pId);
    public ParentProfile findParentDetailsById(int id);

}
