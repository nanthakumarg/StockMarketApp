package com.nanthakumar.stockmarketapp.di

import com.nanthakumar.stockmarketapp.data.csv.CSVParser
import com.nanthakumar.stockmarketapp.data.csv.CompanyListingsParser
import com.nanthakumar.stockmarketapp.data.repository.StockRepositoryImpl
import com.nanthakumar.stockmarketapp.domain.model.CompanyListing
import com.nanthakumar.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindsStockRespository(
        stockRepositoryImpl: StockRepositoryImpl
    ) : StockRepository

}