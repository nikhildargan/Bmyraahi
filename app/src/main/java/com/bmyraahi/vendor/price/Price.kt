package com.bmyraahi.vendor.price


enum class RowType {
    PRICE,
    NO_PRICE
}

data class Price(var type: RowType, val price: Int?)
