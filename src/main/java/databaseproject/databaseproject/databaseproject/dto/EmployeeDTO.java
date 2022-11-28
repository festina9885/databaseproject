package databaseproject.databaseproject.databaseproject.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDTO {
    private Long employeeNum;
    private String id;
    private String pwd;
    private String name;
    private String resident;
    private String education;
    private String role;
    private Integer career;
    private String rank;
    private Integer boolManage;

}
