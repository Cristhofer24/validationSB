package com.itsqmet.historialClinica.Controller;

import com.itsqmet.historialClinica.Entidad.Entidad;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;
@org.springframework.stereotype.Controller
public class Controller {


    @GetMapping("/Formulario")
    public String index(Model model){

        model.addAttribute("paciente", new Entidad());

        return "Pages/formulario";
    }

    @PostMapping("/Historial")
    public String registroEmpleado(@Valid @ModelAttribute("paciente") Entidad paciente,
                                   BindingResult bindingResult , Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errores", bindingResult.getAllErrors());

            return "Pages/formulario";
        } else {

            return "Pages/historial";
        }
    }
}
