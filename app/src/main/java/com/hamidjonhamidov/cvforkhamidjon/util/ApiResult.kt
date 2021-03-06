package com.hamidjonhamidov.cvforkhamidjon.util

/**
 * Reference: https://medium.com/@douglas.iacovelli/how-to-handle-errors-with-retrofit-and-coroutines-33e7492a912
 * codingwithmitch.com
 */

sealed class ApiResult<out T> {
    data class Success<out T>(val value: T, val messge: String): ApiResult<T>()
    data class GenericError(val code: Int? = null, val errorMessage: String): ApiResult<Nothing>()
}