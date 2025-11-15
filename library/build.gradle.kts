plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
  id("com.vanniktech.maven.publish") version "0.34.0"
}

android {
  namespace = "io.github.chinavolvocars.example.library"
  compileSdk {
    version = release(36)
  }

  defaultConfig {
    minSdk = 25

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    consumerProguardFiles("consumer-rules.pro")
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro",
      )
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }
  kotlinOptions {
    jvmTarget = "11"
  }
}

dependencies {
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.appcompat)
  implementation(libs.material)
  testImplementation(libs.junit)
  androidTestImplementation(libs.androidx.junit)
  androidTestImplementation(libs.androidx.espresso.core)
}

group = "io.github.chinavolvocars"
version = "0.0.1"

mavenPublishing {
  publishToMavenCentral()
  signAllPublications()

  coordinates(group.toString(), "library", version.toString())

  pom {
    name = "library"
    description = "A library."
    inceptionYear = "2025"
    url = "https://github.com/ChinaVolvocars/library/"
    licenses {
      license {
        name = "The Apache License, Version 2.0"
        url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
        distribution = "https://www.apache.org/licenses/LICENSE-2.0.txt"
      }
    }
    developers {
      developer {
        id = "atlantis"
        name = "Android Developer Atlantis"
        url = "https://github.com/ChinaVolvocars/"
      }
    }
    scm {
      url = "https://github.com/ChinaVolvocars/library/"
      connection = "scm:git:git://github.com/ChinaVolvocars/library.git"
      developerConnection = "scm:git:ssh://git@github.com/ChinaVolvocars/library.git"
    }
  }
}



