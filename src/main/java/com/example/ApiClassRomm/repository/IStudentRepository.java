
package com.example.ApiClassRomm.repository;

import com.example.ApiClassRomm.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IStudentRepository extends JpaRepository<Student,Integer> {
}
