package com.hectoruiz.datasource.network.endpoints.datasources

import com.hectoruiz.data.datasources.DataSource
import com.hectoruiz.datasource.network.client.ApiClient
import com.hectoruiz.datasource.network.endpoints.services.Service
import com.hectoruiz.domain.models.Model

class DataSourceImpl(apiClient: ApiClient) : DataSource {

    lateinit var service: Service

    override fun getModel(): Model = service.getModel()
}
