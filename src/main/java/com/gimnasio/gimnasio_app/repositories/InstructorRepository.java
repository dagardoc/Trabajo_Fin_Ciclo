package com.gimnasio.gimnasio_app.repositories;

import com.gimnasio.gimnasio_app.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}