package pl.wojciechdomagala.enterhourwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wojciechdomagala.enterhourwebapp.model.Employee;
import pl.wojciechdomagala.enterhourwebapp.model.Hours;
import pl.wojciechdomagala.enterhourwebapp.repository.HoursRepository;

import java.util.List;
import java.util.Optional;

@Service
public class HoursServiceImpl implements HoursService {

    private HoursRepository hoursRepository;

    @Autowired
    public HoursServiceImpl(HoursRepository hoursRepository) {
        this.hoursRepository = hoursRepository;
    }

    @Override
    public List<Hours> getAllHours() {
        return hoursRepository.findAll();
    }

    @Override
    public void saveHours(Hours hours) {
        this.hoursRepository.save(hours);
    }

    @Override
    public Hours getEmployeeHoursById(long id) {
        Optional<Hours> optional = hoursRepository.findById(id);
        Hours hours = null;
        if (optional.isPresent()) {
            hours = optional.get();
        } else {
            throw new RuntimeException("Employee not found for id: " + id);
        }
        return hours;
    }

    @Override
    public void deleteEmployeeHoursById(long id) {
        this.hoursRepository.deleteById(id);
    }
}
