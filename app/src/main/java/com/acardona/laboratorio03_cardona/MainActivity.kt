package com.acardona.laboratorio03_cardona

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var cashTextView: TextView
    private lateinit var fiveCents: ImageView
    private lateinit var tenCents: ImageView
    private lateinit var twentyFiveCents: ImageView
    private lateinit var oneDollar: ImageView
    private var cash = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()
        setClickListeners()

        cashTextView.text = "$${cash}"

    }

    private fun bind() {
        cashTextView = findViewById(R.id.cash_text_view)
        fiveCents = findViewById(R.id.five_cents_image_view)
        tenCents = findViewById(R.id.ten_cents_view_image)
        twentyFiveCents = findViewById(R.id.twenty_five_cents_image_view)
        oneDollar = findViewById(R.id.one_dollar_image_view)
    }

    private fun setClickListeners() {
        fiveCents.setOnClickListener {
            cash += 0.05
            cash = String.format("%.2f", cash).toDouble()

            cashTextView.text = "$${cash}"
        }

        tenCents.setOnClickListener {
            cash += 0.10
            cash = String.format("%.2f", cash).toDouble()

            cashTextView.text = "$${cash}"
        }

        twentyFiveCents.setOnClickListener {
            cash += 0.25
            cash = String.format("%.2f", cash).toDouble()

            cashTextView.text = "$${cash}"
        }

        oneDollar.setOnClickListener {
            cash += 1.00
            cash = String.format("%.2f", cash).toDouble()

            cashTextView.text = "$${cash}"
        }
    }
}