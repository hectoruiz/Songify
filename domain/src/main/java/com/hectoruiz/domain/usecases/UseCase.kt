package com.hectoruiz.domain.usecases

import com.hectoruiz.domain.models.Model
import com.hectoruiz.domain.repositories.Repository

class UseCase(private val repository: Repository) {

    operator fun invoke(): Model = repository.getModel()
}
