package model;

public class Account {
    
    private String FirstName;
    private String LastName;
    private long SSN; // long primitive
    private long PhoneNumber; // long primitive
    private short Age; // Change from int to short
    private String StreetAddress;
    private String UnitNumber;
    private String City;
    private String State;
    private int ZipCode; // int primitive

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public short getAge() {
        return Age;
    }

    public void setAge(short Age) {
        this.Age = Age;
    }

    private String StreetAddress1;
    private String UnitNumber1;
    private String City1;
    private String State1;
    private int ZipCode1; // int primitive

    public String getStreetAddress1() {
        return StreetAddress1;
    }

    public void setStreetAddress1(String StreetAddress1) {
        this.StreetAddress1 = StreetAddress1;
    }

    public String getUnitNumber1() {
        return UnitNumber1;
    }

    public void setUnitNumber1(String UnitNumber1) {
        this.UnitNumber1 = UnitNumber1;
    }

    public String getCity1() {
        return City1;
    }

    public void setCity1(String City1) {
        this.City1 = City1;
    }

    public String getState1() {
        return State1;
    }

    public void setState1(String State1) {
        this.State1 = State1;
    }

    public int getZipCode1() {
        return ZipCode1;
    }

    public void setZipCode1(int ZipCode1) {
        this.ZipCode1 = ZipCode1;
    }

    private long PhoneNumber1; // long primitive

    public long getPhoneNumber1() {
        return PhoneNumber1;
    }

    public void setPhoneNumber1(long PhoneNumber1) {
        this.PhoneNumber1 = PhoneNumber1;
    }
    
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

    public void setStreetAddress(String StreetAddress) {
        this.StreetAddress = StreetAddress;
    }

    public String getUnitNumber() {
        return UnitNumber;
    }

    public void setUnitNumber(String UnitNumber) {
        this.UnitNumber = UnitNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int ZipCode) {
        this.ZipCode = ZipCode;
    }
    
    @Override
    public String toString() {
        return FirstName;
    }
}
