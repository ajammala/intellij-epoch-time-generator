package com.github.ajammala.intellijepochtimegenerator.services

import com.intellij.openapi.project.Project
import com.github.ajammala.intellijepochtimegenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
