package com.oopssinsa.controller;

import com.oopssinsa.model.dto.AccountDto;
import com.oopssinsa.model.dto.IbDetailDto;
import com.oopssinsa.model.dto.ProductDto;
import com.oopssinsa.model.service.MenuService;
import com.oopssinsa.view.MenuView;
import com.oopssinsa.view.ResultView;

public class MenuController {
    private MenuService menuService = new MenuService();

    public void insertProduct(ProductDto productDto) {
        int result = menuService.insertProduct(productDto);
        ResultView.displayInsertProductResult("상품 등록", result);
    }

    public void ibRequest(IbDetailDto ibDetailDto) {
        int result = menuService.ibRequest(ibDetailDto);
        ResultView.displayIbRequestResult("입고 요청", result);
    }


    public AccountDto login(String id) {
        try {
            AccountDto accountDto = menuService.login(id);
            ResultView.displayMenu(accountDto);
            return accountDto;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}