package sanisamoj.com.data.interfaces

import com.sanisamoj.database.mongodb.OperationField
import sanisamoj.com.data.dataclass.Faq

interface DatabaseRepository {
    suspend fun registerFaq(faq: Faq): Faq
    suspend fun getFaqById(id: String): Faq
    suspend fun updateFaq(id: String, update: OperationField): Faq
}