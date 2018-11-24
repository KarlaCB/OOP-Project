public class Person {

    protected int idNum;
    protected String firstName;
    protected String lastName;
    protected String userName;
    protected String password;
    protected  Date eDate;
    protected Address address;
    protected ContactNumber contact;

    public Person() {
        firstName = " ";
        lastName = " ";
        userName = " ";
        password = " ";
        eDate = new Date();
        address = new Address();
        contact = new ContactNumber();

    }

    public Person(int idNum, String firstName, String lastName, String userName, String password, Date eDate, Address address, ContactNumber contact) {
        this.idNum = idNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.eDate = new Date(eDate.getDay(), eDate.getMonth(), eDate.getYear());
        this.address = new Address(address.getStreetName(), address.getStreetNum(), address.getParish(), address.getCity());
        this.contact = new ContactNumber(contact.getAreaCode(), contact.getLine(), contact.getExchange());
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date geteDate() {
        return eDate;
    }

    public void seteDate(Date eDate) {
        this.eDate = eDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactNumber getContact() {
        return contact;
    }

    public void setContact(ContactNumber contact) {
        this.contact = contact;
    }

    public void selectCourse(){

    }

    public void viewTest(){

    }

    public void takeTest(){

    }

    public void display(){

    }

    public void selectQuestion(){

    }

    public void saveTest(){

    }

    public void setTest(){

    }

    public void viewReport(){

    }

    public void viewTestResults(){

    }

    public void enterCourseCode(){

    }

    public void enterCourseName(){

    }

    public void setTestDate(){

    }

}
