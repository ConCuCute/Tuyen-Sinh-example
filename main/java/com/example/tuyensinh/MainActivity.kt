package com.example.tuyensinh

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tuyensinh.model.TuyensinhModel
import com.example.tuyensinh.adapters.TuyensinhAdapter

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var tsModel: ArrayList<TuyensinhModel>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var tsAdapter: TuyensinhAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view_item)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        tsModel = ArrayList()
        tsModel = setTuyensinh()
        tsAdapter = TuyensinhAdapter(applicationContext, tsModel!!)
        recyclerView?.adapter = tsAdapter

        }
    private fun setTuyensinh(): ArrayList<TuyensinhModel> {

        var arrayList: ArrayList<TuyensinhModel> = ArrayList()

        arrayList.add(TuyensinhModel(R.drawable.tvts2))
        arrayList.add(TuyensinhModel(R.drawable.dktt1))
        arrayList.add(TuyensinhModel(R.drawable.dhcq1))
        arrayList.add(TuyensinhModel(R.drawable.sdh1))
        arrayList.add(TuyensinhModel(R.drawable.bdnh2))
        arrayList.add(TuyensinhModel(R.drawable.vlvh4))

        return arrayList
    }
}