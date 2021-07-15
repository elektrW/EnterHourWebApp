package pl.wojciechdomagala.enterhourwebapp.service;

import pl.wojciechdomagala.enterhourwebapp.model.Hours;

import java.util.List;

public interface HoursService {
    List<Hours> getAllHours();
    void saveHours (Hours hours);
}
