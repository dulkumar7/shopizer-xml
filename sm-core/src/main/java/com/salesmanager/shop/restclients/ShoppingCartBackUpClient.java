/*package com.salesmanager.shop.restclients;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.salesmanager.core.business.services.shoppingcart.ShoppingCartServiceImpl;
import com.salesmanager.core.model.customer.Customer;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.shoppingcart.ShoppingCart;
import lombok.extern.slf4j.Slf4j;

@slf4j
@Service
public class ShoppingCartBackUpClient {
	
	private String url = "http://localhost:8081/shoppingcart/";
	
	@Autowired
	private ShoppingCartServiceImpl shoppingCartService;
	
	
	
	public ShoppingCart getByCustomer(final Customer customer){
		
			return invokeService(url+"customer?customerId="+customer.getId(), HttpMethod.GET,null).getBody();
			
			
	}
	
	public ShoppingCartData getByCartIdAndCode(String code, MerchantStore store, Language language){
			ShoppingCart cartModel = invokeService(url+store.getId()+"/"+code, HttpMethod.GET, null).getBody();
			;
			if(cartModel!=null) {
				ShoppingCartData cart = shoppingCartFacade.getShoppingCartData(cartModel, language);
				return cart;
			}
		} catch( Exception nre) {
			return null;
		}
		return null;

		
	
	
	public ShoppingCart getByCartIdAndCode(String code, MerchantStore store ){
			ShoppingCart cartModel = invokeService(url+store.getId()+"/"+code, HttpMethod.GET, null).getBody();
			
		return cartModel;
		}

		
	
	
	public ShoppingCart getByCart(final Customer customer){
		
			ShoppingCart shoppingCart = invokeService("/cart", HttpMethod.POST, parseObjectNode(customer)).getBody();
			
			
			return shoppingCart;
	}
	
	public ShoppingCart getByMerchant(final Customer customer){
		return invokeService("/merchant", HttpMethod.POST, parseObjectNode(customer)).getBody();
	}
	
	
	public ResponseEntity<ShoppingCart> invokeService(String uri, HttpMethod httpMethod, ObjectNode reqestObject ){
		Log.info("+++++++++++++++++++++++++  Invoking external service:- {}", uri);
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-", "application/json;Charset-UTF-8");
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		  ResponseEntity<ShoppingCart> shoppingCart = restTemplate.exchange(uri, httpMethod, new HttpEntity<>(reqestObject, headers), ShoppingCart.class);
		if(null != shoppingCart && null != shoppingCart.getBody() ){
		  Log.info("+++++++++++++++++++++++++ Response back from external service:- {}", shoppingCart.getBody().toString());
		Log.info("+++++++++++++++++++++++++  Http Rsponse back from external service:- {}", shoppingCart.getStatusCode().toString());
		return shoppingCart;
		
		}
		return null;
	}
	
	
	private ObjectNode parseObjectNode(final Object obj){
		ObjectMapper mapper = new ObjectMapper();
		return mapper.convertValue(obj, ObjectNode.class);
	}

}
*/