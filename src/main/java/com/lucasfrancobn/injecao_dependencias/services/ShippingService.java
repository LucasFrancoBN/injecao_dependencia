package com.lucasfrancobn.injecao_dependencias.services;

import com.lucasfrancobn.injecao_dependencias.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
  public double shipment(Order order) {
    Double basicValue = order.getBasic();
    if(basicValue < 100.0)
      return 20.0;
    else if(basicValue < 200.0)
      return 12.0;
    return 0.0;
  }
}
