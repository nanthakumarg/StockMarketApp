package com.nanthakumar.stockmarketapp.presentation.company_info

import com.nanthakumar.stockmarketapp.domain.model.CompanyInfo
import com.nanthakumar.stockmarketapp.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
