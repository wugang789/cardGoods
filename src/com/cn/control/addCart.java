package com.cn.control;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cn.entity.goods;
/**
 * 添加购物车
 * @author Administrator
 *
 */
public class addCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<goods> list = null;

	public addCart() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		goods good = new goods();
		if (list == null) {
			list = new ArrayList<goods>();
		}
		System.out.println(request.getParameter("goodsname"));
		String goodsName = request.getParameter("goodsname");
		String newgoodsName = new String(goodsName.getBytes("ISO8859-1"),"UTF-8");
		System.out.println(newgoodsName);
		Float price = Float.valueOf(request.getParameter("price"));
		good.setGoodsName(newgoodsName);
		good.setGoodsPrice(price);
		list.add(good);
		System.out.println(list);
		HttpSession session = request.getSession();
		session.setAttribute("mylist", list);
		request.getRequestDispatcher("/goods.jsp").forward(request, response);
	}

}
