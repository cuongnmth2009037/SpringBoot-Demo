package aptech.fpt.hellot2009m1.entity;

public class Product {
    private int id;
    private String name;
    private String slug;
    private String thumbnail;
    private String description;
    private int status;


    public Product(int id, String name, String slug, String thumbnail, String description, int status) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.thumbnail = thumbnail;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
