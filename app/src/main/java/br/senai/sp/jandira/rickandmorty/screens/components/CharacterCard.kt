package br.senai.sp.jandira.rickandmorty.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.rickandmorty.R
import coil.compose.AsyncImage

@Composable
fun CharacterCard(
    name: String = "Sem nome",
    species: String = "Sem specie",
    status: String = "Sem Status",
    imageCard: String

){
    Card(
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth()
            .height(110.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(color = 0xFF151414)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card (
                modifier = Modifier
                    .padding(start = 8.dp)
                    .size(100.dp),
                shape = CircleShape
            ) {
                AsyncImage(
                    model = imageCard,
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = name, fontSize = 20.sp, color = Color.Green ,fontWeight = FontWeight.Bold)
                Text(text = species, fontSize = 15.sp,color = Color.White)
                Text(text = status,fontSize = 15.sp,color = Color.White, fontWeight = FontWeight.Thin)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun CharacterCardPreview(){
    CharacterCard(
        name = "Characters Name",
        species = "Human",
        status = "alive",
        imageCard  = ""
    )
}