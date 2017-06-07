package com.manish.javadev.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "Orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "OID")
	private int orderId;

	@Column(name = "TOTALQTY")
	private int totalQty;

	@Column(name = "TCOST")
	private Double totalCost;

	@Column(name = "ORDER_DATE")
	private Date orderDate;

	@Column(name = "STATUS")
	private String status;

	@ManyToOne
	@JoinColumn(name = "CID", referencedColumnName = "CID")
	private Customer customer;

	public Order() {
	}

	public Order(int totalQty, Double totalCost, Date orderDate, String status) {
		super();
		this.totalQty = totalQty;
		this.totalCost = totalCost;
		this.orderDate = orderDate;
		this.status = status;
	}

	// Generate Getter and setter
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", totalQty=" + totalQty
				+ ", totalCost=" + totalCost + ", orderDate=" + orderDate
				+ ", status=" + status + ", customer=" + customer + "]";
	}

}