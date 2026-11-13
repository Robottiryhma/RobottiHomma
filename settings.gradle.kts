pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        google()
        mavenCentral()

        maven {
            url = uri("https://jitpack.io")
        }

        maven {
            url = uri(
                "https://bluefrogrobotics.jfrog.io/artifactory/bluefrogrobotics-libs-release-local/"
            )

            credentials {
                username = providers.gradleProperty("maven_user").get()
                password = providers.gradleProperty("maven_password").get()
            }
        }
    }
}

rootProject.name = "BuddyHelloWorld"
include(":app")