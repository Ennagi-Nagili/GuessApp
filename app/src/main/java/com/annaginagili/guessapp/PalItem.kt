package com.annaginagili.guessapp

class PalItem {
    var name: String? = null
    var image: Int? = null
    var time: String? = null
    var percent: String? = null

    companion object {
        fun getData(nameList: List<String>, imageList: List<Int>, timeList: List<Int>,
        percentList: List<Int>): List<PalItem> {
            val items = ArrayList<PalItem>()
            for (i in nameList.indices) {
                val item = PalItem()
                item.name = nameList[i]
                item.image = imageList[i]
                item.time = timeList[i].toString() + " Minutes"
                item.percent = percentList[i].toString() + "%"
                items.add(item)
            }
            return items
        }
    }
}