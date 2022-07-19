package com.nanthakumar.stockmarketapp.domain.repository

import com.nanthakumar.stockmarketapp.domain.model.CompanyListing
import com.nanthakumar.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ) : Flow<Resource<List<CompanyListing>>>
}