package com.devsuperior.dscommerce.DTO;

import com.devsuperior.dscommerce.entities.Product;

public class ProductNewDTO {

    private Long id;
    private String name;
    private Double price;
    private String imgUrl;

    public ProductNewDTO() {
    }

    public ProductNewDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.imgUrl = product.getImgUrl();
    }

    public String getName() {
        return name;
    }


    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Long getId() {   return id;  }
}
