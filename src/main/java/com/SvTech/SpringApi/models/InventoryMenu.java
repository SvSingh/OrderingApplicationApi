package com.SvTech.SpringApi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "inventory_menu")
public class InventoryMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;


    public InventoryMenu(String item, String price, Integer sold, Integer left, Boolean gst, Boolean plt, Boolean pst, InventoryCategory category, String description) {
        this.item = item;
        this.price = price;
        this.sold = sold;
        this.left = left;
        this.gst = gst;
        this.plt = plt;
        this.pst = pst;
        this.category = category;
        this.description = description;
    }

    public InventoryMenu() {
    }

    public InventoryMenu(Integer id, String item, String price, Integer sold, Integer left, Boolean gst, Boolean plt, Boolean pst, InventoryCategory category, String description) {
        this.id = id;
        this.item = item;
        this.price = price;
        this.sold = sold;
        this.left = left;
        this.gst = gst;
        this.plt = plt;
        this.pst = pst;
        this.category = category;
        this.description = description;
    }

    @Column(name = "Item", nullable = false, length = 50)
    private String item;

    @Column(name = "price", nullable = false, length = 50)
    private String price;

    @Column(name = "sold")
    private Integer sold;

    @Column(name = "`left`")
    private Integer left;

    @Column(name = "GST", nullable = false)
    private Boolean gst = false;

    @Column(name = "PLT", nullable = false)
    private Boolean plt = false;

    @Column(name = "PST", nullable = false)
    private Boolean pst = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private InventoryCategory category;

    @Column(name = "Discription", nullable = false, length = 200)
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Boolean getGst() {
        return gst;
    }

    public void setGst(Boolean gst) {
        this.gst = gst;
    }

    public Boolean getPlt() {
        return plt;
    }

    public void setPlt(Boolean plt) {
        this.plt = plt;
    }

    public Boolean getPst() {
        return pst;
    }

    public void setPst(Boolean pst) {
        this.pst = pst;
    }

    public InventoryCategory getCategory() {
        return category;
    }

    public void setCategory(InventoryCategory category) {
        this.category = category;
    }

    public String getDiscription() {
        return description;
    }

    public void setDiscription(String discription) {
        this.description = discription;
    }

}