package com.devsuperior.dsvendas.entities.dto;

import com.devsuperior.dsvendas.entities.Sale;

import java.io.Serializable;
import java.time.LocalDate;


public class SaleDTO implements Serializable {
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
    }

    public SaleDTO(){}

    public SaleDTO(Sale obj){
        if(obj !=null){
            this.id = obj.getId();
            this.visited = obj.getVisited();
            this.deals = obj.getDeals();
            this.amount = obj.getAmount();
            this.date = obj.getDate();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
