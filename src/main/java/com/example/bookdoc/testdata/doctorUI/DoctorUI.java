package com.example.bookdoc.testdata.doctorUI;

public class DoctorUI {

    String id;
    String password;
    String name;
    DoctorType speciality;
    String age;
    String pin;

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public DoctorType getSpeciality() {
        return speciality;
    }

    public String getAge() {
        return age;
    }

    public String getPin() {
        return pin;
    }


    public DoctorUI(DoctorUIBuilder doctorUIBuilder) {
        this.id = doctorUIBuilder.id;
        this.password = doctorUIBuilder.password;
        this.name = doctorUIBuilder.name;
        this.speciality = doctorUIBuilder.speciality;
        this.age = doctorUIBuilder.age;
        this.pin = doctorUIBuilder.pin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DoctorUI)) return false;

        DoctorUI doctorUI = (DoctorUI) o;

     //   if (id != null ? !id.equals(doctorUI.id) : doctorUI.id != null) return false;
        if (password != null ? !password.equals(doctorUI.password) : doctorUI.password != null) return false;
        if (name != null ? !name.equals(doctorUI.name) : doctorUI.name != null) return false;
        if (speciality != doctorUI.speciality) return false;
        if (age != null ? !age.equals(doctorUI.age) : doctorUI.age != null) return false;
        return pin != null ? pin.equals(doctorUI.pin) : doctorUI.pin == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (speciality != null ? speciality.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (pin != null ? pin.hashCode() : 0);
        return result;
    }

    public static class DoctorUIBuilder {

        String id;
        String password;
        String name;
        DoctorType speciality;
        String age;
        String pin;

        public DoctorUIBuilder Id(String id) {
            this.id = id;
            return this;
        }

        public DoctorUIBuilder Password(String password) {
            this.password = password;
            return this;
        }

        public DoctorUIBuilder Name(String name) {
            this.name = name;
            return this;
        }

        public DoctorUIBuilder Speciality(DoctorType speciality) {
            this.speciality = speciality;
            return this;
        }

        public DoctorUIBuilder Age(String age) {
            this.age = age;
            return this;
        }

        public DoctorUIBuilder Pin(String pin) {
            this.pin = pin;
            return this;
        }

        public DoctorUI build(){
            return new DoctorUI(this);
        }
    }
}
