package com.example.myaplication.viewmodel

import com.example.myaplication.model.QuoteModel
import com.example.myaplication.model.QuoteServerMockService

class QuoteRepository {
    private val api = QuoteServerMockService()
    suspend fun getAllQuotes():List<QuoteModel> {
        val response = api.getQuotes()
        QuoteLocalService.quotes = response
        return response
    }
}