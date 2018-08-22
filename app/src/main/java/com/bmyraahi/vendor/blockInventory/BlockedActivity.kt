package com.bmyraahi.vendor.blockInventory

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.bmyraahi.vendor.OnItemClickListener
import com.bmyraahi.vendor.R
import com.bmyraahi.vendor.home.HomeAdapter
import com.bmyraahi.vendor.home.addOnItemClickListener
import com.bmyraahi.vendor.inventory.Inventory
import kotlinx.android.synthetic.main.activity_blocked.*

class BlockedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blocked)

        rvBlocked.layoutManager = LinearLayoutManager(this)

        rvBlocked.adapter = BlockedAdapter(buildItems())

        rvBlocked.addOnItemClickListener(object : OnItemClickListener {
            override fun onItemClicked(position: Int, view: View) {
            }
        })
    }

    private fun buildItems(): ArrayList<Inventory> {
        val items = ArrayList<Inventory>()
        items.add(Inventory("Bhangrah Fort"))
        items.add(Inventory("Amer Fort"))
        return items
    }
}
