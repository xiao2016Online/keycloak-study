package com.xiaopy.keycloakdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author xiaopeiyu
 * @since 2019/7/10
 */
@Controller
public class ProductController {
	@GetMapping("/products")
	public String getProducts(Model model){
		 model.addAttribute("products", Arrays.asList("iPad air","iPhone","iPod"));
		return "products";
	}

	@GetMapping(path = "/logout")
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "/";
	}
}
