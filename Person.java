public class Person {
    private String name;
    private String fatherName;
    private String dob;
    private int gender;  //Male=0, Female=1;
    private int marriedStatus;  //Married=0, unmarried=1,other=2
    private String email;
    private String address;
    private String pincode;
    private String city;
    private String state;
    private String religion;
    Person(){
        name="";
        fatherName="";
        dob="";
        gender=-1;
        email="";
        address="";
        city="";
        pincode="";
        state="";
        religion="None";
    }
    public void setName(String name){
        this.name = name;
    }
    public void setFatherName(String fatherName){
        this.fatherName = fatherName;
    }
    public void setDob(String dob){
        this.dob =dob;
    }
    public void setGender(int gender){
        this.gender = gender;
    }
    public void setMarriedStaus(int marriedStatus){
        this.marriedStatus = marriedStatus;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setReligion(String religion){
        this.religion = religion;
    }
    public void setPinCode(String pinCode){
        this.pincode = pinCode;
    }
    public String getName(){
        return name;
    }
    public String getFatherName(){
        return fatherName;
    }
    public String getDob(){
        return dob;
    }
    public int getGender(){
        return gender;
    }
    public int getMarriedStatus(){
        return marriedStatus;
    }
    public String getEmail(){
        return email;
    }
    public String getPinCode(){
        return pincode;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getReligion(){
        return religion;
    }
}
