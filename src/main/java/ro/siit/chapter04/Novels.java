package ro.siit.chapter04;

public class Novels extends Books{
    String novelsType;


    public Novels(String name, int noOfPages, String novelsType) {
        super(name, noOfPages);
        this.novelsType=novelsType;
    }

    public String getNovelsType() {
        return novelsType;
    }

    public void setNovelsType(String novelsType) {
        this.novelsType = novelsType;
    }
}
