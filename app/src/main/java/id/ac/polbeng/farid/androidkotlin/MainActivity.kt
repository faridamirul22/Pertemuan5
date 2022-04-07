package id.ac.polbeng.farid.androidkotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvCounter.text = "1"
    }
    fun addnumber (v: View) {
      val currVAl = tvCounter.text.toString().toInt()
      val nextVal = currVAl + 1
      tvCounter.text = nextVal.toString()
    }
}
