package com.example.ApiClassRomm.repository;

import com.example.ApiClassRomm.models.GradeRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGradeRecordRepository extends JpaRepository<GradeRecord,Integer> {
}
