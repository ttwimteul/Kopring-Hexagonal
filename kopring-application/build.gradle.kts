plugins {
    kotlin("plugin.allopen") version "1.6.21"
    id("org.springframework.boot") version "3.0.0"
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("plugin.spring") version "1.7.22"
}

dependencies {

    implementation(project(":kopring-domain"))

    implementation("org.springframework:spring-tx:6.0.3")

    implementation("org.springframework.boot:spring-boot-starter-web")
}

allOpen {
    annotation("com.example.kopring.global.annotation.UseCase")
    annotation("con.example.kopring.global.annotation.ReadOnlyUseCase")
}
