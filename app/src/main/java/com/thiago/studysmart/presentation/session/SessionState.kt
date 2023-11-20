package com.thiago.studysmart.presentation.session

import com.thiago.studysmart.domain.model.Session
import com.thiago.studysmart.domain.model.Subject

data class SessionState(
    val subjects: List<Subject> = emptyList(),
    val sessions: List<Session> = emptyList(),
    val relatedToSubject: String? = null,
    val subjectId: Int? = null,
    val session: Session? = null
)
