buildscript {



    repositories {
        google()
        mavenCentral()
        maven {url = uri("https://www.jitpack.io" ) }


        dependencies {



            classpath("com.android.tools.build:gradle:7.4.2")
            classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
            classpath("com.google.gms:google-services:4.4.1")

            //safe args
            classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
            classpath("com.google.dagger:hilt-android-gradle-plugin:2.44")

        }
    }
// Top-level build file where you can add configuration options common to all sub-projects/modules.

}
