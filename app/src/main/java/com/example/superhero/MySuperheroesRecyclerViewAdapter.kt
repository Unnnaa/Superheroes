package com.example.superhero

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast


//import com.example.superhero.SuperheroesFragment.OnListFragmentInteractionListener
//import com.example.superhero.dummy.DummyContent.DummyItem

import kotlinx.android.synthetic.main.fragment_superheroes.view.*


class MySuperheroesRecyclerViewAdapter(
    private val activity: MainActivity,
    private val mValues: Array<String>
) : RecyclerView.Adapter<MySuperheroesRecyclerViewAdapter.ViewHolder>() {

//    private val mOnClickListener: View.OnClickListener
//
//    init {
//        mOnClickListener = View.OnClickListener { v ->
//            val item = v.tag as DummyItem
//            // Notify the active callbacks interface (the activity, if the fragment is attached to
//            // one) that an item has been selected.
//            mListener?.onListFragmentInteraction(item)
//        }
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_superheroes, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        //holder.mContentView.text = item
        holder.mContentView.text = item
        holder.mView.setOnClickListener {
            Toast.makeText(activity, item, Toast.LENGTH_LONG).show()
        }
    }


    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        //val mIdView: TextView = mView.item_number
        val mContentView: TextView = mView.content

        override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }
    }
}

