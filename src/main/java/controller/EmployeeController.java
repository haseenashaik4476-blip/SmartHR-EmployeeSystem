package controller;
import model.Employee;
import service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @GetMapping("/")
    public String dashboard(Model m) {
        m.addAttribute("totalEmployees", service.count());
        return "dashboard";
    }
    @GetMapping("/employees")
    public String list(Model m) {
        m.addAttribute("employees", service.getAll());
        return "employees";
    }
    @GetMapping("/add-employee")
    public String addForm(Model m) {
        m.addAttribute("employee", new Employee());
        return "add-employee";
    }
    @PostMapping("/save-employee")
    public String save(@ModelAttribute Employee emp) {
        service.save(emp);
        return "redirect:/employees";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/employees";
    }
}