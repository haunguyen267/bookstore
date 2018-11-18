package model.person;

public class Author {

    private FullName name;
    private Address address;

    public Author(FullName name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Author() {
    }

    public FullName getName() {
        return name;
    }

    
}
