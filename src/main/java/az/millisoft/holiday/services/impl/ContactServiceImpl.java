package az.millisoft.holiday.services.impl;

import az.millisoft.holiday.dto.ContactRequest;
import az.millisoft.holiday.mapper.ContactMapper;
import az.millisoft.holiday.repositories.ContactRepository;
import az.millisoft.holiday.services.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository repository;

    private final ContactMapper mapper;


    @Override
    public void add(ContactRequest contactRequest) {
        repository.save(mapper.toEntity(contactRequest));
    }
}
