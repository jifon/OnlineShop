package com.info.demo.controller;

import java.beans.PropertyDescriptor;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.info.demo.dao.OrderDetailRepository;
import com.info.demo.model.Order;
import com.info.demo.model.OrderDetail;
import com.info.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.info.demo.model.Product;
import com.info.demo.model.User;

@Controller
@RequestMapping("profile")
public class ProfileController {
	
	@Autowired
	private ProductService productService;

	@Autowired
	private UserService userService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderDetailService orderDetailService;






//	@GetMapping("cart-product")
//	public ModelAndView cartProduct(Principal principal) {
//		ModelAndView mv = new ModelAndView("profile/cart-product");
//		User user = userService.findByEmail(principal.getName());
//		List<Order> orderList = user.getOrderList();
//		List<Product> productList = null;
//
//		Order orderx = null;
//		for(Order order : orderList){
//			if(order.getCompleted() == false){
//				orderx = order;
//
//				List<OrderDetail> orderDetailList = order.getOrderDetailList();
//				for(OrderDetail orderDetail : orderDetailList){
//					productList.add(orderDetail.getProduct());
//				}
//				break;
//			}
//			else
//				continue;
//
//		}
//
//		List<OrderDetail> orderDetailList = orderx.getOrderDetailList();
//		mv.addObject("user", user);
////		int total = findSum(orderx);
//		int total = 24;
//		mv.addObject("total", total);
//		return mv;
//	}
//
//	private int findSum( Order order) {
//
//		List<OrderDetail> orderDetailList = order.getOrderDetailList();
//		List<Product> productList = new ArrayList<Product>();
//
//		for(OrderDetail orderDetail : orderDetailList){
//			productList.add(orderDetail.getProduct());
//		}
//
//		int sum =0;
//		for(int i=0; i<productList.size(); i++) {
//			Product p = productList.get(i);
//			sum+= p.getProductPrice();
//		}
//		return sum;
//	}

//	@GetMapping("addToCart/{productId}") //???????????????? ?????????????? ?? ???????????? ??????????, addObject Product LIst ????????????
//	public ModelAndView addToCart(@PathVariable("productId")String productId,Principal principal) {
//		ModelAndView mv = new ModelAndView("profile/cart-product");
//		User user = userService.findByEmail(principal.getName());
//		long productLongId = Long.parseLong(productId);
//		Product product = productService.getProductById(productLongId).get();
//		Order orderx = null;
//		OrderDetail orderDetailx = null;
//
//
//		List<Order> orderList = user.getOrderList();                       ///?????????????????? ?????????????? ???????????????? ??????????
//		List<Product> productList = new ArrayList<Product>();              ///???????????? ????????
//
//		for(Order order: orderList){
//			if(order.getCompleted() == false){                             ///???????????????????? ??????????
////				orderx = order;
//
//				List<OrderDetail> orderDetailList = order.getOrderDetailList();   ///???????????? ???????????? ????????-??????????
//				orderDetailx = new OrderDetail(12,
//						order, product);
//
//				orderDetailList.add(orderDetailx);
//				for (OrderDetail orderDetail : orderDetailList){
//					productList.add(orderDetail.getProduct());                  ///???????????? ?????????????????? ?????? ???????????? ??????????????????????
////					orderDetail.setProduct(product);
//				}
//
//				order.setOrderDetailList(orderDetailList);                      ///order's  orderDetail was updated with new Product
//				orderx = order;
////				user.setOrderList(orderList);
////				order.setOrderDetailList(orderDetailList);
//
//				break;
//			}
//			else
//				continue;
//
//			///???????????????? ???????????? ?????????? ?????? ???????????? ???????? ?????????????????? ?? ???????? ?????????????? ?????????? ??????????????
//		}
//
//		orderList.add(orderx);
//		user.setOrderList(orderList);
//
//
//		orderService.updateOrder(orderx); //???? ????????
//		userService.update(user);
//		productService.addProduct(product);
//		orderDetailService.addOrderDetail(orderDetailx);
//
////		int total = findSum(orderx);
//		int total = 24;
//		mv.addObject("total", total);
//		mv.addObject("user", user);
//
//		System.out.println("blaaaablaa");
//		return mv;
//	}





}
