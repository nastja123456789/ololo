package space.yakupov.partyapp10.ui.location

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LocationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Гугл Карта ждет своего подключения, господин"
    }
    val text: LiveData<String> = _text
}