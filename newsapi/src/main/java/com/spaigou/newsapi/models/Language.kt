package com.spaigou.newsapi.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class Language {
    @SerialName("ar")
    AR,

    @SerialName("de")
    DE,

    @SerialName("en")
    EN,

    @SerialName("es")
    ES,

    @SerialName("fr")
    FR,

    @SerialName("je")
    HE,

    @SerialName("it")
    IT,

    @SerialName("nl")
    NL,

    @SerialName("no")
    NO,

    @SerialName("pt")
    PT,

    @SerialName("ru")
    RU,

    @SerialName("sv")
    SV,

    @SerialName("ud")
    UD,

    @SerialName("zh")
    ZH
}