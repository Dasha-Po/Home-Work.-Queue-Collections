public class Person {
    //Про каждого человека известно его имя, фамилия и количество билетов.
    protected String name;
    protected String surname;
    protected int numberTickets;

    public Person(String name, String surname, int numberTickets) {
        this.name = name;
        this.surname = surname;
        this.numberTickets = numberTickets;
    }

    public String getNameSurname() {
        return name + " " + surname;
    }

    public boolean deleteTicket() {
        if (numberTickets > 0) {
            numberTickets -= 1;
            return true;
        }
        return false;
    }

    public int getNumberTickets(){
        return numberTickets;
    }
}
