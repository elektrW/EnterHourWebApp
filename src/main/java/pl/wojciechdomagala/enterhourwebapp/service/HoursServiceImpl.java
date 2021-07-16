package pl.wojciechdomagala.enterhourwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wojciechdomagala.enterhourwebapp.model.Hours;
import pl.wojciechdomagala.enterhourwebapp.repository.HoursRepository;

import java.util.List;

@Service
public class HoursServiceImpl implements HoursService {

    @Autowired
    private HoursRepository hoursRepository;

    @Override
    public List<Hours> getAllHours() {
        return hoursRepository.findAll();
    }

    @Override
    public void saveHours(Hours hours) {
        this.hoursRepository.save(hours);
    }
}
