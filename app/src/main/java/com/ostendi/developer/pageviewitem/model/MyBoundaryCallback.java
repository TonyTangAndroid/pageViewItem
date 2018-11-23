package com.ostendi.developer.pageviewitem.model;

import android.arch.paging.PagedList;
import android.support.annotation.NonNull;

import hugo.weaving.DebugLog;

@DebugLog
public class MyBoundaryCallback extends PagedList.BoundaryCallback<Item> {

    /**
     * Called when zero items are returned from an initial load of the PagedList's data source.
     */
    public void onZeroItemsLoaded() {
    }

    /**
     * Called when the item at the front of the PagedList has been loaded, and access has
     * occurred within {@link PagedList.Config#prefetchDistance} of it.
     * <p>
     * No more data will be prepended to the PagedList before this item.
     *
     * @param itemAtFront The first item of PagedList
     */
    public void onItemAtFrontLoaded(@NonNull Item itemAtFront) {
    }

    /**
     * Called when the item at the end of the PagedList has been loaded, and access has
     * occurred within {@link PagedList.Config#prefetchDistance} of it.
     * <p>
     * No more data will be appended to the PagedList after this item.
     *
     * @param itemAtEnd The first item of PagedList
     */
    public void onItemAtEndLoaded(@NonNull Item itemAtEnd) {
    }
}
