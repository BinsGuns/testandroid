package com.android.test.network
data class StockModel(
    val financialsTemplate: FinancialsTemplate,
    val futuresChain: FuturesChain,
    val pageViews: PageViews,
    val price: Price,
    val quoteType: QuoteType,
    val summaryDetail: SummaryDetail,
    val symbol: String
)

class FinancialsTemplate

data class FuturesChain(
    val futures: List<String>,
   // val futuresChainDetails: FuturesChainDetails,
    val maxAge: Int
)

class PageViews

data class Price(
    val averageDailyVolume10Day: AverageDailyVolume10Day,
    val averageDailyVolume3Month: AverageDailyVolume3Month,
    val circulatingSupply: CirculatingSupply,
    val currency: String,
    val currencySymbol: String,
    val exchange: String,
    val exchangeDataDelayedBy: Int,
    val exchangeName: String,
    val expireDate: ExpireDate,
    val fromCurrency: Any,
    val lastMarket: Any,
    val longName: Any,
    val marketCap: MarketCap,
    val marketState: String,
    val maxAge: Int,
    val openInterest: OpenInterest,
    val postMarketChange: PostMarketChange,
    val postMarketPrice: PostMarketPrice,
    val preMarketChange: PreMarketChange,
    val preMarketPrice: PreMarketPrice,
    val priceHint: PriceHint,
    val quoteSourceName: String,
    val quoteType: String,
    val regularMarketChange: RegularMarketChange,
    val regularMarketChangePercent: RegularMarketChangePercent,
    val regularMarketDayHigh: RegularMarketDayHigh,
    val regularMarketDayLow: RegularMarketDayLow,
    val regularMarketOpen: RegularMarketOpen,
    val regularMarketPreviousClose: RegularMarketPreviousClose,
    val regularMarketPrice: RegularMarketPrice,
    val regularMarketSource: String,
    val regularMarketTime: Int,
    val regularMarketVolume: RegularMarketVolume,
    val shortName: String,
    val strikePrice: StrikePrice,
    val symbol: String,
    val toCurrency: Any,
    val underlyingSymbol: String,
    val volume24Hr: Volume24Hr,
    val volumeAllCurrencies: VolumeAllCurrencies
)

data class QuoteType(
    val exchange: String,
    val exchangeTimezoneName: String,
    val exchangeTimezoneShortName: String,
    val gmtOffSetMilliseconds: String,
    val headSymbol: String,
    val isEsgPopulated: Boolean,
    val market: String,
    val quoteType: String,
    val shortName: String,
    val symbol: String,
    val underlyingExchangeSymbol: String,
    val underlyingSymbol: String
)

data class SummaryDetail(
    val algorithm: Any,
    val ask: Ask,
    val askSize: AskSize,
    val averageDailyVolume10Day: AverageDailyVolume10Day,
    val averageVolume: AverageVolume,
    val averageVolume10days: AverageVolume10days,
    val beta: Beta,
    val bid: Bid,
    val bidSize: BidSize,
  // val circulatingSupply: CirculatingSupplyX,
    val currency: String,
    val dayHigh: DayHigh,
    val dayLow: DayLow,
    val dividendRate: DividendRate,
    val dividendYield: DividendYield,
    val exDividendDate: ExDividendDate,
   // val expireDate: ExpireDateX,
    val fiftyDayAverage: FiftyDayAverage,
    val fiftyTwoWeekHigh: FiftyTwoWeekHigh,
    val fiftyTwoWeekLow: FiftyTwoWeekLow,
    val fiveYearAvgDividendYield: FiveYearAvgDividendYield,
    val forwardPE: ForwardPE,
    val fromCurrency: Any,
    val lastMarket: Any,
    //val marketCap: MarketCapX,
    val maxAge: Int,
    val maxSupply: MaxSupply,
    val navPrice: NavPrice,
    val `open`: Open,
  //  val openInterest: OpenInterestX,
    val payoutRatio: PayoutRatio,
    val previousClose: PreviousClose,
    //val priceHint: PriceHintX,
    val priceToSalesTrailing12Months: PriceToSalesTrailing12Months,
//    val regularMarketDayHigh: RegularMarketDayHighX,
//    val regularMarketDayLow: RegularMarketDayLowX,
//    val regularMarketOpen: RegularMarketOpenX,
//    val regularMarketPreviousClose: RegularMarketPreviousCloseX,
//    val regularMarketVolume: RegularMarketVolumeX,
//    val startDate: StartDate,
//    val strikePrice: StrikePriceX,
    val toCurrency: Any,
    val totalAssets: TotalAssets,
    val tradeable: Boolean,
    val trailingAnnualDividendRate: TrailingAnnualDividendRate,
    val trailingAnnualDividendYield: TrailingAnnualDividendYield,
    val twoHundredDayAverage: TwoHundredDayAverage,
    val volume: Volume,
   // val volume24Hr: Volume24HrX,
   // val volumeAllCurrencies: VolumeAllCurrenciesX,
    val yield: Yield,
    val ytdReturn: YtdReturn
)

