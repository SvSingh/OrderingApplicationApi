package com.SvTech.SpringApi.controller;

import com.SvTech.SpringApi.Services.InventroyCategoryService;
import com.SvTech.SpringApi.models.InventoryCategory;
import com.SvTech.SpringApi.repo.InventoryCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/category")
public class InventoryCategoryController {
    @Autowired
    private InventroyCategoryService inventroyCategoryService;

    @GetMapping("")
    public List<InventoryCategory> getCategory(){
        return inventroyCategoryService.ListAllCategories();
    }

    @GetMapping("{id}")
    public InventoryCategory getCategorybyID(@PathVariable Integer id){
        InventoryCategory inventoryCategory = inventroyCategoryService.getInventoryCategory(id) ;
        return inventoryCategory;
    }

    @PostMapping("")
    public InventoryCategory saveCategory(InventoryCategory inventoryCategory){
       return  inventroyCategoryService.saveCategory(inventoryCategory);

    }
    @PutMapping("{id}")
    public InventoryCategory changeCategory(InventoryCategory inventoryCategory, @PathVariable Integer id){
        InventoryCategory existInventoryCategory = inventroyCategoryService.getInventoryCategory(id);
        existInventoryCategory.setName(inventoryCategory.getName());
        return inventroyCategoryService.saveCategory(existInventoryCategory);
    }

    @DeleteMapping("")
    public String DeleteCategory(@RequestParam Integer id){
       inventroyCategoryService.deleteInventoryCategory(id);
       return "deleted";
    }
}
