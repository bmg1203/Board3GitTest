package com.board.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.menu.domain.MenuVo;
import com.board.menu.mapper.MenuMapper;

@Controller
@RequestMapping("/Menus")
public class MenuController {
	@Autowired
	private MenuMapper menuMapper;
	
	@RequestMapping("/WriteForm")
	public String writeForm() {
		return "menus/write";
	}
	
	@RequestMapping("/Write")
	public String write(MenuVo menuVo) {
		menuMapper.insertMenu(menuVo);
		
		return "menus/list";
	}
}
