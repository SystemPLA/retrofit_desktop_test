package mvp.model.entity;

import com.google.gson.annotations.Expose;

public class Product {

    @Expose
    private Integer id;
    @Expose
    private String name;
    @Expose
    private String source;
    @Expose
    private String status;
    @Expose
    private long count;

    public Product(Integer id, String name, String source, String status, long count) {
        this.id = id;
        this.name = name;
        this.source = source;
        this.status = status;
        this.count = count;
    }

    public Product(String name, String source, String status, long count) {
        this.name = name;
        this.source = source;
        this.status = status;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                ", status='" + status + '\'' +
                ", count=" + count +
                '}';
    }
}
