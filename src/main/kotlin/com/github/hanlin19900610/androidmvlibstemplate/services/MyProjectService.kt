package com.github.hanlin19900610.androidmvlibstemplate.services

import com.intellij.openapi.project.Project
import com.github.hanlin19900610.androidmvlibstemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
