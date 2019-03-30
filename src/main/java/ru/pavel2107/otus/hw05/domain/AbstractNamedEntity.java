package ru.pavel2107.otus.hw05.domain;

public class AbstractNamedEntity {
    private String ID;
    private String Name;

    public AbstractNamedEntity(){}


    public AbstractNamedEntity(String ID, String name){
        this.ID = ID;
        this.Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isNew(){
        return ID == null;
    }

}
