package model;

public abstract class Contact {

    protected String name;

    public Contact(String name) {
        this.name = name;
    }

    public Contact(){}

    public abstract String getName();

    public abstract void setName(String name);

}
