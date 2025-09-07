package com.android.mvvm_learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.android.mvvm_learning.ui.theme.MVVMlearningTheme
import com.android.mvvm_learning.view.HomePage
import com.android.mvvm_learning.viewmodel.HomeViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val homeViewModel = ViewModelProvider(this) [HomeViewModel:: class]
        enableEdgeToEdge()
        setContent {
            MVVMlearningTheme {

                HomePage(modifier = Modifier, homeViewModel)
            }
        }
    }
}

