package Entities.concretes;

import java.time.LocalDate;

import Entities.abstracts.Entity;

public class Product implements Entity {
	private int id;
	private String name;
	private LocalDate publishDate;
	private double price;
	private String detail;
	private Campaign campaign;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	public double getUnitPriceAfterDiscount() {
		return this.price - (this.price * this.campaign.getDiscount()) / 100;
	}
	
}
