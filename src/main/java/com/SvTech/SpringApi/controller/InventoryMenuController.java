package com.SvTech.SpringApi.controller;


import com.SvTech.SpringApi.Services.InventoryMenuService;
import com.SvTech.SpringApi.models.InventoryCategory;
import com.SvTech.SpringApi.models.InventoryMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/menu")
public class InventoryMenuController {
    @Autowired
    InventoryMenuService inventoryMenuService;

    @GetMapping("")
    public List<InventoryMenu> getMenu(){
      return inventoryMenuService.ListAllMenu();
    }

    @GetMapping("/{id}")
    public InventoryMenu get(@PathVariable Integer id) {

            InventoryMenu inventoryMenu = inventoryMenuService.getInventoryMenu(id);
            return inventoryMenu;
    }

    @PostMapping("")
    public InventoryMenu saveMenu(InventoryMenu inventoryMenu){
        return  inventoryMenuService.saveInventoryMenu(inventoryMenu);

    }
    @PutMapping("{id}")
    public InventoryMenu changeMenu(InventoryMenu inventoryMenu, @PathVariable Integer id){
        InventoryMenu existMenu = inventoryMenuService.getInventoryMenu(id);
       inventoryMenu.setId(existMenu.getId());
        return inventoryMenuService.saveInventoryMenu(inventoryMenu);
    }

    @DeleteMapping("")
    public String DeleteMenu(@RequestParam Integer id){
        inventoryMenuService.deleteInventory(id);
        return "deleted";
    }
}
