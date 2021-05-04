public class Customer {
    private int tcNo;
    private String name;
    private String lastName;
    private String birthDate;
    private String password;


    public Customer(int tcNo, String name, String lastName, String birthDate,String password) {
        this.tcNo = tcNo;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.password=password;
    }


    public int getTcNo() {
        return tcNo;
    }

    public void setTcNo(int tcNo) {
        this.tcNo = tcNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password=password;
    }


}
