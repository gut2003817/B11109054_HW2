package com.example.b11109054_hw2


import androidx.lifecycle.ViewModel

class AttractionsView : ViewModel() {
    val attractions = listOf(
        Attraction(
            name = "金閣寺",
            description = "歷史悠久的寧靜寺廟，牆面金碧輝煌，坐落在景觀花園和會反射倒影的池塘中。",
            address = "1 Kinkakujicho, Kita Ward, Kyoto, 603-8361日本",
            imageResourceID = R.drawable.金閣寺
        ),
        Attraction(
            name = "貴船茶屋",
            description = "貴船茶屋位於京都市北部的貴船地區，提供傳統的日式茶點和觀賞清流的湯川河景致，是一個寧靜的休憩地點。" +
                          "Google 評分：4.4" +
                          "電話：+81 75-741-2148",
            address = "69 Kuramakibunecho, Sakyo Ward, Kyoto, 601-1112日本",
            imageResourceID = R.drawable.貴船茶屋
        ),
        Attraction(
            name = "Small Worlds Miniature Museum (Small World Tokyo)",
            description = "東京的一個迷你主題樂園，展示了精緻的真實迷你景點模型以及還原動漫場景及角色，還可以製作自己的小人放在景點裡！",
            address = "日本〒135-0063 Tokyo, Koto City, Ariake, 1 Chome−3−33 有明物流センター",
            imageResourceID = R.drawable.SmallWorldsMiniatureMuseum
        ),
        Attraction(
            name = "築地市場",
            description = "築地市場是東京最大的海鮮市場，擁有各式各樣的新鮮海鮮和壽司店，是品嚐地道日本海鮮料理的絕佳去處。" +
                          "Google 評分：4.2" +
                          "無特定店家，可品嚐各種新鮮海鮮和壽司",
            address = "日本〒104-0045 Tokyo, Chuo City, Tsukiji, 4 Chome, 及び６丁目一部",
            imageResourceID = R.drawable.築地市場
        ),
        Attraction(
            name = "道頓堀",
            description = "道頓堀是大阪市中心的繁華地區，以其霓虹燈和美食街而聞名，是大阪夜生活的中心。（小姐匡起來！！）",
            address = "1 Chome Dotonbori, 中央區大阪市大阪府 542-0071日本",
            imageResourceID = R.drawable.道頓堀
        ),
        Attraction(
            name = "章魚八 道頓堀總本店",
            description = "章魚小丸子超爆好吃==" +
                          "Google 評分：ˇ3.8" +
                          "電話：+81 66-211-4684",
            address = "1 Chome-5-１０ Dotonbori, Chuo Ward, Osaka, 542-0071日本",
            imageResourceID = R.drawable.章魚八_道頓堀總本店
        ),
        Attraction(
            name = "奈良公園",
            description = "奈良公園是一個歷史悠久的城市公園，有數百只自由漫遊的梅花鹿和多個古老的佛寺。聽說最近遊客太多，鹿都不想吃鹿仙貝了。",
            address = "奈良市雑司町",
            imageResourceID = R.drawable.奈良公園
        ),
        Attraction(
            name = "Sakura 吉野葛佐久良",
            description = "是奈良市的一家傳統和菓子店，提供各種精緻的和菓子，是品嚐傳統日本甜點的好地方。",
            address = "2 Takamikadocho, Nara, 630-8336日本",
            imageResourceID = R.drawable.Sakura_吉野葛佐久良
        ),
        Attraction(
            name = "名古屋城",
            description = "名古屋城是日本歷史上的一個重要城堡，屋頂綠綠的:)",
            address = "1-1 Honmaru, Naka Ward, Nagoya, Aichi 460-0031日本",
            imageResourceID = R.drawable.名古屋城
        ),
        Attraction(
            name = "矢場丼 名古屋站名鐵店",
            description = "名古屋名物みそかつ是名古屋市的一道著名料理（其實就是味噌豬排），以獨特的味道和口感而聞名。餓了，一起去日本嗎？",
            address = "日本〒450-0002 Aichi, Nagoya, Nakamura Ward, Meieki, 1 Chome−2−1 名鉄百貨店本館 9階",
            imageResourceID = R.drawable.矢場丼_名古屋站名鐵店
        )

    )
}
