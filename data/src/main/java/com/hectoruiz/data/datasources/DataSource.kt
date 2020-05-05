package com.hectoruiz.data.datasources

import com.hectoruiz.domain.models.Model

interface DataSource {

    fun getModel(): Model
}
