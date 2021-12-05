package com.agening.shopping.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.agening.shopping.R
import com.agening.shopping.databinding.ActivityShopItemBinding

class ShopItemActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShopItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityShopItemBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }


    }
}