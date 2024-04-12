package com.cvt.parentProfile.repository;

import com.cvt.parentProfile.entity.ParentProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentProfileRepository extends JpaRepository<ParentProfile, Integer> {

}
