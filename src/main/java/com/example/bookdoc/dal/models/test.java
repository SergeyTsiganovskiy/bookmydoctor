package com.example.bookdoc.dal.models;

public class test {
    public static void main(String[] args) {
        PatientDal patientDal =
                new PatientDal.PatientDalBuilder().Id(1).Age(2).Name("").Password("").build();
        DoctorDal doctorDal =
                new DoctorDal.DoctorDalBuilder().Age("").Id(1).Name("").Password("").Pin(1).Speciality("").build();
    }
}