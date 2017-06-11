package com.example.bookdoc.testdata.doctorUI.mappers;

import com.example.bookdoc.dal.models.DoctorDal;
import com.example.bookdoc.testdata.Mapper;
import com.example.bookdoc.testdata.doctorUI.DoctorUI;

public class DoctorUItoDal implements Mapper<DoctorDal,DoctorUI> {

    private DoctorUItoDal() {
    }

    public static DoctorUItoDal getInstance(){
        return new DoctorUItoDal();
    }
    @Override
    public DoctorDal map(DoctorUI doctorUI) throws NumberFormatException {
        DoctorDal.DoctorDalBuilder doctorDalBuilder = new DoctorDal.DoctorDalBuilder();
        doctorDalBuilder.Id(Integer.parseInt(doctorUI.getId()));
        doctorDalBuilder.Password(doctorUI.getPassword());
        doctorDalBuilder.Name(doctorUI.getName());
        doctorDalBuilder.Age(doctorUI.getAge());
        doctorDalBuilder.Speciality(doctorUI.getSpeciality().toString());
        doctorDalBuilder.Pin(Integer.parseInt(doctorUI.getPin()));
        return doctorDalBuilder.build();
    }
}
