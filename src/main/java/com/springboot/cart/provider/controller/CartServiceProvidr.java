package com.springboot.cart.provider.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.cart.provider.model.Cart;

@RestController
@RequestMapping("/cart")
public class CartServiceProvidr {
@Value("{server.port}")	
private String port;
@GetMapping("/info")
public String getMsg()
{
	return "CONSUMER:"+port;
}
@GetMapping("/data")
public Cart getObj()
{
	return new Cart(109,"ABC:"+port, 8000.0);
}
@GetMapping("/list")
public List<Cart> getObjs()
{
	return Arrays.asList(
			new Cart(101,"A:"+port,7890.0),
			new Cart(102,"B:"+port,6780.0),
			new Cart(103,"C:"+port,8900.0));
}
}
