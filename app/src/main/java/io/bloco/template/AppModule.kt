package io.bloco.template

import android.content.Context
import android.content.res.Resources
import androidx.preference.PreferenceManager
import com.tfcporciuncula.flow.FlowSharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(
    private val app: App
) {

    @Provides
    fun app() = app

    @Provides
    fun context(): Context = app

    @Provides
    fun resources(): Resources = app.resources

    @Provides
    @Singleton
    fun flowSharedPreferences(context: Context) =
        FlowSharedPreferences(PreferenceManager.getDefaultSharedPreferences(context))
}