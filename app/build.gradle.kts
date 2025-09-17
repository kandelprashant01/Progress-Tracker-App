plugins {
<<<<<<< HEAD
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.aurafit"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.aurafit"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
=======
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.kfit"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.kfit"
        minSdk = 28
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

>>>>>>> 462d21dd12505b70f8220605ea534d7c18240e2a
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
<<<<<<< HEAD

    // AGP 8.5.x uses JDK 17. Set Java/Kotlin to 17 (recommended).
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }

    buildFeatures {
        viewBinding = true
        dataBinding = false   // leave OFF unless you really use it
=======
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
>>>>>>> 462d21dd12505b70f8220605ea534d7c18240e2a
    }
}

dependencies {
<<<<<<< HEAD
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}
=======

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
>>>>>>> 462d21dd12505b70f8220605ea534d7c18240e2a
