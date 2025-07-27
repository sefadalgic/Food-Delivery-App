package com.sefadalgic.fooddeliveryapp.presentation.view.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sefadalgic.fooddeliveryapp.core.network.RetrofitInstance
import com.sefadalgic.fooddeliveryapp.data.model.Category
import com.sefadalgic.fooddeliveryapp.data.model.UiState
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val _categories = MutableStateFlow<UiState<List<Category>>>(UiState.Loading)
    val categories: StateFlow<UiState<List<Category>>> = _categories


    fun fetchCategories() {

        val handler = CoroutineExceptionHandler { _, exception ->
            Log.e("HomeViewModel", "CoroutineExceptionHandler: ${exception.message}", exception)
        }

        viewModelScope.launch(handler) {
            try {
                val result = RetrofitInstance.api.getCategories()
                if (result.data != null) {
                    _categories.value = UiState.Success(result.data)
                }

            } catch (e: Exception) {
                logThisException(e)
                _categories.value = UiState.Error(e.message ?: "Unknown error")
            }
        }
    }

    private fun logThisException(ex: Throwable) {
        Log.e("HomeViewModel", "Hata oluştu: ${ex.message}", ex)
    }
}