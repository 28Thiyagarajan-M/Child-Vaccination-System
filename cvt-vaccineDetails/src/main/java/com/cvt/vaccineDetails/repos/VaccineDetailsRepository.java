package com.cvt.vaccineDetails.repos;

import com.cvt.vaccineDetails.entity.VaccineDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineDetailsRepository extends JpaRepository<VaccineDetails, Integer> {
}
