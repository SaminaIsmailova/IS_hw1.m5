package com.example.is_hw1m5

import com.example.is_hw1m5.databinding.ActivityMainBinding

class Presenter(private var view: CounterView) {

    private var model = CounterModel()


    fun incremenrt() {
        model.increment()
        view.showNewCount(model.number)
    }

    fun decrement(){
        model.decrement()
        view.showNewCount(model.number)
    }

    fun showToast(){
        if (model.number == 10){
            view.showToast()
        }
    }

    fun changeTextColor(){
        if (model.number == 15){
            view.changeTextColor()
        }  else {
            view.chaneTextColorBack()
        }
    }
}