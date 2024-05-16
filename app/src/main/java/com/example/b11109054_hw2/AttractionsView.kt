package com.example.b11109054_hw2

import androidx.lifecycle.ViewModel

class AttractionsView : ViewModel() {
    val attractions = listOf(
        Attraction(
            name = "鹿苑寺",
            frontpagedes = "又名金閣，是一座最早完成於1397年的日本佛寺",
            description = "歷史悠久的寧靜寺廟，牆面金碧輝煌，坐落在景觀花園和會反射倒影的池塘中。",
            address = "1 Kinkakujicho, Kita Ward, Kyoto, 603-8361, Japan",
            imageResourceID = R.drawable.king
        ),
        Attraction(
            name = "貴船茶屋",
            frontpagedes = "就在貴船神社旁邊，風景絕佳。",
            description = "貴船茶屋位於京都市北部的貴船地區，提供傳統的日式茶點和觀賞清流的湯川河景致，是一個寧靜的休憩地點。",
            address = "69 Kuramakibunecho, Sakyo Ward, Kyoto, 601-1112日本",
            imageResourceID = R.drawable.gai,
            rating = "4.4",
            phoneNumber = "+81 75-741-2148"
        ),
        Attraction(
            name = "Small World Tokyo",
            frontpagedes = "造小人辣！可以做自己的迷你版模型！",
            description = "東京的一個迷你主題樂園，展示了精緻的真實迷你景點模型以及還原動漫場景及角色，還可以製作自己的小人放在景點裡！",
            address = "日本〒135-0063 Tokyo, Koto City, Ariake, 1 Chome−3−33 有明物流センター",
            imageResourceID = R.drawable.small_worlds_miniature_museum
        ),
        Attraction(
            name = "築地市場",
            frontpagedes = "去日本就要吃海鮮！便宜好吃的海鮮料理都在這。",
            description = "築地市場是東京最大的海鮮市場，擁有各式各樣的新鮮海鮮和壽司店，是品嚐地道日本海鮮料理的絕佳去處。",
            address = "日本〒104-0045 Tokyo, Chuo City, Tsukiji, 4 Chome, 及び６丁目一部",
            imageResourceID = R.drawable.jo,
            rating = "4.2",
            phoneNumber = "無特定店家，可品嚐各種新鮮海鮮和壽司"
        ),
        Attraction(
            name = "道頓堀",
            frontpagedes = "買買買的地方，還有「固力果跑跑人」可以一起合照。",
            description = "道頓堀是大阪市中心的繁華地區，以其霓虹燈和美食街而聞名，是大阪夜生活的中心。",
            address = "1 Chome Dotonbori, 中央區大阪市大阪府 542-0071日本",
            imageResourceID = R.drawable.da
        ),
        Attraction(
            name = "章魚八 道頓堀總本店",
            frontpagedes = "吃日本的章魚小丸子，別再吃日船了！",
            description = "章魚小丸子超爆好吃",
            address = "1 Chome-5-１０ Dotonbori, Chuo Ward, Osaka, 542-0071日本",
            imageResourceID = R.drawable.oc,
            rating = "3.8",
            phoneNumber = "+81 66-211-4684"
        ),
        Attraction(
            name = "奈良公園",
            frontpagedes = "去看很多佛寺，順便運動給鹿追。",
            description = "奈良公園是一個歷史悠久的城市公園，有數百只自由漫遊的梅花鹿和多個古老的佛寺。聽說最近遊客太多，鹿都不想吃鹿仙貝了。",
            address = "奈良市雑司町",
            imageResourceID = R.drawable.nai
        ),
        Attraction(
            name = "Sakura 吉野葛佐久良",
            frontpagedes = "傳統和菓子店，喜歡吃甜點必吃！",
            description = "是奈良市的一家傳統和菓子店，提供各種精緻的和菓子，是品嚐傳統日本甜點的好地方。",
            address = "2 Takamikadocho, Nara, 630-8336日本",
            imageResourceID = R.drawable.sakura,
            rating = "4.5",
            phoneNumber = " +81 742-26-3888"
        ),
        Attraction(
            name = "名古屋城",
            frontpagedes = "一堆有名古人住過那，屋頂看起來很清新。",
            description = "名古屋城是日本歷史上的一個重要城堡，屋頂綠綠的:)",
            address = "1-1 Honmaru, Naka Ward, Nagoya, Aichi 460-0031日本",
            imageResourceID = R.drawable.ming
        ),
        Attraction(
            name = "矢場丼 名古屋站名鐵店",
            frontpagedes = "名古屋的著名料理：味噌豬排",
            description = "名古屋名物みそかつ是名古屋市的一道著名料理（其實就是味噌豬排），以獨特的味道和口感而聞名。",
            address = "日本〒450-0002 Aichi, Nagoya, Nakamura Ward, Meieki, 1 Chome−2−1 名鉄百貨店本館 9階",
            imageResourceID = R.drawable.shi,
            rating = "4.1",
            phoneNumber = "+81 50-5494-5369"
        )
    )
}
