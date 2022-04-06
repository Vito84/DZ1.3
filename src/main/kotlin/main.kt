package ru.netology

const val ITEM_PRICE = 127                      // Прайс
const val MINIMUM_DISCOUNT = 100                  // Минимальная скидка
const val MAXIMUM_DISCOUNT = (100 - 5) / 100.toDouble()    // Максимальная скидка
const val ADDITIONAL_DISCOUNT = (100 - 1) / 100.toDouble()    // Доп. скидка

fun main() {
    val totalPurchasesForAllTime: Int = 16000
    print("Введите количество дисков: ")
    val itemCount = readLine()!!.toInt()
    val amountRub = itemCount * ITEM_PRICE

    val discountedAmountRub = if (amountRub <= 10_000 && amountRub > 1000) {
        amountRub - MINIMUM_DISCOUNT
    } else if (amountRub > 10_000) {
        amountRub * MAXIMUM_DISCOUNT
    } else {
        amountRub
    }
    val meloman = if (totalPurchasesForAllTime > 15_000) {
        discountedAmountRub.toDouble() * ADDITIONAL_DISCOUNT
    } else {
        discountedAmountRub
    }
    val ruble = meloman.toInt()
    val kopeck = (meloman.toDouble() * 100).toInt() % 100
    println("Сумма вашей покупки: $ruble рублей $kopeck копеек")


}