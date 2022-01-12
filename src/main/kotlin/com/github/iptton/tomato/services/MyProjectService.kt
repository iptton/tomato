package com.github.iptton.tomato.services

import com.intellij.openapi.project.Project
import com.github.iptton.tomato.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
