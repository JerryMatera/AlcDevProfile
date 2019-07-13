package io.github.jerrymatera.alcdevprofile

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class AboutALC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)

        val alcAbout: WebView = findViewById(R.id.alc_about)
        alcAbout.loadUrl("https://andela.com/alc/")
    }
}
