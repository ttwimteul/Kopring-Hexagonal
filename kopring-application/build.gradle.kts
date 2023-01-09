plugins {
    kotlin("plugin.allopen") version "1.6.21"
}

dependencies {

    implementation(project(":kopring-domain"))

    implementation("org.springframework:spring-tx:6.0.3")
}

allOpen {
    annotation("com.example.kopring.global.annotation.UseCase")
    annotation("con.example.kopring.global.annotation.ReadOnlyUseCase")
}
