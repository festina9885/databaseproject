package databaseproject.databaseproject.databaseproject.entitiy;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "employee")
public class EmployeeEntity {
    @Id //pk 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_incremet
    private  Long employeeNum;

    @Column(unique = true) // unique 제약조건 추가
    private String id;

    @Column
    private String pwd;

    @Column
    private String name;

    @Column
    private String resident;

    @Column
    private String education;

    @Column
    private String role;

    @Column
    private Integer career;

    @Column
    private String rank;

    @Column
    private Integer boolManage;





}
