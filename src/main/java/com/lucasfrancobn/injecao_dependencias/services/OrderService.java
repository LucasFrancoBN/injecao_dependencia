package com.lucasfrancobn.injecao_dependencias.services;

import com.lucasfrancobn.injecao_dependencias.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  @Autowired
  private ShippingService shippingService;

  public double total(Order order) {
    Double percentageDiscount = (100.0 - order.getDiscount()) / 100.0;
    return order.getBasic() * percentageDiscount + shippingService.shipment(order);
  }
}
