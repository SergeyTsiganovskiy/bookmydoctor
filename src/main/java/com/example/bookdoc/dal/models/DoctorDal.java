package com.example.bookdoc.dal.models;

import com.example.bookdoc.testdata.doctorUI.DoctorType;

public class DoctorDal {

    private Integer id;
    private String password;
    private String name;
    private String speciality;
    private String age;
    private Integer pin;

    public Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getAge() {
        return age;
    }

    public Integer getPin() {
        return pin;
    }


    public DoctorDal(DoctorDalBuilder doctorDalBuilder) {
        id = doctorDalBuilder.id;
        password = doctorDalBuilder.password;
        name = doctorDalBuilder.name;
        speciality = doctorDalBuilder.speciality;
        age = doctorDalBuilder.age;
        pin = doctorDalBuilder.pin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DoctorDal)) return false;

        DoctorDal doctorDal = (DoctorDal) o;

        if (!id.equals(doctorDal.id)) return false;
        if (!password.equals(doctorDal.password)) return false;
        if (!name.equals(doctorDal.name)) return false;
        if (!speciality.equals(doctorDal.speciality)) return false;
        if (!age.equals(doctorDal.age)) return false;
        return pin.equals(doctorDal.pin);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + speciality.hashCode();
        result = 31 * result + age.hashCode();
        result = 31 * result + pin.hashCode();
        return result;
    }

    public static class DoctorDalBuilder{
        private Integer id;
        private String password;
        private String name;
        private String speciality;
        private String age;
        private Integer pin;

        public DoctorDalBuilder Id(Integer id) {
            this.id = id;
            return this;
        }

        public DoctorDalBuilder Password(String password) {
            this.password = password;
            return this;
        }

        public DoctorDalBuilder Name(String name) {
            this.name = name;
            return this;
        }

        public DoctorDalBuilder Speciality(String speciality) {
            this.speciality = speciality;
            return this;
        }

        public DoctorDalBuilder Age(String age) {
            this.age = age;
            return this;
        }

        public DoctorDalBuilder Pin(Integer pin) {
            this.pin = pin;
            return this;
        }

        public DoctorDal build(){
            return new DoctorDal(this);
        }
    }
}
