package com.sefadalgic.fooddeliveryapp.presentation.view.category_detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sefadalgic.fooddeliveryapp.data.model.Category
import com.sefadalgic.fooddeliveryapp.data.model.Restaurant
import com.sefadalgic.fooddeliveryapp.data.model.UiState
import com.sefadalgic.fooddeliveryapp.data.repository.CategoryRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CategoryDetailViewModel(private val categoryRepository: CategoryRepository): ViewModel() {

    private val _category = MutableStateFlow<UiState<Category>>(UiState.Loading)
    val category: StateFlow<UiState<Category>> = _category

    fun getCategoryDetail(categoryId: Int) {
        viewModelScope.launch {
            try {
                val result = categoryRepository.getCategoryDetail(categoryId)
                if (result.data != null) {
                    _category.value = UiState.Success(result.data)
                }
            }catch (e: Exception) {
                _category.value = UiState.Error(e.message ?: "Unknown error")
            }
        }
    }
}