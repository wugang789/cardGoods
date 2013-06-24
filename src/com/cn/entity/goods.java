package com.cn.entity;

import java.io.Serializable;

/**
 * 商品实体类
 * @author Administrator
 *
 */
public class goods implements Serializable {

	/**
	 *  id
	 */
	private int id;
	
	/**
	 * 商品名称
	 */
	private String goodsName;
	
	/**
	 * 商品价格
	 */
	private Float goodsPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Float getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	@Override
	public String toString() {
		return "goods [id=" + id + ", goodsName=" + goodsName + ", goodsPrice="
				+ goodsPrice + "]";
	}

	public goods() {
		super();
	}

	public goods(int id, String goodsName, Float goodsPrice) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
	}
	
	
	
}
