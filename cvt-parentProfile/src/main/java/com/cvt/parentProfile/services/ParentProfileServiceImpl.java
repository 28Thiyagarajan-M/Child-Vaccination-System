package com.cvt.parentProfile.services;

import com.cvt.parentProfile.entity.ChildProfileHolder;
import com.cvt.parentProfile.entity.ParentProfile;
import com.cvt.parentProfile.model.ParentProfileResponse;
import com.cvt.parentProfile.repository.ParentProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;


@Service
public class ParentProfileServiceImpl implements ParentProfileService {

    @Autowired
    private ParentProfileRepository parentDetailsRepo;

    @Override
    public List<ParentProfile> getAllParentDetails() {
        return parentDetailsRepo.findAll();
    }




    @Override
    public ParentProfile saveParentDetails(ParentProfileResponse parentProfileResponse) throws Exception {
        if (!parentDetailsRepo.existsById(parentProfileResponse.getParentId())) {
            ChildProfileHolder childProfileResponse = ChildProfileHolder.builder()
                    .childId(parentProfileResponse.getChildId()).build();

            HashSet<ChildProfileHolder> hashSet = new HashSet<>();
            hashSet.add(childProfileResponse);
            ParentProfile parentProfile = ParentProfile.builder()
                    .parentId(parentProfileResponse.getParentId())
                    .mailId(parentProfileResponse.getMailId())
                    .mobile(parentProfileResponse.getMobile())
                    .motherName(parentProfileResponse.getMotherName())
                    .fatherName(parentProfileResponse.getFatherName())
                    .children(new HashSet<ChildProfileHolder>(hashSet))
                    .build();
            return parentDetailsRepo.save(parentProfile);
        }

        return null;


    }

    @Override
    public ParentProfile updateParentDetails(ParentProfile parentProfile) {
        return parentDetailsRepo.save(parentProfile);
    }

    @Override
    public String deleteParentDetails(int pId) {
        parentDetailsRepo.deleteById(pId);
        return "Successfully deleted the profile details for the given ProfileId: " + pId;
    }

    @Override
    public ParentProfile findParentDetailsById(int id) {
        ParentProfile parentDetail = parentDetailsRepo.findById(id).orElse(null);
        return parentDetail != null ? parentDetail : null;
    }
}
