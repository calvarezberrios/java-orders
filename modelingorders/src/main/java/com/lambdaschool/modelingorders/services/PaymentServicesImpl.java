package com.lambdaschool.modelingorders.services;

import com.lambdaschool.modelingorders.models.Payment;
import com.lambdaschool.modelingorders.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "paymentService")
public class PaymentServicesImpl implements PaymentServices
{
    @Autowired
    PaymentRepository paymentrepo;

    @Transactional

    @Override
    public Payment save(Payment payment)
    {
        return paymentrepo.save(payment);
    }
}
