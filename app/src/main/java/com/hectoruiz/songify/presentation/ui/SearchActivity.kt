package com.hectoruiz.songify.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hectoruiz.feature.searcher.presentation.searcher.ui.ListFragment
import com.hectoruiz.songify.R

class SearchActivity : AppCompatActivity(R.layout.search_activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ListFragment.newInstance())
                .commitNow()
        }
    }
}
