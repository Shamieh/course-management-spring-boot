package com.ats.project.service;

import com.ats.project.model.Students;
import com.ats.project.repository.CoursesRepository;
import com.ats.project.model.Courses;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CoursesServiceImp implements CoursesService {
    private final CoursesRepository coursesRepository;

    @Override
    public void deleteById(Long id) {
        coursesRepository.deleteById(id);
    }

    public CoursesServiceImp(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    @Override
    public Courses CreateCourses(Courses courses) {
        return coursesRepository.findByName(courses.getName())
                .orElseGet(() -> coursesRepository.save(courses));
    }

    @Override
    public List<Courses> findAll() {
        return coursesRepository.findAll();
    }

    @Override
    public Optional<Courses> findById(Long courseId) {
        return coursesRepository.findById(courseId);
    }

    @Transactional
    @Override
    public void updateCourses(Courses updatedCourses) {
        Courses oldCourse = coursesRepository.findById(updatedCourses.getId()).get();
        oldCourse.setName(updatedCourses.getName());
        oldCourse.setMaxCapacity(updatedCourses.getMaxCapacity());
        oldCourse.setCurrentEnrollment(updatedCourses.getCurrentEnrollment());
        oldCourse.setDescription(updatedCourses.getDescription());
        oldCourse.setIsActive(updatedCourses.getIsActive());
        oldCourse.setFaculty(updatedCourses.getFaculty());
        oldCourse.setCreditHours(updatedCourses.getCreditHours());

        coursesRepository.save(oldCourse);
    }


}
