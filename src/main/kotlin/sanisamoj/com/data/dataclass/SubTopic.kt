package sanisamoj.com.data.dataclass

data class SubTopic(
    val id: String,
    val title: String,
    val answer: String,
    val feedback: List<SubTopicFeedback> = emptyList()
)
