package com.geekbrains.android.instagramclient.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geekbrains.android.instagramclient.R
import com.geekbrains.android.instagramclient.mvp.presenter.IImageListPresenter
import com.geekbrains.android.instagramclient.mvp.view.list.ImageRowView
import kotlinx.android.synthetic.main.item_image.view.*

class ImageRVAdapter(val presenter: IImageListPresenter) :
    RecyclerView.Adapter<ImageRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setPos(position)
        presenter.bind(holder)
    }

    override fun getItemCount(): Int {
        return presenter.getCount()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), ImageRowView {
        private var pos = 0

        fun setPos(pos: Int) {
            this.pos = pos
        }

        override fun getPos(): Int {
            return pos
        }

        override fun setImage(title: String) {
            itemView.imageView.text = title
        }

        override fun isElect(isElect: Boolean) {
            itemView.checkbox.isChecked = isElect
        }
    }
}