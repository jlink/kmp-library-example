plugins {
    kotlin("multiplatform") version "2.0.20"
    kotlin("plugin.power-assert") version "2.0.20"
}

group = "org.example.kmpLibExample"
version = "1.0-SNAPSHOT"

kotlin {
    jvm() {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
    }

    js(IR) {
//        browser()
        nodejs()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.1")
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
//                implementation(kotlin("test-junit"))
            }
        }
    }
}
