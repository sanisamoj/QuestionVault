package sanisamoj.com.data.dataclass

import java.time.LocalDateTime

data class SubTopicFeedback(
    val subTopicId: String,
    val rating: String,
    val createdAt: String = LocalDateTime.now().toString()
)
