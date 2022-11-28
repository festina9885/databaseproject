package databaseproject.databaseproject.databaseproject.controller;

import databaseproject.databaseproject.databaseproject.dto.EmployeeDTO;
import databaseproject.databaseproject.databaseproject.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class EmployeeController {
    // 생성자 주입
    private final EmployeeService employeeService;


    //회원가입 페이지 출력 요청
    @GetMapping("/employee/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/employee/save")
    public String save(@ModelAttribute EmployeeDTO employeeDTO){
        System.out.println("employeeDTO = " + employeeDTO);
        employeeService.save(employeeDTO);

        return "index";
    }

}
