package com.example.bookdoc.testdata.adminUI;

import com.example.bookdoc.dal.models.AdminDal;

public class AdminUI {
    private String id;
    private String password;


    public AdminUI(AdminUIBuilder adminUIBuilder) {
        this.id = adminUIBuilder.id;
        this.password = adminUIBuilder.password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public static class AdminUIBuilder{
        private String id;
        private String password;

        public AdminUIBuilder Id(String id) {
            this.id = id;
            return this;
        }

        public AdminUIBuilder Password(String password) {
            this.password = password;
            return this;
        }

        public AdminUI build(){
            return new AdminUI(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdminUI)) return false;

        AdminUI adminUI = (AdminUI) o;

        if (!id.equals(adminUI.id)) return false;
        return password.equals(adminUI.password);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "AdminUI{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
