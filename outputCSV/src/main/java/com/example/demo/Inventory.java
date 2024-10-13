package com.example.demo;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="inventory")
public class Inventory {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy =	GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	@NotNull

	private long id;
	
	@Column(name="book")
//	@NotNull(message="商品名を入力してください")
	@NotNull
	@NotEmpty
	private String book;
	
	@Column(name="price")
//	@NotNull(message="価格を入力してください")
	@NotNull
	private Integer price;
	
	@Column(name="quantity")
//	@NotNull(message="数量を入力してください")
	@NotNull
	private Integer quantity;
	
	
	public long getId() {
		return id;
		}
	 
	public void setId(long id) {
		this.id=id;
		}
	
	public String getBook() {
		return book;
		}
	
	public void setBook(String book) {
		this.book = book;
		}
	
	public Integer getPrice() {
		return price;
		}
	
	public void setPrice(Integer price) {
		this.price = price;
		}
	
	public Integer getQuantity() {
		return quantity;
		}
	 
	public void setQuantity(Integer quantity) {
		this.quantity= quantity;
		}
}
