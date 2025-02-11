package com.querydsl.example.ksp

import jakarta.persistence.Entity
import jakarta.persistence.OneToMany

@Entity
class Person(
    val name: String,

    @OneToMany(mappedBy = "owner")
    val cats: List<Cat>? = null,
) : BaseEntity<Int>()
