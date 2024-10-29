package com.example.Springboot_WarFile_Example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
	@RequestMapping ("/test")
	public String test()
	{
		return " test for war file";
	}

}
