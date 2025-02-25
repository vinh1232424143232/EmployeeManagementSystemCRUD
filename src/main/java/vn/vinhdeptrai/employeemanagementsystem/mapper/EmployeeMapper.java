package vn.vinhdeptrai.employeemanagementsystem.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import vn.vinhdeptrai.employeemanagementsystem.dto.request.EmployeeRequest;
import vn.vinhdeptrai.employeemanagementsystem.dto.response.EmployeeResponse;
import vn.vinhdeptrai.employeemanagementsystem.entity.Employee;
@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee toEmployee(EmployeeRequest employeeRequest);
    EmployeeResponse toEmployeeResponse(Employee employee);
    void updateEmployee(@MappingTarget  Employee employee, EmployeeRequest employeeRequest);
}
