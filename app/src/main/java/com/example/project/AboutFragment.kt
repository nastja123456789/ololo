package com.example.p

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.project.ContactFragment
import com.example.project.R
import com.google.android.material.button.MaterialButton

class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        var orientation = RecyclerView.VERTICAL
//        var spanCount = 1
//
//        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewFinishWork)
//        val layoutManager = GridLayoutManager(requireContext(), spanCount, orientation, false)
        val buttonReset = view.findViewById<MaterialButton>(R.id.registrationButtonFrag1)
        buttonReset.setOnClickListener() {
            val contactFragment = ContactFragment()
            val bundle = Bundle()
            contactFragment.arguments = bundle
            makeCurrentFragmentInMainWindow(contactFragment, "descriptionFragment")
        }

    }

    private fun makeCurrentFragmentInMainWindow(fragment: Fragment, name: String) {
        fragmentManager?.beginTransaction()?.apply {
            replace(R.id.main_fragmnet, fragment)
            addToBackStack(name.toString())
            commit()
        }
    }

    }