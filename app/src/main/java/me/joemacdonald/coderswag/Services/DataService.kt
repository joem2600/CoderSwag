package me.joemacdonald.coderswag.Services

import me.joemacdonald.coderswag.Model.Category
import me.joemacdonald.coderswag.Model.Product


object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatsimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Graphic Black", "$20", "hat2"),
            Product("Devslopes Graphic White", "$18", "hat3"),
            Product("Devslopes Graphic Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$32", "hoodie2"),
            Product("Devslopes Hoodie White", "$28", "hoodie3"),
            Product("Devslopes Hoodie Black", "$32", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt1"),
            Product("Devslopes Shirt Light Gray", "$20", "shirt2"),
            Product("Devslopes Shirt Red", "$18", "shirt3"),
            Product("Devslopes Shirt Hustle", "$18", "shirt4"),
            Product("Kickflip", "$18", "shirt5")
    )
}