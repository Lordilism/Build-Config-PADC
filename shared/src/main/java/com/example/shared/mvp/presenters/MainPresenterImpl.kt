package com.example.shared.mvp.presenters

import androidx.lifecycle.ViewModel
import com.example.shared.data.models.RestaurantsModel
import com.example.shared.data.models.RestaurantsModelImpl
import com.example.shared.mvp.views.MainView

class MainPresenterImpl : MainPresenter,ViewModel() {

    var mView: MainView? = null

    private val mRestaurantsModel: RestaurantsModel = RestaurantsModelImpl


    override fun initPresenter(view: MainView) {
        mView = view


    }

    override fun onUiReady() {
        mRestaurantsModel.getRestaurants(
            onSuccess = { mView?.showRestaurants(it) },
            onFailure = { mView?.showError(it) }
        )

    }
}