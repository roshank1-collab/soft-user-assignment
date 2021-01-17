package com.example.softuserassignment.Dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.example.softuserassignment.Adapter.ViewPageAdapter
import com.example.softuserassignment.Fragment.About_Fragment
import com.example.softuserassignment.Fragment.Home_Fragment
import com.example.softuserassignment.Fragment.Student_Fragment
import com.example.softuserassignment.Model.Student
import com.example.softuserassignment.R

class DashboardActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager;
    private lateinit var tabLayout: TabLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        loadViewPagerAdapter();
        loadlist()
    }
    private fun loadViewPagerAdapter() {

        val adapter = ViewPageAdapter(supportFragmentManager);
        adapter.addFragment(Home_Fragment(), "Home");
        adapter.addFragment(Student_Fragment(), "Add Student");
        adapter.addFragment(About_Fragment(), "About Us");
        viewPager.adapter = adapter;
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24);
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_icons8_student_registration_100);
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_notifications_24);


    }

    private fun loadlist(){
        if (lisfOfStudent.size==0){
            lisfOfStudent.add(Student("Shankar Bhandari", "20", "Bhaktapur", "Male"));
            lisfOfStudent.add(Student("Sujit Kushuwa", "20", "Kathmandu", "Male"));
            lisfOfStudent.add(Student("Reeya Pandey", "27", "Lalitpur", "Male"));
            lisfOfStudent.add(Student("Ujjwal Lamichhane", "20", "Kathmandu", "Male"));
            lisfOfStudent.add(Student("Deependra Khatiwada", "60", "Mandu", "Male"));
        }
    }
    companion object {
        var lisfOfStudent = arrayListOf<Student>();
    }
}