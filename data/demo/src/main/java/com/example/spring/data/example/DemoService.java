package com.example.spring.data.example;

import com.example.spring.data.example.ds1.domain.Entity1;
import com.example.spring.data.example.ds1.repository.Ds1Repository;
import com.example.spring.data.example.ds2.domain.Entity2;
import com.example.spring.data.example.ds2.repository.Ds2Repository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class DemoService {

    private Ds1Repository hsql;
    private Ds2Repository derby;

    public DemoService(@Qualifier("ds1Repository") Ds1Repository hsql, @Qualifier("ds2Repository") Ds2Repository derby) {
        this.derby = derby;
        this.hsql = hsql;
    }

    @Transactional("transactionManager")
    public void service1() {
        System.out.println(hsql.findAll());
        System.out.println(derby.findAll());
        hsql.saveAndFlush(new Entity1(1L, "one"));
        //derby.saveAndFlush(new Entity2(2L, "two"));
        System.out.println(hsql.findAll());
        System.out.println(derby.findAll());
    }

}
