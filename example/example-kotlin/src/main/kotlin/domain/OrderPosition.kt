package io.holunda.camunda.bpm.data.example.kotlin.domain

import java.math.BigDecimal

data class OrderPosition(
  val title: String,
  val netCost: BigDecimal,
  val amount: Long
)
