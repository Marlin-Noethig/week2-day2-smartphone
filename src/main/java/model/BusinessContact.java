package model;

public class BusinessContact extends Contact {

    protected int phoneNum;
    protected String companyName;

    public BusinessContact (String name, int phoneNum, String companyName) {
        super(name);
        this.phoneNum = phoneNum;
        this.companyName = companyName;
    }

    public BusinessContact (){
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
        return name + ": " + phoneNum + ", " + this.companyName;
    }

}
