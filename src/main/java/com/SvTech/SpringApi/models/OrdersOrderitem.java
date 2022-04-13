package com.SvTech.SpringApi.models;

import javax.persistence.*;

@Entity
@Table(name = "orders_orderitems")
public class OrdersOrderitem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "Active", nullable = false)
    private Boolean active = false;

    @Column(name = "Qty", nullable = false)
    private Integer qty;

    @Column(name = "GuestId", nullable = false)
    private Integer guestId;

    @Column(name = "Item_id", nullable = false)
    private Integer itemId;

    @Column(name = "order_ID_id", nullable = false)
    private Integer orderIdId;

    @Column(name = "Comment", length = 100)
    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getOrderIdId() {
        return orderIdId;
    }

    public void setOrderIdId(Integer orderIdId) {
        this.orderIdId = orderIdId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}