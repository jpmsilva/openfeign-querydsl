package com.querydsl.examples.kotlin.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import java.io.Serializable

@MappedSuperclass
abstract class ExampleBaseEntity<ID : Serializable> {

	@field:Id
	@field:GeneratedValue(strategy = GenerationType.AUTO)
	var id: ID? = null
}