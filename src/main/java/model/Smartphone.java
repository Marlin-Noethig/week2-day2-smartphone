package model;

import java.util.Arrays;

public class Smartphone implements GPS, Radio {


    protected String modelName;
    protected String manufacturerName;
    protected Contact[] contacts;


    public Smartphone(String modelName, String manufacturerName, Contact[] contacts) {
        this.modelName = modelName;
        this.manufacturerName = manufacturerName;
        this.contacts = contacts;
    }

    //GETTER
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    //SETTER
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String getPosition() {
        return "Hamburg";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String toString(){
        return this.modelName + " - " + this.manufacturerName + " - " + Arrays.toString(this.contacts);
    }

    public void addContact (Contact newContact){
        Contact[] newArr = Arrays.copyOf(contacts, contacts.length + 1);
        newArr[newArr.length - 1] = newContact;
        this.contacts = newArr;
    }

    public Contact getContactById(int index) {
        return contacts[index];
    }

    public Contact getContactByName (String name) {
     Contact contactInSearch = null;
        for (int i = 0; i < contacts.length; i++){
            if (contacts[i].getName() == name){
                contactInSearch = contacts[i];
            }
        }
      return contactInSearch;
     }

    public void removeContactByIndex(int index) {
        this.contacts[index] = null;
        int newIndex = 0;
        Contact[] newArr = Arrays.copyOf(this.contacts, this.contacts.length - 1);
        for (int i = 0; i < this.contacts.length; i++){
            if (this.contacts[i] != null){
                newArr[newIndex] = this.contacts[i];
                newIndex++;
            }
        }
        this.contacts = newArr;
    }

    public void removeContactByName (String name){

        for (int i = 0; i < this.contacts.length; i++){
            if (this.contacts[i].name == name){
                this.contacts[i] = null;
            }
        }
        //copied codeblock from removeById, not really best practice, i know...
        int newIndex = 0;
        Contact[] newArr = Arrays.copyOf(this.contacts, this.contacts.length - 1);
        for (int i = 0; i < this.contacts.length; i++){
            if (this.contacts[i] != null){
                newArr[newIndex] = this.contacts[i];
                newIndex++;
            }
        }
        this.contacts = newArr;

    }

}
