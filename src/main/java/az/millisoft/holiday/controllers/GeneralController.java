package az.millisoft.holiday.controllers;

import az.millisoft.holiday.dto.ContactRequest;
import az.millisoft.holiday.services.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class GeneralController {

    private final HotelService hotelService;

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView index = new ModelAndView("index");
        index.addObject("hotels",hotelService.getAll());
        return index;
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/contact")
    public ModelAndView contact(){
        ModelAndView modelAndView = new ModelAndView("contact");
        modelAndView.addObject("contactRequest",new ContactRequest());
        return modelAndView;
    }

    @GetMapping("/tours")
    public String tours(){
        return "tours";
    }

}
