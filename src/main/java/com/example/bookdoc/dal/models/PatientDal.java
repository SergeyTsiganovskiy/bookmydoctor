package com.example.bookdoc.dal.models;

public class PatientDal {
    private Integer id;
    private String name;
    private String password;
    private Integer age;

    public PatientDal(PatientDalBuilder patientDalBuilder) {
        id = patientDalBuilder.id;
        name = patientDalBuilder.name;
        password = patientDalBuilder.password;
        age = patientDalBuilder.age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public static class PatientDalBuilder {
        private Integer id;
        private String name;
        private String password;
        private Integer age;

        public PatientDalBuilder Id(Integer id) {
            this.id = id;
            return this;
        }

        public PatientDalBuilder Name(String name) {
            this.name = name;
            return this;
        }

        public PatientDalBuilder Password(String password) {
            this.password = password;
            return this;
        }

        public PatientDalBuilder Age(Integer age) {
            this.age = age;
            return this;
        }

        public PatientDal build() {
            return new PatientDal(this);
        }
    }
}
