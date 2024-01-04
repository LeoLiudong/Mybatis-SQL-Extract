package com.github.leoliudong.mybatissqlextract.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project

class MybatisSQLExtractAction: AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        val project: Project? = event.project
        val editor: Editor? = event.getData(CommonDataKeys.EDITOR)

        if (project == null || editor == null) {
            return
        }

        val selectedText: String? = editor.selectionModel.selectedText
        if (selectedText.isNullOrEmpty()) {
            return
        }

    }
}
