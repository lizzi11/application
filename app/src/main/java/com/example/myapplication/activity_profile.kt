package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication3.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
//import com.example.myapplication.databinding.ActivityMainBinding
//import com.Glide
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
//import com.example.myapplication.data
//import com.google.firebase.database.DataSnapshot
//import com.google.firebase.database.DatabaseError
//import com.google.firebase.database.FirebaseDatabase
//import com.google.firebase.database.ValueEventListener
import com.google.firebase.ktx.Firebase


class ProfileActivity : AppCompatActivity() {
    private lateinit var binding :AppCompatActivity

//    private lateinit var profileLogOutButton : TextView
//    private lateinit var profileChangePasswordButton: TextView
//    private val firebaseAuth = Firebase.auth
//
//    private lateinit var profileUsernameTextView : TextView
//    private lateinit var profileImageView : ImageView
//    private lateinit var profileChangeProfileAvatarButton : TextView
//    lateinit var urlEditText :EditText
//    lateinit var usernameEditText:EditText
//
//    private val db = FirebaseDatabase.getInstance().getReference("userInfo")
//    private val auth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        val viewPager2 = findViewById<ViewPager2>(R.id.view_pager_2)
//        val tabLayout2 = findViewById<TabLayout>(R.id.tab_layout)


        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        viewPager2.adapter=adapter
        TabLayoutMediator(tabLayout,viewPager2){tab,position->
            when(position){
                0->{
                    tab.text="Home"
                }
                1->{
                    tab.text="Movies"
                }
                2->{
                    tab.text="Series"
                }
            }
        }.attach()





//        init()
//        profileListeners()
//
//        db.child(auth.currentUser?.uid!!).addValueEventListener(object : ValueEventListener {
//
//            override fun onDataChange(snapshot: DataSnapshot) {
//                val userInfo : User = snapshot.getValue(User::class.java) ?: return
//                profileUsernameTextView.text = userInfo.username
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                Toast.makeText(this@ProfileActivity, "cancelled", Toast.LENGTH_SHORT).show()
//            }
//
//        })
//
//
//
//    }
//
//    private fun profileListeners() {
//
////        profileChangeProfileAvatarButton.setOnClickListener {
////            val url = urlEditText.text.toString()
////            Glide.with(this).load(url).into(profileImageView)
////        }
//
//        profileChangeProfileAvatarButton.setOnClickListener {
//            val url = urlEditText.text.toString()
//            val username = usernameEditText.text.toString()
//            val userInfo = User(username, url)
//            db.child(auth.currentUser?.uid!!).setValue(userInfo)
//        }
//
//        profileLogOutButton.setOnClickListener {
//            firebaseAuth.signOut()
//            startActivity(Intent(this,LoginActivity::class.java))
//            finish()
//        }
//        profileChangePasswordButton.setOnClickListener {
//            startActivity(Intent(this,ChangePasswordActivity::class.java))
//        }
//    }
//
//    private fun init(){
//        profileLogOutButton = findViewById(R.id.profileLogOutButton)
//        profileChangePasswordButton = findViewById(R.id.profileChangePasswordButton)
//        profileImageView = findViewById(R.id.profileImageView)
//        profileChangeProfileAvatarButton = findViewById(R.id.profileChangeProfileAvatarButton)
//        profileUsernameTextView = findViewById(R.id.profileUsernameTextView)
//
//        urlEditText = findViewById(R.id.urlEditText)
//        usernameEditText=findViewById(R.id.userNameEditText)

    }
}