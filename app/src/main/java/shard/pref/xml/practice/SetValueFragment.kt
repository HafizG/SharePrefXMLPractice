package shard.pref.xml.practice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment

class SetValueFragment : Fragment() {
    private var v: View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_set_value, container, false)


        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fName = view.findViewById<EditText>(R.id.fNmaeF)
        val lName = view.findViewById<EditText>(R.id.lNmaeF)
        val number = view.findViewById<EditText>(R.id.numberF)



        SharedPrefUtil.getStringValue(LAST_NAME ?: "")
        SharedPrefUtil.getStringValue(PHONE ?: "")

        fName.setText(SharedPrefUtil.getStringValue(NAME ?: ""))
        lName.setText(SharedPrefUtil.getStringValue(LAST_NAME ?: ""))
        number.setText(SharedPrefUtil.getStringValue(PHONE ?: ""))

    }


}