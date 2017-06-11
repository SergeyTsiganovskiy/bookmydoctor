package com.example.bookdoc.dal.models;

public class AdminDal {
    private Integer id;
    private String password;
    private String name;

    public AdminDal(AdminDalBuilder adminDalBuilder) {
        id = adminDalBuilder.id;
        password = adminDalBuilder.password;
        name = adminDalBuilder.name;
    }

    public Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public static class  AdminDalBuilder{

        private Integer id;
        private String password;
        private String name;

        public AdminDalBuilder Id(Integer id) {
            this.id = id;
            return this;
        }

        public AdminDalBuilder Password(String password) {
            this.password = password;
            return this;
        }

        public AdminDalBuilder Name(String name) {
            this.name = name;
            return this;
        }

        public AdminDal build(){
            return new AdminDal(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdminDal)) return false;

        AdminDal adminDal = (AdminDal) o;

        if (!id.equals(adminDal.id)) return false;
        if (!password.equals(adminDal.password)) return false;
        return name.equals(adminDal.name);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}
