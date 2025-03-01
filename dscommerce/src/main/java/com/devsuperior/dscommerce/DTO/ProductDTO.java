package com.devsuperior.dscommerce.DTO;

import com.devsuperior.dscommerce.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


public class ProductDTO {
    //no DTO é que inseriremos as validações

    private Long id;

    @Size(min = 3, max = 80, message = "Nome entre 3-80 caractéres")
    @NotBlank(message = "Campo requerido")
    private String name;

    @Size(min = 10, message = "Precisa ter no míninimo 10 caractéres")
    @NotBlank
    private String description;

    @Positive(message = "O preço deve ser positivo")
    private Double price;

    private String imgUrl;

    public ProductDTO() {
    }

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.imgUrl = product.getImgUrl();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Long getId() {   return id;  }
}
