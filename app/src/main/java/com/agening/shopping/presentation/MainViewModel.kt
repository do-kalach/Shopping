package com.agening.shopping.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agening.shopping.data.ShopListRepositoryImpl
import com.agening.shopping.domain.DeleteShopItemUseCase
import com.agening.shopping.domain.EditShopItemUseCase
import com.agening.shopping.domain.GetShopListUseCase
import com.agening.shopping.domain.ShopItem

class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem){
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}