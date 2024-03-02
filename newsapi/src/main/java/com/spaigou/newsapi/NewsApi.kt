package com.spaigou.newsapi

import androidx.annotation.IntRange
import com.spaigou.newsapi.models.Article
import com.spaigou.newsapi.models.Language
import com.spaigou.newsapi.models.Response
import com.spaigou.newsapi.models.SortBy
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.Date

interface NewsApi {

    @GET("/everything")
    suspend fun everything(
        @Query("q") query: String? = null,
        @Query("from") from: Date? = null,
        @Query("to") to: Date? = null,
        @Query("language") language: List<Language>? = null,
        @Query("sortBy") sortBy: SortBy? = null,
        @Query("pageSize") @IntRange(from = 0, to = 100) pageSize: Int = 100,
        @Query("page") @IntRange(from = 1) page: Int = 1
    ) : Response<Article>
}

