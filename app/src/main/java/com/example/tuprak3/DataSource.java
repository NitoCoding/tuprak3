package com.example.tuprak3;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static List<Data> DataList = generateDataDummy();


    private static List<Data> generateDataDummy(){
        List<Data> statusList = new ArrayList<>();


        statusList.add(new Data("Json Doe", "Postingan pertama", R.drawable.status_image1,R.drawable.status_image1,R.drawable.status_image1,"500","5"));
        statusList.add(new Data("Json Nou", "Postingan pertama", R.drawable.status_image2,R.drawable.status_image2,R.drawable.status_image2,"500","5"));
        statusList.add(new Data("Mike Doe", "Postingan pertama", R.drawable.status_image3,R.drawable.status_image3,R.drawable.status_image3,"500","5"));
        statusList.add(new Data("Koi Nike", "Postingan pertama", R.drawable.status_image4,R.drawable.status_image4,R.drawable.status_image4,"500","5"));
        statusList.add(new Data("Mia Wilson", "Postingan pertama", R.drawable.status_image5, R.drawable.status_image5, R.drawable.status_image5, "1200", "12"));
        statusList.add(new Data("Liam Martinez", "Postingan pertama", R.drawable.status_image6, R.drawable.status_image6, R.drawable.status_image6, "900", "9"));
        statusList.add(new Data("Charlotte Thompson", "Postingan pertama", R.drawable.status_image7, R.drawable.status_image7, R.drawable.status_image7, "800", "7"));
        statusList.add(new Data("Logan Taylor", "Postingan pertama", R.drawable.status_image8, R.drawable.status_image8, R.drawable.status_image8, "1100", "11"));
        statusList.add(new Data("Avery Clark", "Postingan pertama", R.drawable.status_image9, R.drawable.status_image9, R.drawable.status_image9, "950", "10"));
        statusList.add(new Data("Harper Anderson", "Postingan pertama", R.drawable.status_image10, R.drawable.status_image10, R.drawable.status_image10, "850", "8"));

        return statusList;
    }

}
