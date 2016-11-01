package adsfas.asdasd.model.repository;

import adsfas.asdasd.model.*;

import java.util.Date;
import adsfas.asdasd.model.Dept;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface EmpRepository extends JpaRepository<Emp, Long>{

}



