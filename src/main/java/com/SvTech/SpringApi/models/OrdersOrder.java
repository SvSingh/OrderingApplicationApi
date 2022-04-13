package com.SvTech.SpringApi.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "orders_orders")
public class OrdersOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_ID", nullable = false)
    private Integer id;

    public OrdersOrder(LocalDate date, LocalTime time, Boolean active, String paymentType, Double tip, Double gst, Double plt, Double subTotal, String table, Integer takeOutNumber, Integer guest, Integer cutomerNameId, Double discountPrice, String discount, Double pst) {
        this.date = date;
        this.time = time;
        this.active = active;
        this.paymentType = paymentType;
        this.tip = tip;
        this.gst = gst;
        this.plt = plt;
        this.subTotal = subTotal;
        this.table = table;
        this.takeOutNumber = takeOutNumber;
        this.guest = guest;
        this.cutomerNameId = cutomerNameId;
        this.discountPrice = discountPrice;
        this.discount = discount;
        this.pst = pst;
    }

    @Column(name = "Date", nullable = false)
    private LocalDate date;

    public OrdersOrder(Integer id, LocalDate date, LocalTime time, Boolean active, String paymentType, Double tip, Double gst, Double plt, Double subTotal, String table, Integer takeOutNumber, Integer guest, Integer cutomerNameId, Double discountPrice, String discount, Double pst) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.active = active;
        this.paymentType = paymentType;
        this.tip = tip;
        this.gst = gst;
        this.plt = plt;
        this.subTotal = subTotal;
        this.table = table;
        this.takeOutNumber = takeOutNumber;
        this.guest = guest;
        this.cutomerNameId = cutomerNameId;
        this.discountPrice = discountPrice;
        this.discount = discount;
        this.pst = pst;
    }

    public OrdersOrder() {
    }

    @Column(name = "Time", nullable = false)
    private LocalTime time;

    @Column(name = "Active", nullable = false)
    private Boolean active = false;

    @Column(name = "paymentType", length = 50)
    private String paymentType;

    @Column(name = "Tip")
    private Double tip;

    @Column(name = "GST")
    private Double gst;

    @Column(name = "PLT")
    private Double plt;

    @Column(name = "SubTotal", nullable = false)
    private Double subTotal;

    @Column(name = "`Table`", length = 50)
    private String table;

    @Column(name = "TakeOutNumber")
    private Integer takeOutNumber;

    @Column(name = "Guest", nullable = false)
    private Integer guest;

    @Column(name = "Cutomer_name_id")
    private Integer cutomerNameId;

    @Column(name = "DiscountPrice", nullable = false)
    private Double discountPrice;

    @Column(name = "Discount", length = 50)
    private String discount;

    @Column(name = "PST")
    private Double pst;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Double getTip() {
        return tip;
    }

    public void setTip(Double tip) {
        this.tip = tip;
    }

    public Double getGst() {
        return gst;
    }

    public void setGst(Double gst) {
        this.gst = gst;
    }

    public Double getPlt() {
        return plt;
    }

    public void setPlt(Double plt) {
        this.plt = plt;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public Integer getTakeOutNumber() {
        return takeOutNumber;
    }

    public void setTakeOutNumber(Integer takeOutNumber) {
        this.takeOutNumber = takeOutNumber;
    }

    public Integer getGuest() {
        return guest;
    }

    public void setGuest(Integer guest) {
        this.guest = guest;
    }

    public Integer getCutomerNameId() {
        return cutomerNameId;
    }

    public void setCutomerNameId(Integer cutomerNameId) {
        this.cutomerNameId = cutomerNameId;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Double getPst() {
        return pst;
    }

    public void setPst(Double pst) {
        this.pst = pst;
    }

}