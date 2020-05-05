package com.hectoruiz.feature.searcher.presentation.searcher.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProviders
import com.hectoruiz.feature.searcher.R
import com.hectoruiz.feature.searcher.presentation.searcher.viewmodel.ListViewModel

class ListFragment : Fragment(R.layout.search_fragment) {

    private val viewModel: ListViewModel by viewModels()

    companion object {
        fun newInstance() =
            ListFragment()
    }
}
