package ro.siit.chapter04;

public class Books {

    private String name;
    private int noOfPages;

    public Books(String name, int noOfPages) {
        this.name = name;
        this.noOfPages = noOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
