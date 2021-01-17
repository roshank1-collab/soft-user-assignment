package com.example.softuserassignment.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.softuserassignment.Adapter.StudentListAdapter
import com.example.softuserassignment.Dashboard.DashboardActivity
import com.example.softuserassignment.Model.Student
import com.example.softuserassignment.R


class Home_Fragment : Fragment() {
    // TODO: Rename and change types of parameters


    private lateinit var recyclerView:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView =view.findViewById(R.id.recyclerView)

        Student("Roshan Koirala","20","lokanthali","male")
        val adapter = StudentListAdapter(this.context!!, DashboardActivity.lisfOfStudent)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this.context)
        return view;
    }


}