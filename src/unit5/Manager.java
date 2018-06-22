package unit5;

public final class Manager extends Employee {

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void print(){
        System.out.println("this is manager...");
    }
}
