package com.dipu.swiggy_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.dipu.swiggy_clone.fragment.AccountFragment
import com.dipu.swiggy_clone.fragment.CartFragment
import com.dipu.swiggy_clone.fragment.HomeFragment
import com.dipu.swiggy_clone.fragment.SearchFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val accountFragment=AccountFragment()
        val cartFragment=CartFragment()
        val homeFragment=HomeFragment()
        val searchFragment=SearchFragment()

        setCurrentFragment(homeFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
        when(it.itemId){
            R.id.home->setCurrentFragment(homeFragment)
            R.id.search->setCurrentFragment(searchFragment)
            R.id.cart->setCurrentFragment(cartFragment)
            R.id.account->setCurrentFragment(accountFragment)

        }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
        replace(R.id.flFragment,fragment)
        commit()
    }



}