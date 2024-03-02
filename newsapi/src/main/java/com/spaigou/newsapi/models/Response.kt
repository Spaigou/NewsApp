package com.spaigou.newsapi.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * {
 * "status": "ok",
 * "totalResults": 150,
 * -"articles": [
 * -{
 * -"source": {
 * "id": "techcrunch",
 * "name": "TechCrunch"
 * },
 * "author": "Jagmeet Singh",
 * "title": "Apple abandons its car: Here are other projects the company has killed",
 * "description": "Apple has scrapped plans to enter the automotive industry with its mysterious autonomous electric car, instead shifting focus to the wildly popular world of generative AI. The project saw the company hiring prominent executives from places like Tesla and Ford…",
 * "url": "https://techcrunch.com/2024/03/02/apple-abandons-its-car-here-are-other-projects-the-company-has-killed/",
 * "urlToImage": "https://techcrunch.com/wp-content/uploads/2018/09/dims1.jpg?resize=1200,800",
 * "publishedAt": "2024-03-02T15:30:59Z",
 * "content": "Apple has scrapped plans to enter the automotive industry with its mysterious autonomous electric car, instead shifting focus to the wildly popular world of generative AI. The project saw the company… [+3243 chars]"
 * },
 */

@Serializable
data class Response<T>(
    @SerialName("status") val status: String,
    @SerialName("totalResults") val totalResults: Int,
    @SerialName("articles") val articles: List<T>
)
