package com.ben.kamilievents.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.ben.kamilievents.navigation.ROUTE_ADD
import com.ben.kamilievents.navigation.ROUTE_CART
import com.ben.kamilievents.navigation.ROUTE_EVENT
import com.ben.kamilievents.navigation.ROUTE_LOGIN

@Composable
fun Home(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var context = LocalContext.current

        Text(
            text = "Welcome to Home page",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = { navController.navigate(ROUTE_EVENT)

        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Services")
        }
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = { navController.navigate(ROUTE_CART)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Go to Cart")
        }
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = { navController.navigate(ROUTE_ADD)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Add service")
        }
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = { navController.navigate(ROUTE_LOGIN)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Logout")
        }
    }
}