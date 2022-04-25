package com.github.magiczhendong.toolsdemo.services

import com.intellij.openapi.project.Project
import com.github.magiczhendong.toolsdemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
