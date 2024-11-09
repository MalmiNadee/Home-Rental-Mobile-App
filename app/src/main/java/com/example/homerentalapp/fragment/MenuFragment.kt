package com.example.homerentalapp.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.homerentalapp.R
import com.example.homerentalapp.screens.Home2Activity
import com.example.homerentalapp.screens.LoginActivity


class MenuFragment : Fragment() {

    private lateinit var  logout: Button
    private lateinit var  back: Button




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_menu, container, false)
        logout = view.findViewById(R.id.button17)
        logout.setOnClickListener {
            val intent = Intent(requireContext(),LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(requireContext(), "Logout Successfully!", Toast.LENGTH_SHORT).show()
            requireActivity().finish()
        }
        back = view.findViewById(R.id.button18)
        back.setOnClickListener {
            val intent = Intent(requireContext(),Home2Activity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }


        return view
    }



}