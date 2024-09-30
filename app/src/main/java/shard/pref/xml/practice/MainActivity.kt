package shard.pref.xml.practice

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fName = findViewById<EditText>(R.id.fNmae)
        val lName = findViewById<EditText>(R.id.lNmae)
        val number = findViewById<EditText>(R.id.number)
        val saveBtn = findViewById<Button>(R.id.saveBtn)



        saveBtn.setOnClickListener {
            SharedPrefUtil.setStringValue(NAME, fName.text.toString())
            SharedPrefUtil.setStringValue(LAST_NAME, lName.text.toString())
            SharedPrefUtil.setStringValue(PHONE, number.text.toString())


            Log.d(
                "SharedPref", "${SharedPrefUtil.getStringValue(NAME) ?: ""} ${
                    SharedPrefUtil.getStringValue(
                        LAST_NAME
                    ) ?: ""
                } ${SharedPrefUtil.getStringValue(PHONE) ?: ""} "
            )


            supportFragmentManager.beginTransaction().replace(R.id.container, SetValueFragment())
                .addToBackStack(null).commit()
        }
    }
}