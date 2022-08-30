package com.example.myaplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myaplication.data.GetQuoteRequirement
import com.example.myaplication.model.QuoteModel
import com.example.myaplication.model.QuoteServerMockService
import kotlinx.coroutines.launch


class QuoteViewModel : ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()
    fun onCreate() {
        viewModelScope.launch {
            val result = getQuotesRequirement()
            if(!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun randomQuote(){
        isLoading.postValue(true)
        val quote = GetQuoteRequirement.quotes
        if(quote!=null){
            quoteModel.postValue(quote!!)
        }
        isLoading.postValue(false)
    }
    var getQuotesRequirement = GetQuoteRequirement()

    val isLoading = MutableLiveData<Boolean>()




}