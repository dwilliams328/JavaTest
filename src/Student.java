public class Student {
    //Permanent Registration Number
    private int prn = 0;
    private String name;
    private String address;

    public Student(int prn, String name, String address) {
        //Manuel prn incrementer
        this.prn = prn;
        this.name = name;
        this.address = address;
    }

    public int getPrn() {
        return prn;
    }

    public void setPrn(int prn) {
        this.prn = prn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "prn=" + prn +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
