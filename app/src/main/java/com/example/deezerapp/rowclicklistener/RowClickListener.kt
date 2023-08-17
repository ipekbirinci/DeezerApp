package com.example.deezerapp.rowclicklistener

interface RowClickListener<T> {
    fun onRowClick(pos: Int, item: T)
    fun onRowDeleteClick(pos: Int, item: T)
}