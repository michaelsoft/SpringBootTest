package com.michaelsoft.springboottest.repository;

import com.michaelsoft.springboottest.entity.*;
import org.springframework.data.jpa.repository.*;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}