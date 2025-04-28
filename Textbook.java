public class Textbook extends Book{
    private int edition;
        public Textbook (String bookTitle, double bookPrice, int ed) {
            super(bookTitle, bookPrice);
            edition = ed;
    }
    
    public int getEdition() {
        return edition;
    }
    public boolean canSubstituteFor(Textbook t) {
        if (getTitle().equals(t.getTitle()) && edition >= t.getEdition()) {
            return true;
    }
    return false;
    }
    public String getBookInfo() {
        String rtrn = super.getBookInfo();
    return rtrn + "-" + edition;
    }
    }
    