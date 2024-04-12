package com.cvt.vaccineDetails.services;

import com.cvt.vaccineDetails.entity.VaccineDetails;

import java.util.List;

public interface VaccineDetailsService {

    public List<VaccineDetails> getAllVaccineDetails();

    public VaccineDetails saveVaccineDetails(VaccineDetails vaccineDetails) throws Exception;

    public VaccineDetails updateVaccineDetails(VaccineDetails vaccineDetails);

    public String deleteVaccineDetails(int vId);

    public VaccineDetails findVaccineDetailsById(int id);
}
