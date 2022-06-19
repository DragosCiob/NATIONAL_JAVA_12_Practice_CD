package ro.siit.chapter04;

public class LibraryCatalog {

    public void libraryCatalog(){

        // currently the libraryCatalog has only 5 books

        Books[] library= new Books[5];
        library[0] = new Novels("Nineteen Eighty-Four", 542, "mystery");
        library[1] = new ArtAlbums("Nineteen Eighty-Four", 542, 2);
        library[2] = new Novels("Invisible Man", 542, "mystery");
        library[3] = new Novels("Nineteen Eighty-Four", 542, "mystery");
        library[4] = new ArtAlbums("Nineteen Eighty-Four", 542, 5);

    }

    public static Books[] addTitle() {

       //needs to be implemented the adding procedure

        return new Books[1];
    };
    public static Books[] deleteTitle() {

        //needs to be implemented the deleting procedure
        return new Books[2];
    };
    public static Books[] listTitles() {

        //needs to be implemented the listing procedure

        return new Books[3];
    };


}
