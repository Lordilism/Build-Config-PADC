package com.example.shared.mvp.presenters

import com.example.shared.mvp.views.MainView

interface MainPresenter {
    fun initPresenter(view:MainView)
    fun onUiReady()
}