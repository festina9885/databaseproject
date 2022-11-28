package databaseproject.databaseproject.databaseproject.service;

import databaseproject.databaseproject.databaseproject.dto.EmployeeDTO;
import databaseproject.databaseproject.databaseproject.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public void save(EmployeeDTO employeeDTO) {

    }
}
