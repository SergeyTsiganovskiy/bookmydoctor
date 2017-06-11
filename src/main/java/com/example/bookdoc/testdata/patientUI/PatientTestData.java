package com.example.bookdoc.testdata.patientUI;

public class PatientTestData {
    public static PatientUI getValidPatientUI(){
        return new PatientUI.PatientUIBuilder()
                .Id("53421")
                .Password("patientpass")
                .Name("patientname")
                .Age("20")
                .build();
    }
}
