public class Address {
    private String streetName;
    private int streetNum;
    private String parish;
    private String city;

    public Address() {
        streetName = "Southdale Dr.";
        streetNum = 9;
        parish = "St.Josephine";
        city = "Johanasberg";
    }

    public Address(String streetName, int streetNum, String parish, String city) {
        this.streetName = streetName;
        this.streetNum = streetNum;
        this.parish = parish;
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public String getParish() {
        return parish;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void SetAddress(){

    }

    public void Display(){
        System.out.print(getStreetNum());
        System.out.print(getStreetName());
        System.out.print(getParish());
        System.out.print(getCity());
    }
}
