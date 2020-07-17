package com.example.newtonapp

import androidx.navigation.NavController
import com.example.comms.presentation.BlankNavigator
import com.example.comms.presentation.CommsNavigator
import com.example.login.presentation.LoginNavigator

class Navigator : LoginNavigator, CommsNavigator,
    BlankNavigator {

    private var navController: NavController? = null

    override fun loginToBlank() {
        navController?.navigate(R.id.action_loginFragment_to_blankFragment2)
    }

    override fun commsToBlank() {
        navController?.navigate(R.id.action_commsFragment_to_blankFragment)
//        navController?.navigate(R.id.action)
    }

    override fun blankToComms() {
        navController?.navigate(R.id.action_blankFragment_to_commsFragment)
    }

    fun bind(navController: NavController) {
        this.navController = navController
    }

    fun unbind() {
        navController = null
    }
}