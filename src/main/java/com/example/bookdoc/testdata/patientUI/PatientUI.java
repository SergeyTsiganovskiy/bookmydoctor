package com.example.bookdoc.testdata.patientUI;

public class PatientUI {


    String id;
    String name;
    String password;
    String age;

    public PatientUI(PatientUIBuilder patientUIBuilder) {
        id = patientUIBuilder.id;
        name = patientUIBuilder.name;
        password = patientUIBuilder.password;
        age = patientUIBuilder.age;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getAge() {
        return age;
    }



    public static class PatientUIBuilder {

        String id;
        String name;
        String password;
        String age;

        public PatientUIBuilder Id(String id) {
            this.id = id;
            return this;
        }

        public PatientUIBuilder Name(String name) {
            this.name = name;
            return this;
        }

        public PatientUIBuilder Password(String password) {
            this.password = password;
            return this;
        }

        public PatientUIBuilder Age(String age) {
            this.age = age;
            return this;
        }


        public PatientUI build() {
            return new PatientUI(this);
        }

    }
}
