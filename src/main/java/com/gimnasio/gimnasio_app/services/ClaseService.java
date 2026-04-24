package com.gimnasio.gimnasio_app.services;

import com.gimnasio.gimnasio_app.entity.Clase;
import com.gimnasio.gimnasio_app.repositories.ClaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClaseService {
    
    @Autowired
    private ClaseRepository claseRepository;
    
    public List<Clase> listarTodas() {
        return claseRepository.findAll();
    }
    
    public Clase guardar(Clase clase) {
        // Si es nueva, inicializar plazasDisponibles = aforoMaximo
        if (clase.getPlazasDisponibles() == null) {
            clase.setPlazasDisponibles(clase.getAforoMaximo());
        }
        if (clase.getVersion() == null) {
            clase.setVersion(0);
        }
        return claseRepository.save(clase);
    }
    
    public Clase obtenerPorId(Long id) {
        return claseRepository.findById(id).orElse(null);
    }
}