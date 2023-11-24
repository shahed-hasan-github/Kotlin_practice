package com.example.kotlin_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        fun printNotificationSummary(morningNotification: Int) {
            val numberOfMessages = 121;
            if (numberOfMessages < 100) {
                println("You have ${numberOfMessages} notifications.")
            } else {
                println("Your phone is blowing up! You have 99+ notifications.")
            }
        }

        fun mobile_notification() {
            val morningNotification = 51
            val eveningNotification = 135

            printNotificationSummary(morningNotification)
            printNotificationSummary(eveningNotification)
        }



        fun ticketPrice(child: Int, monday: Boolean): Int {
            val age =6;
            return when(age) {
                in 0..12 -> 15
                in 61..100 -> 20
                else -> -1
            }
        }

        fun ticket() {
            val child = 5
            val adult = 28
            val senior = 87

            val isMonday = true

            println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
            println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
            println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
        }

        fun printFinalTemperature(
            initialMeasurement: Double,
            initialUnit: String,
            finalUnit: String,
            conversionFormula: (Double) -> Double
        ) {
            val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
            println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
        }

        fun auctionPrice(winningBid: Bid?, i: Int): String {

            return TODO("Provide the return value")
        }

        fun main() {
            val winningBid = Bid(5000, "Private Collector")

            println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
            println("Item B is sold at ${auctionPrice(null, 3000)}.")
        }

        class Bid(val amount: Int, val bidder: String)

        fun auctionPrice(bid: Bid?, minimumPrice: Int) {
            // Fill in the code.
        }



    }
    class Phone(var isScreenLightOn: Boolean = false){
        fun switchOn() {
            isScreenLightOn = true
        }

        fun switchOff() {
            isScreenLightOn = false
        }

        fun checkPhoneScreenLight() {
            val phoneScreenLight = if (isScreenLightOn) "on" else "off"
            println("The phone screen's light is $phoneScreenLight.")
        }
    }
}

class Bid(i: Int, s: String) {
    private val amount: Int? = null

    fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
        return bid?.amount ?: minimumPrice
}}
