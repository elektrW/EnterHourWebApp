package pl.wojciechdomagala.enterhourwebapp.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wojciechdomagala.enterhourwebapp.model.Hours;
import pl.wojciechdomagala.enterhourwebapp.service.HoursService;

@Controller
public class HoursController {


    private HoursService hoursService;

    @Autowired
    public HoursController(HoursService hoursService) {
        this.hoursService = hoursService;
    }

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

    @GetMapping("/showHoursFormForEmployee/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        //get employee from the service
        Hours hours = hoursService.getEmployeeHoursById(id);

        //set employee as a model attribute pre-populate the form
        model.addAttribute("hours", hours);
        return "update_hours";
    }

    @GetMapping("/deleteHours/{id}")
    public String deleteEmployee(@PathVariable (value = "id") long id) {
        //call delete employee method
        this.hoursService.deleteEmployeeHoursById(id);
        return "redirect:/showHoursForEmployee";
    }

}
