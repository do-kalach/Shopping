package com.agening.shopping.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {

        return shopListRepository.getShopItem(shopItemId)

    }

}