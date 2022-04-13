package com.SvTech.SpringApi.repo;

import com.SvTech.SpringApi.models.InventoryCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryCategoryRepo extends JpaRepository<InventoryCategory, Integer> {
}
