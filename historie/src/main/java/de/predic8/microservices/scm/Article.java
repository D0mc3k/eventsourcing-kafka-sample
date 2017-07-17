package de.predic8.microservices.scm;

import java.math.BigDecimal;

public class Article {

    private String id;

    private String name;

    private BigDecimal price;

    public Article() {

    }

    public Article(String id) {
        this.id = id;
    }

    public Article(String id, String name, BigDecimal price) {

        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
