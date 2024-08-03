package sanisamoj.com.data.dataclass

import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId
import java.time.LocalDateTime

data class Faq(
    @BsonId
    val id: ObjectId,
    val templateType: String,
    val logoUrl: String,
    val title: String,
    val description: String,
    val topics: List<Topic>,
    val clicks: Int,
    val createdAt: String = LocalDateTime.now().toString()
)
