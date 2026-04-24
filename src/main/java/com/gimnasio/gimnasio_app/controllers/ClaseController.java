package com.gimnasio.gimnasio_app.controllers;

import com.gimnasio.gimnasio_app.entity.Clase;
import com.gimnasio.gimnasio_app.services.ClaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clases")
public class ClaseController {
    
    @Autowired
    private ClaseService claseService;
    
    // Mostrar listado de clases
    @GetMapping
    public String listarClases(Model model) {
        model.addAttribute("clases", claseService.listarTodas());
        return "clases/lista";
    }
    
    // Mostrar formulario para crear nueva clase
    @GetMapping("/nueva")
    public String mostrarFormularioNuevaClase(Model model) {
        model.addAttribute("clase", new Clase());
        return "clases/formulario";
    }
    
    // Guardar nueva clase (POST)
    @PostMapping("/guardar")
    public String guardarClase(@ModelAttribute Clase clase) {
        claseService.guardar(clase);
        return "redirect:/clases";
    }
}