plugins {
    id("com.android.application")
    id ("kotlin-android")
    id ("kotlin-parcelize")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id ("androidx.navigation.safeargs.kotlin")
    id ("dagger.hilt.android.plugin")


}


android {
    namespace = "com.example.jocene"
    compileSdk = 34


    defaultConfig {
        applicationId = "com.example.jocene"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"


        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding {
            enable = true }
    }

}


dependencies {


    implementation ("androidx.core:core-ktx:1.12.0")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.google.android.material:material:1.11.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.7")
    implementation("androidx.gridlayout:gridlayout:1.0.0")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation ("me.relex:circleindicator:1.3.2")
    implementation ("me.relex:circleindicator:2.1.6")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.7")
    implementation ("com.github.mhwan:CircleIndicatorLibrary:0.1")

    // https://mvnrepository.com/artifact/br.com.simplepass/loading-button-android
    implementation("br.com.simplepass:loading-button-android:2.2.0")


    //noinspection GradleCompatible
    implementation("com.android.support:palette-v7:28.0.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("com.android.support:support-annotations:28.0.0")

    testImplementation ("junit:junit:4.+")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")

    //intuit
    implementation ("com.intuit.sdp:sdp-android:1.1.0")
    implementation ("com.intuit.ssp:ssp-android:1.0.6")


    //loading button
    implementation ("br.com.simplepass:loading-button-android:2.2.0")
    implementation("com.github.leandroborgesferreira:loading-button-android:2.3.0")

    // https://mvnrepository.com/artifact/com.android.application/com.android.application.gradle.plugin
    implementation("com.android.application:com.android.application.gradle.plugin:8.2.2")


    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-inappmessaging:20.4.0")
    implementation("com.google.firebase:firebase-auth:22.3.1")
    implementation("com.google.firebase:firebase-firestore-ktx:24.10.2")
    implementation("com.google.firebase:firebase-storage-ktx:20.3.0")
    implementation("com.google.android.gms:play-services-auth:21.0.0")
    implementation("androidx.navigation:navigation-runtime-ktx:2.7.7")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")
    implementation("android.arch.navigation:navigation-ui-ktx:1.0.0")
    implementation("android.arch.navigation:navigation-fragment-ktx:1.0.0")
    implementation("com.google.firebase:firebase-firestore:24.10.2")
    //noinspection GradleCompatible
    implementation("com.android.support:appcompat-v7:28.0.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")



        //google play services
        implementation ("com.google.android.gms:play-services-auth:21.0.0")

        //smooth bar
        implementation ("com.github.ibrahimsn98:SmoothBottomBar:1.7.9")

        //Glide
        implementation ("com.github.bumptech.glide:glide:4.13.0")


        // Import the Firebase BoM
        implementation(platform("com.google.firebase:firebase-bom:32.7.1"))

        // Firebase
        implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
        implementation ("com.google.firebase:firebase-firestore:24.10.2")
        implementation ("com.google.firebase:firebase-firestore-ktx:24.10.2")
        implementation ("com.google.firebase:firebase-auth-ktx:22.3.1")
        implementation ("com.google.firebase:firebase-storage")
        implementation ("com.google.firebase:firebase-storage-ktx:20.3.0")
        implementation ("com.google.firebase:firebase-common-ktx:20.4.2")
        implementation ("com.google.firebase:firebase-messaging-ktx:23.4.1")
        implementation ("com.firebaseui:firebase-ui-auth:4.3.2")



    //Firebase coroutines
        implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.7.3")


    // When using the BoM, don't specify versions in Firebase dependencies
        implementation("com.google.firebase:firebase-analytics")

        //circular image
        implementation ("de.hdodenhof:circleimageview:3.1.0")

        //Navigation and safe args
        implementation ("androidx.navigation:navigation-fragment-ktx:2.7.7")
        implementation ("androidx.navigation:navigation-ui-ktx:2.7.7")

        //viewpager2 indicator
        implementation ("io.github.vejei.viewpagerindicator:viewpagerindicator:1.0.0-alpha.1")

        //lifecycle
        implementation ("android.arch.lifecycle:extensions:1.1.1")

        //Firebase coroutines
        implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.7.3")

        //stepView
        implementation ("com.shuhart.stepview:stepview:1.5.1")

        implementation ("com.github.shuhart:stepview:1.5.1")
        //Android Ktx
        implementation ("androidx.fragment:fragment-ktx:1.6.2")

        implementation ("com.github.dmytrodanylyk:circular-progress-button:1.0.0")


        implementation ("com.intuit.sdp:sdp-android:1.1.0")


        //Dagger hilt
        implementation ("com.google.dagger:hilt-android:2.38.1")
        implementation("com.google.dagger:hilt-compiler")


    // Add the dependencies for any other desired Firebase products
        // https://firebase.google.com/docs/android/setup#available-libraries

}
