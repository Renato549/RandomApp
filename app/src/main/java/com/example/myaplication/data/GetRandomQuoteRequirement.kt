package com.example.myaplication.data

import com.example.myaplication.model.QuoteModel
import com.example.myaplication.viewmodel.QuoteLocalService

class GetRandomQuoteRequirement{
    operator fun invoke(): QuoteModel?{
        val quotes = QuoteLocalService.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null


    }
    var getRandomQuoteRequirement = GetRandomQuoteRequirement()
}