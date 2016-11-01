package adsfas.asdasd.api.service;

import adsfas.asdasd.model.Dept;
import java.util.List;
import java.util.Set;
import adsfas.asdasd.exception.NotFoundException;

public interface DeptApiService {
  
      List<Dept> findAllDept()
      throws NotFoundException;
  
      Dept updateDept(Dept dept)
      throws NotFoundException;
  
      Dept addDept(Dept dept)
      throws NotFoundException;
  
      Dept findByIdDept(Long id)
      throws NotFoundException;
  
      void deleteDept(Long id)
      throws NotFoundException;
  
}
