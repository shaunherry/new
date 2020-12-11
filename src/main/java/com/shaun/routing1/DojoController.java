package com.shaun.routing1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



	
@RestController
public class DojoController {
		@RequestMapping("/{var}")
		public String hello(@PathVariable("var") String var) {
			if(var.equalsIgnoreCase("dojo")) {
				return "The "+ var +" is cool";
			} else if(var.equalsIgnoreCase("burbank-dojo")){
				return "Burbank is in SoCal";
			} else if(var.equalsIgnoreCase("san-jose")) {
				return "San Jose is the HQ";
			} else {
			return "Getting familiar with routes hahaah";
			}
}
}
		
