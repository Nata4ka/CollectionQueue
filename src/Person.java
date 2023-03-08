public class Person {

    protected String name;
    protected String surName;
    protected int ticket;

    public Person(String name, String surName, int ticket) {
        this.name = name;
        this.surName = surName;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return name + " " + surName;
    }


}


