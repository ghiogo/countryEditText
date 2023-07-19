package com.example.countryedittext

//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import android.widget.ArrayAdapter
//import android.widget.EditText
//import android.widget.Spinner
//
//class RegistrationActivity : AppCompatActivity() {
//    private lateinit var phoneNumberEditText: EditText
//    private lateinit var countriesSpinner: Spinner
//
//    private val countriesList: List<Pair<String, String>> by lazy {
//        val countryNames = resources.getStringArray(R.array.country_names)
//        val countryCodes = resources.getStringArray(R.array.country_codes)
//        countryNames.zip(countryCodes) { name, code -> Pair(name, code) }
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_registration)
//
//        phoneNumberEditText = findViewById(R.id.phoneNumberEditText)
//        countriesSpinner = findViewById(R.id.countriesSpinner)
//
//        setupCountriesSpinner()
//    }
//
//    private fun setupCountriesSpinner() {
//        val countryNames = countriesList.map { it.first }
//        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countryNames)
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        countriesSpinner.adapter = adapter
//
//        countriesSpinner.setOnItemSelectedListener { _, _, position, _ ->
//            phoneNumberEditText.setText(countriesList[position].second)
//        }
//    }
//}