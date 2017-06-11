package com.example.bookdoc.testdata.doctorUI.mappers;

import com.example.bookdoc.dal.models.DoctorDal;
import com.example.bookdoc.testdata.Mapper;
import com.example.bookdoc.testdata.doctorUI.DoctorType;
import com.example.bookdoc.testdata.doctorUI.DoctorUI;

public class DoctorDaltoUI implements Mapper<DoctorUI, DoctorDal>{

    private DoctorDaltoUI() {
    }

    public static DoctorDaltoUI getInstance(){
        return new DoctorDaltoUI();
    }

    @Override
    public DoctorUI map(DoctorDal doctorDal) throws NumberFormatException {
        DoctorUI.DoctorUIBuilder doctorUIBuilder = new DoctorUI.DoctorUIBuilder();

        doctorUIBuilder.Id(String.valueOf(doctorDal.getId()));
        doctorUIBuilder.Password(doctorDal.getPassword());
        doctorUIBuilder.Name(doctorDal.getName());
        doctorUIBuilder.Age(doctorDal.getAge());
        doctorUIBuilder.Speciality(DoctorType.valueOf(doctorDal.getSpeciality().toUpperCase()));
        doctorUIBuilder.Pin(String.valueOf(doctorDal.getPin()));

        return doctorUIBuilder.build();
    }
}
