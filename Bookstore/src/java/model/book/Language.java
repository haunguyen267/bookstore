package model.book;

import model.person.Nation;

public class Language {

    private String name;
    private Nation nation;

    public Language(String name, Nation nation) {
        this.name = name;
        this.nation = nation;
    } 

    public String getName() {
        return name;
    }
    
}
