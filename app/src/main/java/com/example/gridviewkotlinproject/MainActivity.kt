package com.example.gridviewkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gridviewkotlinproject.adapter.AdapterMember
import com.example.gridviewkotlinproject.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var recyclerview: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    fun initView(){
        recyclerview=findViewById(R.id.recyclerview)
        recyclerview.layoutManager=GridLayoutManager(this,3)


        var member:List<Member> =MemberAdd()
        refreshAdapter(member)
    }
    fun refreshAdapter(member:List<Member>){

        var adapter=AdapterMember(member)
        recyclerview.adapter=adapter
    }

    fun MemberAdd():List<Member>{

        var member=ArrayList<Member>()

        for (i in 0..20 step 1){
            member.add(Member("Otabek "+i,"Boboyev "+i))
        }
        return member
    }
}