package az.millisoft.holiday.mapper;

import az.millisoft.holiday.dto.ContactRequest;
import az.millisoft.holiday.entities.Contact;
import org.springframework.stereotype.Component;

@Component
public class ContactMapper {

    public Contact toEntity(ContactRequest contactRequest){
        return Contact.builder()
                .name(contactRequest.getName())
                .email(contactRequest.getEmail())
                .subject(contactRequest.getSubject())
                .message(contactRequest.getMessage())
                .build();
    }

}
