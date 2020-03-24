package com.example.dfs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.doubleclick.PublisherAdRequest
import com.google.android.gms.ads.doubleclick.PublisherAdView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var publisherAdRequest = PublisherAdRequest.Builder().addTestDevice(PublisherAdRequest.DEVICE_ID_EMULATOR).build()
        publisherAdView.loadAd(publisherAdRequest)
//        publisherAdView.adListener = object :

    }

}
