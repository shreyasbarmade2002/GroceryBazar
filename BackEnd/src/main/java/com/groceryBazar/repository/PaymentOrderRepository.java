package com.groceryBazar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groceryBazar.model.PaymentOrder;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder,Long> {

    PaymentOrder findByPaymentLinkId(String paymentId);
}
