package com.bmyraahi.vendor.inventory

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bmyraahi.vendor.R
import kotlinx.android.synthetic.main.activity_inventory_list.*

class InventoryListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventory_list)
        btnAddActivity.setOnClickListener {
            startActivity(Intent(this@InventoryListActivity, AddInventoryActivity::class.java))
        }
    }
}
