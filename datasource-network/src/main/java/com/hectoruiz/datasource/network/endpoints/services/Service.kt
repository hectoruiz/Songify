package com.hectoruiz.datasource.network.endpoints.services

import com.hectoruiz.domain.models.Model

interface Service {

    fun getModel() : Model
}
