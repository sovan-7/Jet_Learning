package com.example.jetlearning

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(heightDp = 500)
@Composable
fun previewItem(){
//    Column (modifier = Modifier.verticalScroll(rememberScrollState())){
//getCategoryList().map {item->
//    blogCategory(image = item.image, title = item.title, subtitle =item.subtitle )
//
//}
//    }
LazyColumn(content = {
    items(getCategoryList()){item->
        blogCategory(
            image = item.image,     // replace with your actual image field
            title = item.title, // replace with actual title property
            subtitle = item.subtitle // replace with actual subtitle property
        )
    }
})
}
@Composable
fun blogCategory(image:Int,title:String,subtitle:String){
    Card (elevation =CardDefaults.cardElevation(defaultElevation = 8.dp), modifier = Modifier.padding( 8.dp)){
Row (verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier.padding(8.dp)){
    Image(painter = painterResource(id =  image), contentDescription = "",
        modifier = Modifier
            .size(48.dp)
            .padding(8.dp)
            .weight(0.2f))
    itemDescription(title,subtitle, modifier = Modifier.weight(0.8f))
}
    }
}
@Composable
fun itemDescription(title:String,subTitle:String,modifier: Modifier){
    Column (modifier = modifier){
Text(text = title, style = MaterialTheme.typography.headlineSmall)
        Text(text = subTitle, style = MaterialTheme.typography.labelSmall,
            fontWeight = FontWeight.Thin)

    }
}
data class Category(val image:Int,val title: String,val subtitle: String)
fun getCategoryList():MutableList<Category>{
    val list= mutableListOf<Category>()
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    list.add(Category(R.drawable.user,"Programming","Learn Different Language"))
    return list
}