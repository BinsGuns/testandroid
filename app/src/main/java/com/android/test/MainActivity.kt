package com.android.test

import com.android.test.network.MarketModel
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager.VERTICAL
import com.android.test.adapter.MarketListAdapter
import com.android.test.network.Result

import com.android.test.viewmodel.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

   lateinit var viewModel:  MainActivityViewModel
    lateinit var marketListAdapter: MarketListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initSearchBox()
        initRecyclerView()
    }

    fun initSearchBox() {
        inputBookName.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                loadAPIData(s.toString())
            }
        })
    }

    fun initRecyclerView(){
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val decoration  = DividerItemDecoration(applicationContext, VERTICAL)
            addItemDecoration(decoration)
            marketListAdapter = MarketListAdapter()
            adapter =marketListAdapter
        }
    }

    fun loadAPIData(input: String) {
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        viewModel.getBookListObserver().observe(this, Observer<MarketModel>{
            if(it != null) {
                    //update adapter...
                marketListAdapter.marketListData = it.marketSummaryAndSparkResponse.result as ArrayList<Result>
                marketListAdapter.notifyDataSetChanged()
            }
         else {
                Toast.makeText(this, "Error in fetching data", Toast.LENGTH_SHORT).show()
            }
        })
        viewModel.makeApiCall(input)
    }
}