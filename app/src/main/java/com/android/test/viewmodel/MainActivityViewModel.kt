package com.android.test.viewmodel

import com.android.test.network.MarketModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.android.test.network.RetroInstance
import com.android.test.network.RetroService
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainActivityViewModel: ViewModel() {
    lateinit var marketList: MutableLiveData<MarketModel>
    init {
        marketList = MutableLiveData()
    }

    fun getBookListObserver(): MutableLiveData<MarketModel> {
        return marketList
    }

    fun makeApiCall(query: String) {

        val retroInstance  = RetroInstance.getRetroInstance().create(RetroService::class.java)
        retroInstance.getMarketApi("gkOCieFE4Gmshu2kkSc1sVTngAt4p1zHOgDjsnWnftaoZHzMLk","yh-finance.p.rapidapi.com",query)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(getBookListObserverRx())
    }

    private fun getBookListObserverRx():Observer<MarketModel> {
        return object :Observer<MarketModel>{
            override fun onComplete() {
                //hide progress indicator .
            }

            override fun onError(et: Throwable) {
                marketList.postValue(null)
            }

            override fun onNext(t: MarketModel) {
                marketList.postValue(t)
            }

            override fun onSubscribe(d: Disposable) {
                //start showing progress indicator.
            }
        }
    }
}