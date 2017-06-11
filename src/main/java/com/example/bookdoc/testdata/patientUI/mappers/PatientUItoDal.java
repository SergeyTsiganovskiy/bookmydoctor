package com.example.bookdoc.testdata.patientUI.mappers;

import com.example.bookdoc.dal.models.PatientDal;
import com.example.bookdoc.testdata.Mapper;
import com.example.bookdoc.testdata.patientUI.PatientUI;

public class PatientUItoDal implements Mapper<PatientDal, PatientUI> {

    private PatientUItoDal() {
    }

    public static PatientUItoDal getInstance(){
        return new PatientUItoDal();
    }

    @Override
    public PatientDal map(PatientUI patientUI) throws NumberFormatException {

        PatientDal.PatientDalBuilder patientDalBuilder = new PatientDal.PatientDalBuilder();

        patientDalBuilder.Id(Integer.parseInt(patientUI.getId()));
        patientDalBuilder.Password(patientUI.getPassword());
        patientDalBuilder.Name(patientUI.getName());
        patientDalBuilder.Age(Integer.parseInt(patientUI.getAge()));

        return patientDalBuilder.build();
    }
}
