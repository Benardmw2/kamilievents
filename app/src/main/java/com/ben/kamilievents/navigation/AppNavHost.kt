package com.ben.kamilievents.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ben.kamilievents.ui.theme.screens.AddProduct.AddProductsScreen
import com.ben.kamilievents.ui.theme.screens.cart.ViewScreen
import com.ben.kamilievents.ui.theme.screens.events.ViewProductsScreen
import com.ben.kamilievents.ui.theme.screens.home.Home
import com.ben.kamilievents.ui.theme.screens.login.Login
import com.ben.kamilievents.ui.theme.screens.register.Register
import com.ben.kamilievents.ui.theme.screens.update.UpdateProductsScreen

@Composable
fun AppNavHost(modifier: Modifier,navController: NavHostController = rememberNavController(),startDestination: String= ROUTE_LOGIN) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_HOME){
            Home(navController )
        }
        composable(ROUTE_LOGIN){
            Login(navController )
        }
        composable(ROUTE_REGISTER){
            Register(navController)
        }
        composable(ROUTE_EVENT){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_CART){
            ViewScreen(navController)
        }
        composable(ROUTE_ADD){
            AddProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
    }
}