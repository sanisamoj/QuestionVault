package sanisamoj.com.data.dataclass

import java.time.LocalDateTime

data class Topic(
    val id: String,
    val title: String,
    val description: String,
    val subTopics: List<SubTopic>,
    val contacts: ContactUs,
    val clicks: Int,
    val createdAt: String = LocalDateTime.now().toString()
)
