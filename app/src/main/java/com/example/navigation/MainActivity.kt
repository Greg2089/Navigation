package com.example.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //нахожу MaterialToolbar
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        /**Настройка toolbar, чтобы она включала кнопку Up, и отображала, к какому экрану перешли*/

        //1 способ
          /*получение ссылки на navigation controller из navigation host*/
          val navHostFragment =
              supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
          val navController = navHostFragment.navController

          /**Создаем конфигурацию, которая связывает toolbar c navigation graph*/
          val builder = AppBarConfiguration.Builder(navController.graph)
          val appBarConfiguration = builder.build()
          /** Строка отвечает за конфигурацию на toolbar*/
          toolbar.setupWithNavController(navController, appBarConfiguration)

        //2 способ
       /* setupActionBarWithNavController(findNavController(R.id.fragment_container_view))
    }

    override fun onSupportNavigateUp(): Boolean {
        val controller = findNavController(R.id.fragment_container_view)
        return controller.navigateUp() || super.onSupportNavigateUp()*/
    }

}