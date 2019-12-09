package edu.devilsadvocate.tasktrackingactivity.ItemTouchHelpers

interface ItemTouchHelperAdapter {
    fun onItemMove(fromPosition: Int, toPosition: Int) : Boolean
    fun onItemDismiss(sectionTitle: String, position: Int) : Boolean
}