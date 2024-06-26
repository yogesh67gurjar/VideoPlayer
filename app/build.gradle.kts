@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    //  hilt
    alias(libs.plugins.hilt)
    id("kotlin-kapt")
}

android {
    namespace = "com.yogesh.videoplayer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.yogesh.videoplayer"
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
        viewBinding = true
    }
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // hilt
    implementation(libs.hilt)
    kapt(libs.hiltCompiler)

    // gson converter
    implementation(libs.gson)

    // lottie
    implementation(libs.lottie)

    // sdp & ssp
    implementation(libs.sdp)
    implementation(libs.ssp)

    // glide
    implementation(libs.glide)

    // exoplayer
    implementation(libs.exoplayer)
    implementation(libs.exoplayerUi)
    implementation(libs.exoplayerDash)
}