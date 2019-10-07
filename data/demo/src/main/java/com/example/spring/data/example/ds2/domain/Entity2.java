package com.example.spring.data.example.ds2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ENTITY2")
public class Entity2 {

    public Entity2() {
    }

    public Entity2(Long id, String field1) {
        this.id = id;
        this.field1 = field1;
    }

    @Id
    Long id;
    @Column(name = "FIELD1")
    String field1;

    @Override
    public String toString() {
        return "Entity2{" +
                "id=" + id +
                ", field1='" + field1 + '\'' +
                '}';
    }

}