//data class FuturesChainDetails(
//    val ESH23.CME: ESH23CME,
//    val ESM22.CME: ESM22CME,
//    val ESM23.CME: ESM23CME,
//    val ESU22.CME: ESU22CME,
//    val ESZ22.CME: ESZ22CME
//)

data class ESH23CME(
    val contractSymbol: Boolean,
    val customPriceAlertConfidence: String,
    val esgPopulated: Boolean,
    val exchange: String,
    val exchangeDataDelayedBy: Int,
    val exchangeTimezoneName: String,
    val exchangeTimezoneShortName: String,
    val expireDate: Int,
    val expireIsoDate: String,
    val firstTradeDateMilliseconds: Long,
    val fullExchangeName: String,
    val gmtOffSetMilliseconds: Int,
    val headSymbolAsString: String,
    val language: String,
    val market: String,
    val marketState: String,
    val quoteSourceName: String,
    val quoteType: String,
    val region: String,
    val regularMarketChange: Int,
    val regularMarketChangePercent: Double,
    val regularMarketPreviousClose: Int,
    val regularMarketPrice: Int,
    val regularMarketTime: Int,
    val shortName: String,
    val sourceInterval: Int,
    val symbol: String,
    val tradeable: Boolean,
    val triggerable: Boolean,
    val typeDisp: String
)

data class ESM22CME(
    val contractSymbol: Boolean,
    val customPriceAlertConfidence: String,
    val esgPopulated: Boolean,
    val exchange: String,
    val exchangeDataDelayedBy: Int,
    val exchangeTimezoneName: String,
    val exchangeTimezoneShortName: String,
    val expireDate: Int,
    val expireIsoDate: String,
    val firstTradeDateMilliseconds: Long,
    val fullExchangeName: String,
    val gmtOffSetMilliseconds: Int,
    val headSymbolAsString: String,
    val language: String,
    val market: String,
    val marketState: String,
    val quoteSourceName: String,
    val quoteType: String,
    val region: String,
    val regularMarketChange: Int,
    val regularMarketChangePercent: Double,
    val regularMarketPreviousClose: Double,
    val regularMarketPrice: Double,
    val regularMarketTime: Int,
    val shortName: String,
    val sourceInterval: Int,
    val symbol: String,
    val tradeable: Boolean,
    val triggerable: Boolean,
    val typeDisp: String
)

data class ESM23CME(
    val contractSymbol: Boolean,
    val customPriceAlertConfidence: String,
    val esgPopulated: Boolean,
    val exchange: String,
    val exchangeDataDelayedBy: Int,
    val exchangeTimezoneName: String,
    val exchangeTimezoneShortName: String,
    val expireDate: Int,
    val expireIsoDate: String,
    val firstTradeDateMilliseconds: Long,
    val fullExchangeName: String,
    val gmtOffSetMilliseconds: Int,
    val headSymbolAsString: String,
    val language: String,
    val market: String,
    val marketState: String,
    val quoteSourceName: String,
    val quoteType: String,
    val region: String,
    val regularMarketChange: Double,
    val regularMarketChangePercent: Double,
    val regularMarketPreviousClose: Double,
    val regularMarketPrice: Int,
    val regularMarketTime: Int,
    val shortName: String,
    val sourceInterval: Int,
    val symbol: String,
    val tradeable: Boolean,
    val triggerable: Boolean,
    val typeDisp: String
)

data class ESU22CME(
    val contractSymbol: Boolean,
    val customPriceAlertConfidence: String,
    val esgPopulated: Boolean,
    val exchange: String,
    val exchangeDataDelayedBy: Int,
    val exchangeTimezoneName: String,
    val exchangeTimezoneShortName: String,
    val expireDate: Int,
    val expireIsoDate: String,
    val firstTradeDateMilliseconds: Long,
    val fullExchangeName: String,
    val gmtOffSetMilliseconds: Int,
    val headSymbolAsString: String,
    val language: String,
    val market: String,
    val marketState: String,
    val quoteSourceName: String,
    val quoteType: String,
    val region: String,
    val regularMarketChange: Double,
    val regularMarketChangePercent: Double,
    val regularMarketPreviousClose: Double,
    val regularMarketPrice: Double,
    val regularMarketTime: Int,
    val shortName: String,
    val sourceInterval: Int,
    val symbol: String,
    val tradeable: Boolean,
    val triggerable: Boolean,
    val typeDisp: String
)

