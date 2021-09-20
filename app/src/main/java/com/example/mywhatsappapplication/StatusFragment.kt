package com.example.mywhatsappapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class StatusFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       var root = inflater.inflate(R.layout.status_fragment, container, false)

        return root
    }

    }

//launch a file picker, select an image and display it on an image view