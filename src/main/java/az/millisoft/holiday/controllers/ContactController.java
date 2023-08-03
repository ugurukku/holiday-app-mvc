package az.millisoft.holiday.controllers;

import az.millisoft.holiday.dto.ContactRequest;
import az.millisoft.holiday.services.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/contacts")
public class ContactController {

    private final ContactService service;

    @GetMapping
    @ResponseBody
    public String test(){
        return "test";
    }

    @PostMapping
    public RedirectView add(@ModelAttribute ContactRequest contactRequest){
        service.add(contactRequest);
        return new RedirectView("/contact?success");
    }
}
