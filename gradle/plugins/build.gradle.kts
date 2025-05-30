plugins { `kotlin-dsl` }

repositories { gradlePluginPortal() }

dependencies {
    implementation("com.autonomousapps:dependency-analysis-gradle-plugin:2.15.0")
    implementation("com.diffplug.spotless:spotless-plugin-gradle:7.0.3")
    implementation("com.gradle:develocity-gradle-plugin:4.0")
    implementation("io.fuchs.gradle.classpath-collision-detector:classpath-collision-detector:1.0.0")
    implementation("org.cyclonedx:cyclonedx-gradle-plugin:2.2.0")
    implementation("org.gradlex:jvm-dependency-conflict-resolution:2.2")
}

testing.suites.named<JvmTestSuite>("test") {
    useJUnitJupiter()
    dependencies {
        implementation("org.junit.jupiter:junit-jupiter-params")
        implementation("org.assertj:assertj-core:3.27.3")
    }
}
