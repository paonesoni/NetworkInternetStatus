package com.paonesoni.network

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.paonesoni.networkstatus.NetworkStatusManager
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var networkStatusManager: NetworkStatusManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        networkStatusManager = NetworkStatusManager(this)
        lifecycleScope.launch {
            networkStatusManager.checkInternet.collect{
                Log.e("NetworkStatus",">> $it")
            }
        }
    }
}