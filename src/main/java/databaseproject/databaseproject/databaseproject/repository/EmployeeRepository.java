package databaseproject.databaseproject.databaseproject.repository;

import databaseproject.databaseproject.databaseproject.entitiy.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
