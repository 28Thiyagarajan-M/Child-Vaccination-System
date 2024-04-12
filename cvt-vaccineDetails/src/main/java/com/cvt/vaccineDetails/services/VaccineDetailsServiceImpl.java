package com.cvt.vaccineDetails.services;

import com.cvt.vaccineDetails.entity.VaccineDetails;
import com.cvt.vaccineDetails.repos.VaccineDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineDetailsServiceImpl implements VaccineDetailsService{

    @Autowired
    private VaccineDetailsRepository vaccineDetailsRepository;


    @Override
    public List<VaccineDetails> getAllVaccineDetails() {
        return vaccineDetailsRepository.findAll();
    }

    @Override
    public VaccineDetails saveVaccineDetails(VaccineDetails vaccineDetails) throws Exception {
        return vaccineDetailsRepository.save(vaccineDetails);
    }

    @Override
    public VaccineDetails updateVaccineDetails(VaccineDetails vaccineDetails) {
        return vaccineDetailsRepository.save(vaccineDetails);
    }

    @Override
    public String deleteVaccineDetails(int vId) {
        vaccineDetailsRepository.deleteById(vId);
        return "Successfully deleted the vaccine details by Id: "+vId;
    }

    @Override
    public VaccineDetails findVaccineDetailsById(int id) {
        return vaccineDetailsRepository.findById(id).orElse(null);
    }
}
