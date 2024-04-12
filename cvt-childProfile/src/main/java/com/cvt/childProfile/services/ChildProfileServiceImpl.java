package com.cvt.childProfile.services;

import com.cvt.childProfile.entity.ChildProfile;
import com.cvt.childProfile.feignclient.ParentProfileClient;
import com.cvt.childProfile.model.ChildProfileRequest;
import com.cvt.childProfile.repos.ChildProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildProfileServiceImpl implements ChildProfileService {

    @Autowired
    private ChildProfileRepository childProfileRepository;

    @Autowired
    private ParentProfileClient parentProfileClient;


    @Override
    public List<ChildProfile> getAllChildProfile() {
        return childProfileRepository.findAll();
    }

    @Override
    public ChildProfile saveChildProfile(ChildProfileRequest childProfileRequest) throws Exception {
        if (childProfileRepository.existsById(childProfileRequest.getChildId())) {
            throw new Exception("Child details already exist with the given id : " + childProfileRequest.getChildId());
        }

        ChildProfile childProfile = ChildProfile.builder()
                .childId(childProfileRequest.getChildId())
                .childName(childProfileRequest.getChildName())
                .gender(childProfileRequest.getGender())
                .dateOfBirth(childProfileRequest.getDateOfBirth())
                .build();

        childProfileRequest.getParentProfileRequest().setChildId(childProfileRequest.getChildId());

        parentProfileClient.addParentProfile(childProfileRequest.getParentProfileRequest());

        return childProfileRepository.save(childProfile);
    }

    @Override
    public ChildProfile updateChildProfile(int cId, ChildProfile childDetails) {
        if (!childProfileRepository.existsById(cId)) {
            throw new IllegalArgumentException("Child details does not exist with the given id : " + cId);
        }
        return childProfileRepository.save(childDetails);
    }

    @Override
    public String deleteChildProfile(int cId) {
        childProfileRepository.deleteById(cId);
        return "Successfully deleted the child profile for the given id : " + cId;
    }

    @Override
    public ChildProfile findChildProfileById(int id) {
        ChildProfile cProfile = childProfileRepository.findById(id).orElse(null);
        return cProfile;
    }
}
