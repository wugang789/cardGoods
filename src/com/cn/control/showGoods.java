package com.cn.control;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cm.util.DbUtil;
import com.cn.entity.goods;

/**
 * 显示所有商品servlet
 * @author Administrator
 *
 */

public class showGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public showGoods() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String SQL = "select *  from goods";

		Connection conn = null;
		PreparedStatement prs = null;
		@SuppressWarnings("rawtypes")
		List list = new ArrayList<goods>();
		try {
			conn = DbUtil.getconn();
			prs = conn.prepareStatement(SQL);
			ResultSet rs = prs.executeQuery();
			while (rs.next()) {
				goods Goods = new goods();
				Goods.setId(rs.getInt(1));
				Goods.setGoodsName(rs.getString(2));
				Goods.setGoodsPrice(rs.getFloat(3));
				list.add(Goods);
			}
			request.getSession().setAttribute("list", list);
			request.getRequestDispatcher("/goods.jsp").forward(request,
					response);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
