package com.example.padc_build_config.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.padc_build_config.R
import com.example.padc_build_config.adapter.RestaurantAdapter
import com.example.shared.data.Vo.ResponseVO
import com.example.shared.mvp.presenters.MainPresenter
import com.example.shared.mvp.presenters.MainPresenterImpl
import com.example.shared.mvp.views.MainView
import com.example.shared.showSnackBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    private val mAdapter: RestaurantAdapter = RestaurantAdapter()

    private lateinit var mPresenter: MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setUpToolBar()
        setUpPresenter()
        setUpRecyclerView()

        mPresenter.onUiReady()


    }

    private fun setUpRecyclerView() {
        with(rvClientData) {
            this.adapter = mAdapter
            this.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
    }

    private fun setUpPresenter() {
        mPresenter =
            ViewModelProvider(this)[MainPresenterImpl::class.java]
        mPresenter.initPresenter(this)
    }

    private fun setUpToolBar() {
        setSupportActionBar(toolBarFromMain)
    }

    override fun showRestaurants(restaurants: List<ResponseVO>)
    {

        mAdapter.setNewData(restaurants)
    }

    override fun showError(errorMessage: String) {
        showSnackBar(errorMessage)
    }
}