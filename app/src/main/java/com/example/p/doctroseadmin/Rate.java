package com.example.p.doctroseadmin;

/**
 * Created by P on 08-11-2017.
 */

public class Rate
{
    private String name_of_doctor;
    private String address_of_doctor;
    private String rate_of_doctor;
    private String speciality_of_doctor;
    private String qualification_of_doctor;

    public Rate(String rate_of_doctor, String address_of_doctor, String speciality_of_doctor, String qualification_of_doctor, String name_of_doctor) {
        this.rate_of_doctor = rate_of_doctor;
        this.address_of_doctor = address_of_doctor;
        this.speciality_of_doctor = speciality_of_doctor;
        this.qualification_of_doctor = qualification_of_doctor;
        this.name_of_doctor = name_of_doctor;
    }

    public String getRate() {
        return rate_of_doctor;
    }

    public String getAddress() {
        return address_of_doctor;
    }

    public String getSpeciality() {
        return speciality_of_doctor;
    }

    public String getQualification() {
        return qualification_of_doctor;
    }

    public String getname_of_doctor() {
        return name_of_doctor_of_doctor;
    }
}