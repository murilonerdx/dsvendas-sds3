package com.devsuperior.dsvendas.entities.dto;

import com.devsuperior.dsvendas.entities.Seller;

public class SellerDTO {
    private Long id;
    private String name;

    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SellerDTO(){}

    public SellerDTO(Seller obj){
        if(obj != null){
            this.id = obj.getId();
            this.name = obj.getName();
        }
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
