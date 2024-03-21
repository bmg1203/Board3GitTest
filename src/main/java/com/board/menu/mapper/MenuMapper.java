package com.board.menu.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.board.menu.domain.MenuVo;

@Mapper
public interface MenuMapper {

	void insertMenu(MenuVo menuVo);

}
