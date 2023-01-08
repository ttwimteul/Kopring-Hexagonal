plugins {
    kotlin("jvm") version "1.7.22"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
        version = "1.6.21"
    }

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    }
}


tasks {
    compileKotlin {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "17"
        }
    }

    compileJava {
        sourceCompatibility = JavaVersion.VERSION_17.majorVersion
    }

    test {
        useJUnitPlatform()
    }
}

repositories {
    mavenCentral()
}