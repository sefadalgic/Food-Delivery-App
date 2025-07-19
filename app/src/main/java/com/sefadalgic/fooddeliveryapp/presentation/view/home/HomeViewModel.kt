package com.sefadalgic.fooddeliveryapp.presentation.view.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sefadalgic.fooddeliveryapp.core.network.RetrofitInstance
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    fun fetchCategories() {
        Log.d("HomeViewModel", "fetchCategories() çağrıldı")

        val handler = CoroutineExceptionHandler { _, exception ->
            Log.e("HomeViewModel", "CoroutineExceptionHandler: ${exception.message}", exception)
        }

        viewModelScope.launch(handler) {
            try {
                val result = RetrofitInstance.api.getCategories()
                Log.d("HomeViewModel", "API Cevabı: $result")

            } catch (e: Exception) {
                Log.e("HomeViewModel", "Try-Catch içinde hata: ${e.message}", e)
            }
        }
    }

    private fun logThisException(ex: Throwable) {
        print(ex.message)
    }
}