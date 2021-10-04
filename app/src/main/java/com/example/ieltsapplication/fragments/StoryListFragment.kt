package com.example.ieltsapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsapplication.R
import com.example.ieltsapplication.adapter.StoryAdapter
import com.example.ieltsapplication.databinding.FragmentStoryListBinding
import com.example.ieltsapplication.model.Details


class StoryListFragment : Fragment() {

    private var _binding : FragmentStoryListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_story_list, container, false)

        _binding = FragmentStoryListBinding.inflate(inflater,container, false)
        val view = binding.root

        val recyclerV = binding.recyclerRv2

        recyclerV.layoutManager = LinearLayoutManager(activity)

        val details = ArrayList<Details>()
        details.add(
            Details("The Cactus-by O. Henry", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia,\n" +
                    "molestiae quas vel sint commodi repudiandadie consequuntur voluptatum laborum\n" +
                    "numquam blanditiis harum quisquam eius sed ot fugiat iusto fuga praesentium\n" +
                    "optio, eaque rerum! Provident similique accusantium nemo autem.", R.drawable.ic_readbook)
        )
        details.add(
            Details("Function of dancing", "The highest level of security of Atra Asset Holdings platform's resources" +
                    " is ensured by strict compliance with the set of the following measures.\n" +
                    "\n" + "The company's resources allocated towards operations on the cryptocurrency market are under full and direct " +
                    "control of the RISK MANAGEMENT DEPARTMENT.\n" +
                    "\n" + "Resources of the company are deposited in a multi-signature cold storage wallets and a segregated Accounts.\n" +
                    "\n" + "The COMPLIANCE and SECURITY DEPARTMENT protects Astra Asset Holdings platform's resources from any fraud, " +
                    "industrial espionage and other types of electronic or physical threats or attacks.\n", R.drawable.ic_readbook)
        )
        details.add(
            Details("The Cactus-by O. Henry", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia,\n" +
                    "molestiae quas vel sint commodi repudiandadie consequuntur voluptatum laborum\n" +
                    "numquam blanditiis harum quisquam eius sed ot fugiat iusto fuga praesentium\n" +
                    "optio, eaque rerum! Provident similique accusantium nemo autem.", R.drawable.ic_readbook)
        )
        details.add(
            Details("Function of dancing", "The highest level of security of Atra Asset Holdings platform's resources" +
                    " is ensured by strict compliance with the set of the following measures.\n" +
                    "\n" + "The company's resources allocated towards operations on the cryptocurrency market are under full and direct " +
                    "control of the RISK MANAGEMENT DEPARTMENT.\n" +
                    "\n" + "Resources of the company are deposited in a multi-signature cold storage wallets and a segregated Accounts.\n" +
                    "\n" + "The COMPLIANCE and SECURITY DEPARTMENT protects Astra Asset Holdings platform's resources from any fraud, " +
                    "industrial espionage and other types of electronic or physical threats or attacks.\n", R.drawable.ic_readbook)
        )
        details.add(
            Details("The Cactus-by O. Henry", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia,\n" +
                    "molestiae quas vel sint commodi repudiandadie consequuntur voluptatum laborum\n" +
                    "numquam blanditiis harum quisquam eius sed ot fugiat iusto fuga praesentium\n" +
                    "optio, eaque rerum! Provident similique accusantium nemo autem.", R.drawable.ic_readbook)
        )
        details.add(
            Details("Function of dancing", "The highest level of security of Atra Asset Holdings platform's resources" +
                    " is ensured by strict compliance with the set of the following measures.\n" +
                    "\n" + "The company's resources allocated towards operations on the cryptocurrency market are under full and direct " +
                    "control of the RISK MANAGEMENT DEPARTMENT.\n" +
                    "\n" + "Resources of the company are deposited in a multi-signature cold storage wallets and a segregated Accounts.\n" +
                    "\n" + "The COMPLIANCE and SECURITY DEPARTMENT protects Astra Asset Holdings platform's resources from any fraud, " +
                    "industrial espionage and other types of electronic or physical threats or attacks.\n", R.drawable.ic_readbook)
        )
        details.add(
            Details("The Cactus-by O. Henry", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia,\n" +
                    "molestiae quas vel sint commodi repudiandadie consequuntur voluptatum laborum\n" +
                    "numquam blanditiis harum quisquam eius sed ot fugiat iusto fuga praesentium\n" +
                    "optio, eaque rerum! Provident similique accusantium nemo autem.", R.drawable.ic_readbook)
        )
        details.add(
            Details("Function of dancing", "The highest level of security of Atra Asset Holdings platform's resources" +
                    " is ensured by strict compliance with the set of the following measures.\n" +
                    "\n" + "The company's resources allocated towards operations on the cryptocurrency market are under full and direct " +
                    "control of the RISK MANAGEMENT DEPARTMENT.\n" +
                    "\n" + "Resources of the company are deposited in a multi-signature cold storage wallets and a segregated Accounts.\n" +
                    "\n" + "The COMPLIANCE and SECURITY DEPARTMENT protects Astra Asset Holdings platform's resources from any fraud, " +
                    "industrial espionage and other types of electronic or physical threats or attacks.\n", R.drawable.ic_readbook)
        )
        details.add(
            Details("The Cactus-by O. Henry", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia,\n" +
                    "molestiae quas vel sint commodi repudiandadie consequuntur voluptatum laborum\n" +
                    "numquam blanditiis harum quisquam eius sed ot fugiat iusto fuga praesentium\n" +
                    "optio, eaque rerum! Provident similique accusantium nemo autem.", R.drawable.ic_readbook)
        )


        val adapter = StoryAdapter(details)
        recyclerV.adapter = adapter


        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}