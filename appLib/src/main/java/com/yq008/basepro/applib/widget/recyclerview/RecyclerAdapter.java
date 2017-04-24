/**
 * Copyright 2013 Joan Zapata
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY RecyclerViewHolderIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yq008.basepro.applib.widget.recyclerview;

import java.util.List;


public abstract class RecyclerAdapter<ADT> extends RecyclerBaseAdapter<ADT,RecyclerViewHolder> {

    public RecyclerAdapter(int layoutResId, List<ADT> data) {
        super(layoutResId, data);
    }

    public RecyclerAdapter(int layoutResId) {
        super(layoutResId);
    }

    public RecyclerAdapter(List<ADT> data) {
        super(data);
    }
    public RecyclerAdapter() {
        super();
    }
}