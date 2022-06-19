package ro.siit.chapter04;

public class ArtAlbums extends Books{

     int paperQuality;



     //paperQuality can take value from 1 to 5, 5 means a very good quality and 1 very poor quality



    public ArtAlbums(String name, int noOfPages, int paperQuality) {
        super(name, noOfPages);
        this.paperQuality=paperQuality;
    }

    public void setPaperQuality(int paperQuality) {
        this.paperQuality = paperQuality;
    }

    public int getPaperQuality() {
        return paperQuality;
    }
}
