package com.example.quest_pertemuan6.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.quest_pertemuan6.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<String> = listof("Laki-laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold(modifier=Modifier,
        {
                    TopAppBar(
                        title = {Text(stringResource(R.string.home), color = Color.White)},
                        colors = TopAppBarDefaults.mediumTopAppBarColors(
                            colorResource(R.color.teal_700))
                    )}
    ) {

    }
}