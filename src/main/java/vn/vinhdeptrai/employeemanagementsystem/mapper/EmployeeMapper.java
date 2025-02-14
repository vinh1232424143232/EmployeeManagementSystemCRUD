package vn.vinhdeptrai.employeemanagementsystem.mapper;

import org.mapstruct.Mapper;
import vn.vinhdeptrai.employeemanagementsystem.dto.request.EmployeeRequest;
import vn.vinhdeptrai.employeemanagementsystem.dto.response.EmployeeResponse;
import vn.vinhdeptrai.employeemanagementsystem.entity.Employee;
@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee toEmployee(EmployeeRequest employeeRequest);
    EmployeeResponse toEmployeeResponse(Employee employee);
    void updateEmployee(Employee employee, EmployeeRequest employeeRequest);
}
