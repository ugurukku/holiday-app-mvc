package az.millisoft.holiday.services.impl;

import az.millisoft.holiday.entities.Hotel;
import az.millisoft.holiday.repositories.HotelRepository;
import az.millisoft.holiday.services.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepository repository;

    @Override
    public List<Hotel> getAll() {
        return repository.findAll();
    }
}
