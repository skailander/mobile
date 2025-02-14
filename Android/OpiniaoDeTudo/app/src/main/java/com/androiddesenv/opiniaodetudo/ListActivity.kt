package com.androiddesenv.opiniaodetudo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androiddesenv.opiniaodetudo.fragment.ListFragment


class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_review_activity)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, ListFragment())
            .commit()
    }


    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

}

