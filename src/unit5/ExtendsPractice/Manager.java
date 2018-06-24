package unit5.ExtendsPractice;

final class Manager extends Employee {

    private String firstName;

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void print() {
        System.out.println("this is manager...");
    }
}
