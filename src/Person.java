public class Person {
    private String name;
    private String surName;
    private int quantityTickets;

    public Person(String name, String surName, int quantityTickets) {
        this.name = name;
        this.surName = surName;
        this.quantityTickets = quantityTickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getQuantityTickets() {
        return quantityTickets;
    }

    public void setQuantityTickets(int quantityTickets) {
        this.quantityTickets = quantityTickets;
    }
}
