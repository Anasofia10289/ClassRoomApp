package com.example.ApiClassRomm.models;

import com.example.ApiClassRomm.helpers.TypeAttendanceStatus;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAttendance;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TypeAttendanceStatus status;

    public Attendance() {}

    public Attendance(Integer idAttendance, Date date, TypeAttendanceStatus status) {
        this.idAttendance = idAttendance;
        this.date = date;
        this.status = status;
    }

    public Integer getIdAttendance() { return idAttendance; }
    public void setIdAttendance(Integer idAttendance) { this.idAttendance = idAttendance; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public TypeAttendanceStatus getStatus() { return status; }
    public void setStatus(TypeAttendanceStatus status) { this.status = status; }
}

