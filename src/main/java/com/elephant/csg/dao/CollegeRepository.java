package com.elephant.csg.dao;

import com.elephant.csg.entity.College;
import com.elephant.csg.entity.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by smuthusa on 7/9/2016.
 */
public interface CollegeRepository extends CrudRepository<College, Long> {

}
