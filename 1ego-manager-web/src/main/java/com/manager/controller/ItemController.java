package com.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.pojo.Titem;
import com.manager.service.ItemService;
/**
 * 商品控制器
 * @author sx
 * @version 1.0 2018-1-23
 */
@Controller
public class ItemController {
	@Autowired
	ItemService itemService;
	
	/**
	 * 根据商品编号查询商品信息
	 * @param itemId
	 * @return Titem
	 */
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public Titem getItemById(@PathVariable Long itemId) {
		Titem titem=itemService.getItemById(itemId);
		return titem;
	}
}
