package com.dycle.maxcursos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dycle.maxcursos.entities.OrderItem;
import com.dycle.maxcursos.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}

