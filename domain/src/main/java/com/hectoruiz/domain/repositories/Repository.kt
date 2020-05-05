package com.hectoruiz.domain.repositories

import com.hectoruiz.domain.models.Model

interface Repository {

    fun getModel(): Model
}
