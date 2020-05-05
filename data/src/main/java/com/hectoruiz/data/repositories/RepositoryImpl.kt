package com.hectoruiz.data.repositories

import com.hectoruiz.data.datasources.DataSource
import com.hectoruiz.domain.models.Model
import com.hectoruiz.domain.repositories.Repository

class RepositoryImpl(private val dataSource: DataSource) : Repository {

    override fun getModel(): Model = dataSource.getModel()
}
