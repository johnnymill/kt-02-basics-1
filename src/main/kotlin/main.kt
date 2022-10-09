import kotlin.math.roundToInt

fun main() {
    val amount = 10_000
    val commission_min = 35
    val commission_pc = 0.0075f
    var commission: Int

    commission = (amount * commission_pc).roundToInt()
    if (commission < commission_min)
        commission = commission_min

    println("Transfer $amount RUB with commission $commission RUB")
}