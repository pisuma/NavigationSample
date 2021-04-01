package com.example.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class StartFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //NavHostの取得
        val navHostFragment =
            requireActivity().supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        // NavControllerの取得
        val navController = navHostFragment.navController

        //アクションオブジェクトの生成
        val action = StartFragmentDirections.actionStartFragmentToFirstFragment(nameForConfirm = "3")

        val contentsInputCheck = view.findViewById<Button>(R.id.firstButton)
        contentsInputCheck.setOnClickListener { navController.navigate(action) }

        val characterCheck = view.findViewById<Button>(R.id.secondButton)

        val secondAction = StartFragmentDirections.actionStartFragmentToSecondFragment()

        characterCheck.setOnClickListener { navController.navigate(secondAction) }





    }
}