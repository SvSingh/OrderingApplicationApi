package com.SvTech.SpringApi.repo;

import com.SvTech.SpringApi.models.InventoryMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryMenuRepo  extends JpaRepository<InventoryMenu, Integer> {
}
