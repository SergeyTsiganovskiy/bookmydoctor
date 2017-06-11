package com.example.bookdoc.testdata.patientUI.mappers;

import com.example.bookdoc.dal.models.PatientDal;
import com.example.bookdoc.testdata.Mapper;
import com.example.bookdoc.testdata.patientUI.PatientUI;

public class PatientDalToUI implements Mapper<PatientUI, PatientDal> {

    private PatientDalToUI() {
    }

    public static PatientDalToUI getInstance(){
        return new PatientDalToUI();
    }

    @Override
    public PatientUI map(PatientDal patientDal) throws NumberFormatException {
        PatientUI.PatientUIBuilder patientUIBuilder = new PatientUI.PatientUIBuilder();

        patientUIBuilder.Id(patientDal.getId().toString());
        patientUIBuilder.Name(patientDal.getName());
        patientUIBuilder.Password(patientDal.getPassword());
        patientUIBuilder.Age(patientDal.getAge().toString());

        return patientUIBuilder.build();
    }
}
