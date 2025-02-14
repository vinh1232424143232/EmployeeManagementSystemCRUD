package vn.vinhdeptrai.employeemanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.vinhdeptrai.employeemanagementsystem.dto.request.EmployeeRequest;
import vn.vinhdeptrai.employeemanagementsystem.dto.response.EmployeeResponse;
import vn.vinhdeptrai.employeemanagementsystem.entity.Employee;
import vn.vinhdeptrai.employeemanagementsystem.exception.AppException;
import vn.vinhdeptrai.employeemanagementsystem.exception.ErrorCode;
import vn.vinhdeptrai.employeemanagementsystem.mapper.EmployeeMapper;
import vn.vinhdeptrai.employeemanagementsystem.respository.EmployeeRespository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRespository employeeRepository;
    @Autowired
    private EmployeeMapper employeeMapper;
    public EmployeeResponse createEmployee(EmployeeRequest employeeRequest){
        Employee employee = employeeMapper.toEmployee(employeeRequest);
        employeeRepository.save(employee);
        return employeeMapper.toEmployeeResponse(employee);
    }
    public List<EmployeeResponse> getAllEmployees(){
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(employee -> employeeMapper.toEmployeeResponse(employee)).toList();
    }
    public EmployeeResponse getEmployeeById(Long employeeId){
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new AppException(ErrorCode.USER_NOT_EXISTED));
        return employeeMapper.toEmployeeResponse(employee);
    }
    public EmployeeResponse updateEmployee(Long employeeId, EmployeeRequest employeeRequest){
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new AppException(ErrorCode.USER_NOT_EXISTED)
        );
        employeeMapper.updateEmployee(employee, employeeRequest);

    }
}
