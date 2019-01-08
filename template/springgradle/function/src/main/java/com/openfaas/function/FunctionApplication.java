package com.openfaas.function;

import com.openfaas.function.service.IHandlerService;
import com.openfaas.function.service.impl.HandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunctionApplication.class, args);
		IHandlerService handlerService = new HandlerService();
		handlerService.Handler();
	}

//	@RequestMapping("")
//	public String get(){
//		return "success";
//	}

}

