package com.petcare;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class PetController {

	@GetMapping("/")
	public String getIndex(Model model) {
		model.addAttribute("title", "Home");
		return "index";
	}

    @GetMapping("/services")
    public String getServices(Model model) {
        model.addAttribute("title", "Services");
        return "services";
    }

    @GetMapping("/veterinarians")
    public String getVeterinarians(Model model) {
        model.addAttribute("title", "Veterinarians");
        return "veterinarians";
    }

    @GetMapping("/facility")
    public String getFacility(Model model) {
        model.addAttribute("title", "Facility");
        return "facility";
    }

    @GetMapping("/about")
    public String getAbout(Model model) {
        model.addAttribute("title", "About");
        return "about";
    }

}
