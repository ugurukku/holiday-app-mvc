package az.millisoft.holiday.repositories;

import az.millisoft.holiday.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
