package com.mgtv.tutorials.service.impl;

import com.mgtv.tutorials.dao.PaymentDao;
import com.mgtv.tutorials.entity.Payment;
import com.mgtv.tutorials.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements PaymentService {

    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
