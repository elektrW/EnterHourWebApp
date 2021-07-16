package pl.wojciechdomagala.enterhourwebapp.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wojciechdomagala.enterhourwebapp.model.Employee;
import pl.wojciechdomagala.enterhourwebapp.model.Hours;
import pl.wojciechdomagala.enterhourwebapp.service.EmployeeService;
import pl.wojciechdomagala.enterhourwebapp.service.HoursService;

@Controller
public class HoursController {

    @Autowired
    private HoursService hoursService;

    //display employee hours
    @GetMapping("/showHoursForEmployee")
    public String showHoursForEmployee(Model model) {
        model.addAttribute("employee_hours", hoursService.getAllHours());
        return "hours_employee";
    }

    @GetMapping("/showNewEmployeeHoursForm")
    public String showNewEmployeeHoursForm(Model model) {
        Hours hours = new Hours();
        model.addAttribute("hours", hours);
        return "new_hours";
    }

    @PostMapping("/saveHours")
    public String saveEmployee(@ModelAttribute("hours") Hours hours) {
        //save employee to database
        hoursService.saveHours(hours);
        return "redirect:/showHoursForEmployee";
    }

}
