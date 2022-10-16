package ru.tyryshkin.four.buildsrc

object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.androidGradlePlugin}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradlePlugin}" }
}

object Libs {

    object Core {
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleKtx}"
    }

    object Compose {
        const val activity ="androidx.activity:activity-compose:${Versions.compose}"
        const val ui = "androidx.compose.ui:ui:${Versions.compose}"
        const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
        const val material = "androidx.compose.material:material:${Versions.compose}"
        const val tooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
        const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
        const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
    }

    object Test {
        const val core = "junit:junit:${Versions.testCore}"
        const val JUnit = "junit:junit:${Versions.testJUnit}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.testEspresso}"
        const val ui = "androidx.compose.ui:ui-test-junit4:${Versions.testCompose}"
        const val uiManifest = "androidx.compose.ui:ui-test-manifest:${Versions.testCompose}"
    }
}