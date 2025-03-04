package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.DTO.OrderDTO;
import com.devsuperior.dscommerce.repositories.OrderRepository;
import com.devsuperior.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id){
        var dto = orderRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Produto não encontrado"));
        return new OrderDTO(dto);
    }

}