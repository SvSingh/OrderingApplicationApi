package com.SvTech.SpringApi.Services;


import com.SvTech.SpringApi.models.InventoryCategory;

import com.SvTech.SpringApi.repo.InventoryCategoryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class InventroyCategoryService {

    @Autowired
    private InventoryCategoryRepo inventoryCategoryRepo;

    public List<InventoryCategory> ListAllCategories(){
        return inventoryCategoryRepo.findAll();
    }

    @Transactional
    public InventoryCategory saveCategory(InventoryCategory inventoryCategory) {
             return(inventoryCategoryRepo.save(inventoryCategory));
    }

    public InventoryCategory getInventoryCategory(Integer id) {
        return inventoryCategoryRepo.findById(id).get();
    }
    @Transactional
    public void deleteInventoryCategory(Integer id) {
        inventoryCategoryRepo.deleteById(id);
    }

}
