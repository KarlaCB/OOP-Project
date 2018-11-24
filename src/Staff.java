public class Staff extends Person{
    public Staff(){
        super();
    }

    public Staff(int idNum, String firstName, String lastName, String userName, String password, Date eDate, Address address, ContactNumber contact){
        super(idNum, firstName, lastName, userName, password, eDate, address, contact);
    }

}
