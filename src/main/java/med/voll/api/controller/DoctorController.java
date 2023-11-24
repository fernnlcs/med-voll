package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.dto.DoctorForm;

@RestController
@RequestMapping("doctors")
public class DoctorController {

    @GetMapping
    public void listAll() {
        System.out.println("Got all ;)");
    }

    @PostMapping
    public void create(@RequestBody DoctorForm body) {
        System.out.println(body);
    }
    
}
