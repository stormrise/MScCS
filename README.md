# The Mobile MSc (CS)
> This is a course project for COMP7506
 
> @Copyright by:
>  
>Li, Lingxiao
>
>Wang, Xichen

>Xiong, Shanyu


# Introduction 

MSc-CS program information based on https://www.msc-cs.hku.hk/

The Mobile MSc (CS) is an Android-based application for phones, which contains information about MSc (CS) programme. It was developed using Android Studio with a minimum API 24 and tested on the “Pixel 2 XL API 28” Android Virtual Device, also the Android phone ”XIAOMI MIX2”. 

![图片 1.png](https://i.loli.net/2018/12/01/5c022e1601573.png)



# Build

## Dependencies
compileSdkVersion 28

minSdkVersion 24

targetSdkVersion 28



Add following dependencies into `build.gradle`:
``` groovy
dependencies {
    implementation 'com.android.support:design:28.0.0'
    implementation 'com.android.support:support-v4:28.0.0'
    implementation 'com.github.bumptech.glide:glide:4.8.0'
    implementation 'com.github.huangyanbin:SmartTable:2.2.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.8.0'
    implementation 'org.jsoup:jsoup:1.11.3'
    implementation 'com.android.support:cardview-v7:28.0.0'
    implementation 'com.android.support:recyclerview-v7:28.0.0'
    implementation 'cn.bingoogolapple:bga-banner:2.2.5'
    implementation 'com.android.support:gridlayout-v7:28.0.0'
}
```


## Build with Gradle

Use latest Android Studio 3.2.1 and gradle 4.6 (Time: Nov 2018)

## Install it into the AVD

Choose the Piexl 2 XL as the AVD, because the larger screen is the trend, and provide better view for this app.



# Main features

## A navigation bar
 The navigation bar contains four items about Programme Information, Admission, Curriculum and Other. Each item can lead visitor to a related page.
 
 ![图片 1.png](https://i.loli.net/2018/12/01/5c022e1601573.png)


## Flat display using by cardview
Each cardview contains image with introduction, and every of them is link to a page that contains related information for visitors to consult.

![图片 2.png](https://i.loli.net/2018/12/01/5c022e1607146.png)

## ToolBar help buttons
On the top right corner of the app, we set three buttons to provide contact information about the MSc Programme Office.  Users can directly give a phone call, send an email or mail to the office if they want to get connect with the programme office.

![图片 3.png](https://i.loli.net/2018/12/01/5c022e160421c.png)

#Extra Feature
we add a new page that contains the comparisons between CS major in different universities in Hong Kong to help visitors to choose their universities and get more information about those majors.

![图片 4.png](https://i.loli.net/2018/12/01/5c022e15f2d1a.png)

