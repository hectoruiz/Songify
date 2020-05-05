package com.hectoruiz.feature.searcher.presentation.searcher.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.hectoruiz.feature.searcher.R
import com.hectoruiz.feature.searcher.presentation.searcher.viewmodel.ListViewModel

class ListFragment : Fragment(R.layout.list_fragment) {

    private val viewModel: ListViewModel by viewModels()

}
