package ru.pavel2107.otus.hw05.domain;

public abstract class AbstractNamedEntity {
    private Long ID;
    private String Name;

    public AbstractNamedEntity(){}


    public AbstractNamedEntity(Long ID, String name){
        this.ID = ID;
        this.Name = name;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
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
