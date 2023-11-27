package com.example.todo.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.todo.data.models.Priority
import com.example.todo.ui.theme.LARGE_PADDING
import com.example.todo.ui.theme.PRIORITY_INDICATOR_SIZE
import com.example.todo.ui.theme.Typography

@Composable
fun PriorityItem(priority: Priority) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Canvas(modifier = Modifier.size(PRIORITY_INDICATOR_SIZE)) {
            drawCircle(color = priority.color)
        }
        Text(
            modifier = Modifier.padding(LARGE_PADDING),
            text = priority.name,
            style = Typography.titleSmall,
            color = MaterialTheme.colorScheme.onSurface
            )
    }
}

@Composable
@Preview
fun priorityItemPreview() {
        PriorityItem(priority = Priority.MEDIUM)
}