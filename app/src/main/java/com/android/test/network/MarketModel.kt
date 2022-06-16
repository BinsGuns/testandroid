package com.android.test.network

data class MarketModel(
    val marketSummaryAndSparkResponse: MarketSummaryAndSparkResponse
)

data class MarketSummaryAndSparkResponse(
    val error: Any,
    val result: List<Result>
)

data class Result(
    val customPriceAlertConfidence: String,
    val exchange: String,
    val exchangeDataDelayedBy: Int,
    val exchangeTimezoneName: String,
    val exchangeTimezoneShortName: String,
   // val firstTradeDateMilliseconds: Int,
    val fullExchangeName: String,
   // val gmtOffSetMilliseconds: Int,
    val language: String,
    val market: String,
    val marketState: String,
    val priceHint: Int,
    val quoteType: String,
    val region: String,
    val regularMarketPreviousClose: RegularMarketPreviousClose,
    val regularMarketTime: RegularMarketTime,
    val shortName: String,
    val sourceInterval: Int,
    val symbol: String,
    val tradeable: Boolean,
    val triggerable: Boolean
)

data class RegularMarketPreviousClose(
    val fmt: String,
    val raw: Double
)

data class RegularMarketTime(
    val fmt: String,
    val raw: Int
)