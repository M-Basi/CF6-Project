package gr.aueb.cf.ch16.marker;

public class CompactDisc implements Item{
    private long id;
    private String title;

    public CompactDisc(){

    }

    public CompactDisc(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
