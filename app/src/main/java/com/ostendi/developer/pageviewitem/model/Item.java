package com.ostendi.developer.pageviewitem.model;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;

import java.util.List;

public class Item {

    public final static DiffUtil.ItemCallback<Item> DIFF_CALLBACK = new DiffUtil.ItemCallback<Item>() {
        @Override
        public boolean areItemsTheSame(@NonNull Item oldItem, @NonNull Item newItem) {
            return oldItem.value.equals(newItem.value);
        }

        @Override
        public boolean areContentsTheSame(@NonNull Item oldItem, @NonNull Item newItem) {
            return oldItem.equals(newItem);
        }
    };
    private String value;
    private boolean selected;
    private List<Integer> listOfPreSelectedPosition;

    public Item(String value) {
        this.value = value;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public List<Integer> getListOfPreSelectedPosition() {
        return listOfPreSelectedPosition;
    }

    public void setListofPreSelectedPosition(List<Integer> lpp) {
        this.listOfPreSelectedPosition = lpp;
    }
}


