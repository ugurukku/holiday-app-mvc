package az.millisoft.holiday.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ContactRequest {

    String name;
    String email;
    String subject;
    String message;

}
