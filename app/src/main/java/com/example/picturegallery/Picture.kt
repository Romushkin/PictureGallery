package com.example.picturegallery

import java.io.Serializable

class Picture (
    val title: String,
    val author: String,
    val imageView: Int
): Serializable {

    companion object {
        val viewPagerList = mutableListOf(
            Picture("Демон сидящий","Автор: Михаил Врубель", R.drawable.one),
            Picture("Грачи прилетели","Автор: Алексей Саврасов", R.drawable.two),
            Picture("Царевна-Лебедь","Автор: Михаил Врубель", R.drawable.three),
            Picture("Лунная ночь на Днепре","Автор: Архип Куинджи", R.drawable.four),
            Picture("Неизвестная","Автор: Иван Крамской", R.drawable.five),
            Picture("Троица","Автор: Андрей Рублёв", R.drawable.six),
            Picture("За туалетом. Автопортрет","Автор: Зинаида Серебрякова", R.drawable.seven),
            Picture("Девятый вал","Автор: Иван Айвазовский", R.drawable.eight),
            Picture("Девочка с персиками","Автор: Валентин Серов", R.drawable.nine),
            Picture("Московский дворик","Автор: Василий Поленов", R.drawable.ten)
            )
    }
}