# Calorie Tracker
Calorie Tracker is a fully functional food tracker, built with Kotlin and Jetpack Compose. It allows user to enter personal information (age, height, etc...) and track food accordingly to their nutrient goals.

## Technology stack
### Core:
- Kotlin
- Jetpack Compose
- Android SDK
- Clean Architecture
- MVVM
- Multi-module architecture
### Network:
- Retrofit
- Moshi
### Database:
- Room
- SQLite
### Build:
- Gradle Kotlin DSL
### Testing:
- Unit-tests + mockk
- Integration tests + MockWebServer
- Automated E2E tests + Fakes

## Onboarding
Onboarding contains eight screens collecting personal information used to calculate nutrient goals. Here are some of them:

![screenshots_onboarding](https://user-images.githubusercontent.com/116557489/224476229-b0258257-9e07-42e2-8446-54d4cb0bbf82.png)

## Tracker Overview Screen and Search Screen

![screenshots_tracker](https://user-images.githubusercontent.com/116557489/224476862-bfab9a15-127b-4f7e-ada1-ca342c8fb164.png)

## Additional Information
This app is an implementation of [Philipp Lackner](https://www.youtube.com/@PhilippLackner) course "[Building Industry-Level Apps With Multi-Module Architecture](https://pl-coding.com/multi-module-course)".
