package com.sefadalgic.fooddeliveryapp.presentation.view.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sefadalgic.fooddeliveryapp.core.network.RetrofitInstance
import com.sefadalgic.fooddeliveryapp.data.model.Category
import com.sefadalgic.fooddeliveryapp.data.model.Restaurant
import com.sefadalgic.fooddeliveryapp.data.model.UiState
import com.sefadalgic.fooddeliveryapp.data.repository.CategoryRepository
import com.sefadalgic.fooddeliveryapp.data.repository.RestaurantRepository
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val categoryRepository: CategoryRepository = CategoryRepository(),
    private val restaurantRepository: RestaurantRepository = RestaurantRepository()
) : ViewModel() {
    private val _categories = MutableStateFlow<UiState<List<Category>>>(UiState.Loading)
    val categories: StateFlow<UiState<List<Category>>> = _categories

    private val _restaurants = MutableStateFlow<UiState<List<Restaurant>>>(UiState.Loading)
    val restaurants: StateFlow<UiState<List<Restaurant>>> = _restaurants


    private val handler = CoroutineExceptionHandler { _, exception ->
        Log.e("HomeViewModel", "CoroutineExceptionHandler: ${exception.message}", exception)
    }

    fun fetchCategories() {
        viewModelScope.launch(handler) {
            try {
                val result = categoryRepository.getCategories()
                if (result.data != null) {
                    _categories.value = UiState.Success(result.data)
                }

            } catch (e: Exception) {
                logThisException(e)
                _categories.value = UiState.Error(e.message ?: "Unknown error")
            }
        }
    }


    fun fetchOpenedRestaurants() {
        viewModelScope.launch(handler) {
            try {
                val result = restaurantRepository.getOpenedRestaurants()
                if (result.data != null) {
                    _restaurants.value = UiState.Success(result.data)
                }

            } catch (e: Exception) {
                logThisException(e)
                _categories.value =
                    UiState.Error(e.message ?: "Unknown error in fetchOpenedRestaurants")
            }
        }
    }


    private fun logThisException(ex: Throwable) {
        Log.e("HomeViewModel", "Hata oluştu: ${ex.message}", ex)
    }
}