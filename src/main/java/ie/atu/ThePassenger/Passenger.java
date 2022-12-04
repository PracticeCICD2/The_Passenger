package ie.atu.ThePassenger;

public class Passenger{
    private String title;
    private String Name;
    private int ID;
    private int phoneNumber;
    private int age;

    public Passenger(String title, String Name, int ID, int phoneNumber, int age){
        this.title=title;
        this.Name=Name;
        this.ID=ID;
        this.phoneNumber=phoneNumber;
        this.age=age;
    }

    public Passenger(String name) {
        this.Name="Sean";
    }


    public String getTitle() {
        return title;
    }

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }
}