data class ESZ22CME(
    val contractSymbol: Boolean,
    val customPriceAlertConfidence: String,
    val esgPopulated: Boolean,
    val exchange: String,
    val exchangeDataDelayedBy: Int,
    val exchangeTimezoneName: String,
    val exchangeTimezoneShortName: String,
    val expireDate: Int,
    val expireIsoDate: String,
    val firstTradeDateMilliseconds: Long,
    val fullExchangeName: String,
    val gmtOffSetMilliseconds: Int,
    val headSymbolAsString: String,
    val language: String,
    val market: String,
    val marketState: String,
    val quoteSourceName: String,
    val quoteType: String,
    val region: String,
    val regularMarketChange: Double,
    val regularMarketChangePercent: Double,
    val regularMarketPreviousClose: Double,
    val regularMarketPrice: Int,
    val regularMarketTime: Int,
    val shortName: String,
    val sourceInterval: Int,
    val symbol: String,
    val tradeable: Boolean,
    val triggerable: Boolean,
    val typeDisp: String
)

data class AverageDailyVolume10Day(
    val fmt: String,
    val longFmt: String,
    val raw: Int
)

data class AverageDailyVolume3Month(
    val fmt: String,
    val longFmt: String,
    val raw: Int
)

class CirculatingSupply

data class ExpireDate(
    val fmt: String,
    val raw: Int
)

class MarketCap

data class OpenInterest(
    val fmt: String,
    val longFmt: String,
    val raw: Int
)

class PostMarketChange

class PostMarketPrice

class PreMarketChange

class PreMarketPrice

data class PriceHint(
    val fmt: String,
    val longFmt: String,
    val raw: Int
)

data class RegularMarketChange(
    val fmt: String,
    val raw: Int
)

data class RegularMarketChangePercent(
    val fmt: String,
    val raw: Double
)

data class RegularMarketDayHigh(
    val fmt: String,
    val raw: Double
)

data class RegularMarketDayLow(
    val fmt: String,
    val raw: Double
)

data class RegularMarketOpen(
    val fmt: String,
    val raw: Double
)

//data class RegularMarketPreviousClose(
//    val fmt: String,
//    val raw: Double
//)

data class RegularMarketPrice(
    val fmt: String,
    val raw: Double
)

data class RegularMarketVolume(
    val fmt: String,
    val longFmt: String,
    val raw: Int
)

class StrikePrice

class Volume24Hr

class VolumeAllCurrencies

data class Ask(
    val fmt: String,
    val raw: Double
)

data class AskSize(
    val fmt: Any,
    val longFmt: String,
    val raw: Int
)

data class AverageVolume(
    val fmt: String,
    val longFmt: String,
    val raw: Int
)

data class AverageVolume10days(
    val fmt: String,
    val longFmt: String,
    val raw: Int
)

class Beta

data class Bid(
    val fmt: String,
    val raw: Double
)

data class BidSize(
    val fmt: Any,
    val longFmt: String,
    val raw: Int
)

data class DayHigh(
    val fmt: String,
    val raw: Double
)

data class DayLow(
    val fmt: String,
    val raw: Double
)

class DividendRate

class DividendYield

class ExDividendDate

data class FiftyDayAverage(
    val fmt: String,
    val raw: Double
)

data class FiftyTwoWeekHigh(
    val fmt: String,
    val raw: Double
)

data class FiftyTwoWeekLow(
    val fmt: String,
    val raw: Double
)

class FiveYearAvgDividendYield

class ForwardPE

class MaxSupply

class NavPrice

data class Open(
    val fmt: String,
    val raw: Double
)

class PayoutRatio

data class PreviousClose(
    val fmt: String,
    val raw: Double
)

class PriceToSalesTrailing12Months

class StartDate

class TotalAssets

class TrailingAnnualDividendRate

class TrailingAnnualDividendYield

data class TwoHundredDayAverage(
    val fmt: String,
    val raw: Double
)

data class Volume(
    val fmt: String,
    val longFmt: String,
    val raw: Int
)

class Yield

class YtdReturn