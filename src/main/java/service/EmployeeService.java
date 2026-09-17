package service;
import model.Employee;
import repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;
    public List<Employee> getAll() { return repo.findAll(); }
    public void save(Employee emp) { repo.save(emp); }
    public long count() { return repo.count(); }
    public void delete(Long id) { repo.deleteById(id); }
}