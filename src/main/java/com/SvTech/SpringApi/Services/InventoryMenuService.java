package com.SvTech.SpringApi.Services;

import com.SvTech.SpringApi.models.InventoryMenu;
import com.SvTech.SpringApi.repo.InventoryMenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class InventoryMenuService {

    @Autowired
    private InventoryMenuRepo inventorymenurepo;

    public List<InventoryMenu> ListAllMenu(){
         return inventorymenurepo.findAll();
    }
    @Transactional
    public InventoryMenu saveInventoryMenu(InventoryMenu menu) {
        return inventorymenurepo.save(menu);
    }

    public InventoryMenu getInventoryMenu(Integer id) {
        return inventorymenurepo.findById(id).get();
    }
    @Transactional
    public void deleteInventory(Integer id) {
        inventorymenurepo.deleteById(id);
    }

}
