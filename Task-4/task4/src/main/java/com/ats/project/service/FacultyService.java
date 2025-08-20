package com.ats.project.service;

import com.ats.project.model.Faculty;

import java.util.List;
import java.util.Optional;

public interface FacultyService {
    Faculty saveFaculty(Faculty faculty);
    List<Faculty> findAll();
    Optional<Faculty> findById(Long id);
}
