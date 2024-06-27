package com.akirachix.myblogreader

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myblogreader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)
        binding.rvBlogReader.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        displayBlogs()
    }

    fun displayBlogs(){
        val blog1 = Blog("Trevor Noah", "Born A Crime", "2016", "")
        val blog2 = Blog("Trevor Noah", "Born A Crime", "2017", "")
        val blog3 = Blog("Trevor Noah", "Born A Crime", "2018", "")
        val blog4 = Blog("Trevor Noah", "Born A Crime", "2019", "")
        val blog5 = Blog("Trevor Noah", "Born A Crime", "2020", "")
        val blog6 = Blog("Trevor Noah", "Born A Crime", "2021", "")
        val blog7 = Blog("Trevor Noah", "Born A Crime", "2022", "")
        val blog8 = Blog("Trevor Noah", "Born A Crime", "2023", "")
        val myBlogs = listOf(blog1, blog2, blog3, blog4, blog5, blog6, blog7, blog8)

        val blogAdapter = BlogAdapter(myBlogs)
        binding.rvBlogReader.adapter = blogAdapter
    }
}