package com.cvt.childProfile.repos;

import com.cvt.childProfile.entity.ChildProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;


@RestController
public interface ChildProfileRepository extends JpaRepository<ChildProfile, Integer> {

}
