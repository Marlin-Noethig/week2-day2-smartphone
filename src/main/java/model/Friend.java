package model;

import java.util.Objects;

public class Friend extends Contact {

    protected int phoneNum;

    public Friend (String name, int phoneNum) {
        super(name);
        this.phoneNum = phoneNum;
    }

    public Friend (){
        super();
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString (){
        return name + ": " + phoneNum;
    }

}
