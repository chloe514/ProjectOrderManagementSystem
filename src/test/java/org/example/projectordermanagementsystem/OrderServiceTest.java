package org.example.projectordermanagementsystem;

import org.example.projectordermanagementsystem.entity.Order;
import org.example.projectordermanagementsystem.repository.OrderRepository;
import org.example.projectordermanagementsystem.service.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OrderServiceTest {

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    @Test
    void testCreateOrder() {
        Order order = new Order("John Doe", LocalDate.now());
        when(orderRepository.save(any(Order.class))).thenReturn(order);

        Order createdOrder = orderService.createOrder(order);
        assertNotNull(createdOrder);
        assertEquals("John Doe", createdOrder.getCustomerName());
    }

    @Test
    void testUpdateOrder() {
        Order existingOrder = new Order("Jane Doe", LocalDate.now());
        existingOrder.setId(1L);

        when(orderRepository.findById(1L)).thenReturn(Optional.of(existingOrder));
        when(orderRepository.save(any(Order.class))).thenReturn(existingOrder);

        Order updatedOrder = orderService.updateOrder(1L, new Order("Jane Smith", LocalDate.now()));
        assertNotNull(updatedOrder);
        assertEquals("Jane Smith", updatedOrder.getCustomerName());
    }

    @Test
    void testDeleteOrder() {
        Order order = new Order("John Doe", LocalDate.now());
        order.setId(1L);

        doNothing().when(orderRepository).deleteById(1L);

        orderService.deleteOrder(1L);

        verify(orderRepository, times(1)).deleteById(1L);
    }

    @Test
    void testGetAllOrders() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("John Doe", LocalDate.now()));
        when(orderRepository.findAll()).thenReturn(orders);

        List<Order> result = orderService.getAllOrders();
        assertEquals(1, result.size());
        assertEquals("John Doe", result.get(0).getCustomerName());
    }
}

