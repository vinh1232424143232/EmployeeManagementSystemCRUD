package vn.vinhdeptrai.employeemanagementsystem.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.vinhdeptrai.employeemanagementsystem.entity.Employee;
@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long> {

}
