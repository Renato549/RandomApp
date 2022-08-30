package com.example.myaplication.data

import com.example.myaplication.model.QuoteModel
import com.example.myaplication.viewmodel.QuoteRepository

class GetQuoteRequirement {
    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>
    = repository.getAllQuotes()
}