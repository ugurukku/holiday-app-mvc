package az.millisoft.holiday.repositories;

import az.millisoft.holiday.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
