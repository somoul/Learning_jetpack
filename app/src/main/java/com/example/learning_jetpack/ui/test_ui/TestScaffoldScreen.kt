package com.example.learning_jetpack.ui.test_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bottombardemo.BarItem
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.navigation.NavGraph.Companion.findStartDestination

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.bottombardemo.NavRoutes


@Composable
fun TestScaffold() {
//    val bottomNavItems = listOf(
//        BottomNavItem(
//            name = "Home",
//            route = "home",
//            icon = Icons.Rounded.Home,
//        ),
//        BottomNavItem(
//            name = "Create",
//            route = "add",
//            icon = Icons.Rounded.AddCircle,
//        ),
//        BottomNavItem(
//            name = "Settings",
//            route = "settings",
//            icon = Icons.Rounded.Settings,
//        ),
//    ) val bottomNavItems = listOf(
//        BottomNavItem(
//            name = "Home",
//            route = "home",
//            icon = Icons.Rounded.Home,
//        ),
//        BottomNavItem(
//            name = "Create",
//            route = "add",
//            icon = Icons.Rounded.AddCircle,
//        ),
//        BottomNavItem(
//            name = "Settings",
//            route = "settings",
//            icon = Icons.Rounded.Settings,
//        ),
//    )
    val navController = rememberNavController()
    val context = LocalContext.current

    Scaffold(

        Modifier.background(Color.White),
        topBar ={
            TopAppBar(

                title = {Text("Home", style = TextStyle(Color.White,),  fontSize = 18.sp)},

                navigationIcon = {
                    IconButton(onClick = {
//                        Toast.makeText(context, "Navigation Icon Click", Toast.LENGTH_SHORT)
//                            .show()
                    }) {
                        Icon(imageVector = Icons.Filled.Menu, contentDescription = "Navigation icon", tint = Color.White)
                    }},
                actions = {
                          IconButton(onClick = { /*TODO*/ }) {
                              Icon(imageVector = Icons.Filled.Add, contentDescription = "" , tint = Color.White)

                          }

                }



                ,backgroundColor = Color.Blue)



        },
//        content = { NavigationHost(navController = navController) },
        bottomBar = { BottomNavigationBar(navController = navController)}




    ) {

           Box(
               Modifier
                   .background(Color.White)
                   .fillMaxHeight()
                   .fillMaxWidth()) {
               Column() {
                   Text(text = "One")
                   Text(text = "Two")
               }
           }

    }

}
//package com.example.bottombardemo


object NavBarItems {
    val BarItems = listOf(
        BarItem(
            title = "Home",
            image = Icons.Filled.Home,
            route = "home"
        ),
        BarItem(
            title = "Contacts",
            image = Icons.Filled.Face,
            route = "contacts"
        ),
        BarItem(
            title = "Favorites",
            image = Icons.Filled.Favorite,
            route = "favorites"
        )
    )
}

@Composable
fun Home() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Icon(
            imageVector = Icons.Filled.Home,
            contentDescription = "home",
            tint = Color.Blue,
            modifier = Modifier.size(150.dp)
                .align(Alignment.Center)
        )
    }
}


@Composable
fun Contacts() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Icon(
            imageVector = Icons.Filled.Face,
            contentDescription = "contacts",
            tint = Color.Blue,
            modifier = Modifier.size(150.dp)
                .align(Alignment.Center)
        )
    }
}

@Composable
fun Favorites() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Icon(
            imageVector = Icons.Filled.Favorite,
            contentDescription = "favorites",
            tint = Color.Blue,
            modifier = Modifier.size(150.dp)
                .align(Alignment.Center)
        )
    }
}

@Composable
fun MainScreen() {

    val navController = rememberNavController()
}

@Composable
fun NavigationHost(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = NavRoutes.Home.route,
    ) {
        composable(NavRoutes.Home.route) {
            Home()
        }

        composable(NavRoutes.Contacts.route) {
            Contacts()
        }

        composable(NavRoutes.Favorites.route) {
            Favorites()
        }
    }
}
@Composable
fun BottomNavigationBar(navController: NavHostController) {

    BottomNavigation {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route

        NavBarItems.BarItems.forEach { navItem ->

            BottomNavigationItem(
                selected = currentRoute == navItem.route,
                onClick = {
                    navController.navigate(navItem.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },

                icon = {
                    Icon(imageVector = navItem.image,
                        contentDescription = navItem.title)
                },
                label = {
                    Text(text = navItem.title)
                },
            )
        }
    }
}


